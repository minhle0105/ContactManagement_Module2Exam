package Behavior;

import java.io.*;
import java.util.ArrayList;
import Entity.Contact;

public class ReadWriteFile {
      private static final String COMMA_DELIMITER = ",";
      private static final String NEW_LINE_SEPARATOR = "\n";
      private static final String FILE_HEADER = "Name,PhoneNumber,Address,Gender,Group";

      public static void writeFile(ArrayList<Contact> contactList, String filePath) {
            File file = new File(filePath);
            FileWriter fileWriter = null;
            try {
                  fileWriter = new FileWriter(file);
                  fileWriter.append(FILE_HEADER);
                  fileWriter.append(NEW_LINE_SEPARATOR);
                  for (Contact c : contactList) {
                        fileWriter.append(c.getName());
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(c.getPhoneNumber());
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(c.getAddress());
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(c.getGender());
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(c.getGroup());
                        fileWriter.append(NEW_LINE_SEPARATOR);
                  }
            } catch (IOException e) {
                  System.out.println("Cannot write CSV");
                  e.printStackTrace();
            } finally {
                  try {
                        fileWriter.flush();
                        fileWriter.close();
                  } catch (IOException e) {
                        System.out.println("Error while flushing/closing fileWriter");
                        e.printStackTrace();
                  }

            }
      }

      public static void readFromFileCsv(String pathFile) {
            try {
                  BufferedReader br = new BufferedReader(new FileReader(pathFile));
                  String line;
                  while ((line = br.readLine()) != null) {
                        String[] cols = line.split(",");
                        if (cols[0].equals("Name")) {
                              System.out.println("Contacts: ");
                        } else {
                              System.out.println("Name: " + cols[0] + ", phoneNumber: " + cols[1] + ", address: "
                                          + cols[2] + ", gender: " + cols[3] + ", group: " + cols[4]);
                        }

                  }
            } catch (IOException ie) {
                  ie.printStackTrace();
            }
      }

      public static ArrayList<Contact> readCSV(String pathFile) {
            try {
                  BufferedReader br = new BufferedReader(new FileReader(pathFile));
                  String line;
                  ArrayList<Contact> contacts = new ArrayList<>();
                  while ((line = br.readLine()) != null) {
                        String[] cols = line.split(",");
                        if (cols[0].equals("Name")) {
                              continue;
                        } else {
                              Contact c = new Contact();
                              c.setName(cols[0]);
                              c.setPhoneNumber(cols[1]);
                              c.setAddress(cols[2]);
                              c.setGender(cols[3]);
                              c.setGroup(cols[4]);
                              contacts.add(c);
                        }
                  }
                  return contacts;
            } catch (IOException io) {
                  io.printStackTrace();
            }
            return null;
      }
}