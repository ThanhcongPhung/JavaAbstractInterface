package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestNew {
    ArrayList<News> news = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void insertNew() {
        News n = new News();
        System.out.println("Title: ");
        n.Title = sc.nextLine();
        sc.nextLine();
        System.out.println("Publish Date: ");
        n.PublishDate = sc.nextLine();
        System.out.println("Author: ");
        n.Author = sc.nextLine();
        System.out.println("Content: ");
        n.Content = sc.nextLine();
        System.out.println("Nhap danh gia: ");
        for (int i = 0; i < n.RateList.length; i++) {
            System.out.println("Danh gia "+(i+1)+":" );
            n.RateList[i]=sc.nextInt();
        }
        news.add(n);
    }

    public void viewList() {
        for (News n : news) {
            n.Display();
        }
    }
    public void avarageRate(){
        for (News n : news) {
            n.Calculate();
            n.Display();
        }
    }
    static void Menu() {
        System.out.println("-----------NEW MANAGEMENT SYSTEM----------");
        System.out.println("1.Insert news");
        System.out.println("2.View list news");
        System.out.println("3.Average rate");
        System.out.println("4.Exit");
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        int ch;
        TestNew testNew = new TestNew();
        Scanner sc = new Scanner(System.in);
        Menu();
        while (true) {
            System.out.print("Chon: ");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    testNew.insertNew();
                    break;
                case 2:
                    testNew.viewList();
                    break;
                case 3:
                    testNew.avarageRate();
                    break;
                case 4:
                    return;
            }
        }

    }
}
