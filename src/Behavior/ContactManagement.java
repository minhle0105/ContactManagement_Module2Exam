package Behavior;

import java.util.Scanner;

import Entity.Contact;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ContactManagement {
      Scanner sc = new Scanner(System.in);
      ArrayList<Contact> contactList = new ArrayList<>();
      private final String filePath = "contacts.csv";

      public void add(Contact c) {
            contactList = ReadWriteFile.readCSV(filePath);
            contactList.add(c);
            ReadWriteFile.writeFile(contactList, filePath);
            System.out.println("Contact added");
      }

      public void update(String name) {
            contactList = ReadWriteFile.readCSV(filePath);
            int count = 0;
            for (Contact c : contactList) {
                  if (c.getName().equals(name)) {
                        System.out.println("Enter new name");
                        String newName = sc.nextLine();
                        System.out.println("Enter new phone number");
                        String newPhoneNumber = sc.nextLine();
                        System.out.println("Enter new address");
                        String newAdderss = sc.nextLine();
                        System.out.println("Enter new gender");
                        String newGender = sc.nextLine();
                        System.out.println("Enter group");
                        String newGroup = sc.nextLine();
                        c.setName(newName);
                        c.setPhoneNumber(newPhoneNumber);
                        c.setAddress(newAdderss);
                        c.setGender(newGender);
                        c.setGroup(newGroup);
                        count++;
                  }
            }
            if (count == 0) {
                  System.out.println("No contact updated");
            }
            else {
                  System.out.printf("%d contact(s) updated", count);
                  System.out.println();
            }
            ReadWriteFile.writeFile(contactList, filePath);
      }

      public void delete(String name) {
            contactList = ReadWriteFile.readCSV(filePath);
            int count = 0;
            for (int i = 0; i < contactList.size(); i++) {
                  if (contactList.get(i).getName().equals(name)) {
                        contactList.remove(i);
                        count++;
                  }
            }
            if (count == 0) {
                  System.out.println("No contact deleted");
            }
            else {
                  System.out.printf("%d contact(s) deleted", count);
                  System.out.println();
            }
            ReadWriteFile.writeFile(contactList, filePath);
      }

      public void search(String name) {
            contactList = ReadWriteFile.readCSV(filePath);
            for (Contact c : contactList) {
                  if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                        System.out.println(c.toString());
                  }
            }
      }

      public void showAll() {
            contactList = ReadWriteFile.readCSV(filePath);
            for (Contact c : contactList) {
                  System.out.println(c.toString());
            }
      }

      
}
