package View;

import java.util.Scanner;

import Behavior.ContactManagement;
import Entity.Contact;

public class Main {
      static Scanner sc = new Scanner(System.in);
      static ContactManagement cm = new ContactManagement();

      public static void showMenu() {
            System.out.println("--- CHUONG TRINH QUAN LY DANH BA ---");
            System.out.println("Chon chuc nang theo so (de tiep tuc)");
            System.out.println("1. Xem danh sach");
            System.out.println("2. Them moi");
            System.out.println("3. Cap nhat");
            System.out.println("4. Xoa");
            System.out.println("5. Tim kiem");
            System.out.println("6. Doc tu file");
            System.out.println("7. Ghi vao file");
            System.out.println("8. Thoat");
            System.out.print("Chon chuc nang ");
      }

      public static void main(String[] args) {
            try {
                  while (true) {
                        showMenu();
                        int userChoice = Integer.parseInt(sc.nextLine());
                        if (userChoice == 1) {
                              cm.showAll();
                        }
                        else if (userChoice == 2) {
                              System.out.println("_Them moi lien lac_");
                              System.out.println("Nhap ten");
                              String tenLienLac = sc.nextLine();
                              System.out.println("Nhap so dien thoai");
                              String soDienThoai = sc.nextLine();
                              System.out.println("Nhap dia chi");
                              String diaChi = sc.nextLine();
                              System.out.println("Nhap gioi tinh (Male / Female)");
                              String gioiTinh = sc.nextLine();
                              System.out.println("Nhap nhom");
                              String nhom = sc.nextLine();
                              Contact newContact = new Contact(tenLienLac, soDienThoai, diaChi, gioiTinh, nhom);
                              cm.add(newContact);
                        }
                        else if (userChoice == 3) {
                              System.out.println("Nhap ten lien lac de cap nhat");
                              String tenCapNhat = sc.nextLine();
                              cm.update(tenCapNhat);
                        }
                        else if (userChoice == 4) {
                              System.out.println("Nhap ten lien lac de xoa");
                              String tenXoa = sc.nextLine();
                              cm.delete(tenXoa);
                        }
                        else if (userChoice == 5) {
                              System.out.println("Nhap ten lien lac de tim kiem");
                              String tenTimKiem = sc.nextLine();
                              cm.search(tenTimKiem);
                        }
                        else if (userChoice == 6) {
                              System.out.println("Da doc file");
                        }
                        else if (userChoice == 7) {
                              System.out.println("Da ghi file");
                        }
                        else if (userChoice == 8) {
                              System.out.println("Ket thuc chuong trinh");
                              break;
                        }
                        else {
                              System.out.println("Invalid choice, enter again");
                        }
                  }   
            }
            catch (Exception e) {
                  System.out.println("Invalid choice, enter again");
                  e.printStackTrace();
                  showMenu();
            }

      }
}
