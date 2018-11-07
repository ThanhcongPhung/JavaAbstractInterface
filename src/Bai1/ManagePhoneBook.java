package Bai1;

import java.util.Scanner;

public class ManagePhoneBook {
    static void Menu() {
        System.out.println("-----------PHONEBOOK MANAGEMENT SYSTEM----------");
        System.out.println("1.Insert Phone");
        System.out.println("2.Remove Phone");
        System.out.println("3.Update Phone");
        System.out.println("4.Search Phone");
        System.out.println("5.Sort");
        System.out.println("6.Exit");
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        int ch;

        User user = new User();
        PhoneBook phoneBook = new PhoneBook();
        Scanner sc = new Scanner(System.in);
        Menu();
        while (true) {
            System.out.print("Chon: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    sc.nextLine();
                    System.out.println("Nhap ten nguoi dung: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap sdt nguoi dung: ");
                    String phone = sc.nextLine();
                    phoneBook.insertPhone(name, phone);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Nhap ten muon xoa: ");
                    name = sc.nextLine();
                    phoneBook.removePhone(name);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Nhap ten muon sua: ");
                    name = sc.nextLine();
                    System.out.println("Nhap sdt moi: ");
                    phone = sc.nextLine();
                    phoneBook.updatePhone(name, phone);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Nhap ten: ");
                    name = sc.nextLine();
                    phoneBook.searchPhone(name);
                    break;
                case 5:
                    phoneBook.sort();
                    break;
                case 6:
                    return;
            }
        }

    }
}
