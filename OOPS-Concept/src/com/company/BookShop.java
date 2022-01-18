package com.company;

import java.util.Scanner;

public class BookShop {

    static Scanner scanner = new Scanner(System.in);
    static BookService bookService = new BookService();

    public static void process(){

        System.out.println("====================== Book Management System ====================== ");
        System.out.println("1 . Add new Book ");
        System.out.println("2 . Delete a Book ");
        System.out.println("3 . Display Books ");
        System.out.println("4 . Exit ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                bookService.addBook();
                process();
                break;
            case 2:
                bookService.deleteBook();
                process();
                break;
            case 3:
                bookService.displayBooks();
                process();
                break;
            case 4:
                System.out.println("Thank you for Visiting the bookStore");
                break;
            default:
                System.out.println("Please Enter proper input choice");
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        b1.setId(1);
        b1.setName("JaiHind");
        b1.setAuthor("Mani");
        b1.setPrice(200);
        bookService.books.add(b1);

        Book b2 = new Book();
        b2.setId(2);
        b2.setName("Agri");
        b2.setAuthor("Raja");
        b2.setPrice(100);
        bookService.books.add(b2);

        Book b3 = new Book();
        b3.setId(3);
        b3.setName("Police");
        b3.setAuthor("Saini");
        b3.setPrice(300);
        bookService.books.add(b3);

        Book b4 = new Book();
        b4.setId(4);
        b4.setName("Kalanithi");
        b4.setAuthor("Theena");
        b4.setPrice(600);
        bookService.books.add(b4);

        process();
    }
}
