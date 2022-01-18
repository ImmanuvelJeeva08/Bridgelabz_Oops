package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BookService implements IBookService{

    List<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addBook() {
        Book book = new Book();

        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        book.setId(result);

        System.out.println("Enter Book Name : ");
        String name = scanner.next();
        book.setName(name);

        System.out.println("Enter Book Author Name : ");
        String author = scanner.next();
        book.setAuthor(author);

        System.out.println("Enter Book Price : ");
        int price = scanner.nextInt();
        book.setPrice(price);

        books.add(book);
    }

    @Override
    public void deleteBook() {
        System.out.println("Enter Book id for delete Process : ");
        int deleteBookId = scanner.nextInt();
        boolean process = false;

        try{
            for (Book book : books) {
                if(deleteBookId == book.getId()){
                    books.remove(book);
                    System.out.println("Sucssfully Deleted === >" + book);
                    process = true;
                }
            }
        }catch (Exception e){
            System.out.println("Exception Occured"+ e);
        }


        if(process){
            System.out.println("");
        }else {
            System.out.println("Given Id not Found");
        }
    }

    @Override
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
