//*************************************
// Author: Cole, Dameon
// Course: CMIS 242 7383
// Date :  03/30/2021
// Project Desc: Assignment1
// ************************************

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    ArrayList<Book> bookArray;

    public Inventory ( ) {
        bookArray = new ArrayList<Book> ( );
    }

    public void add ( ) {
        Scanner bookInfo = new Scanner ( System.in );
        System.out.println ( "Please enter book data you'd like to add to the list. " );

        //User input stored in object variables
        System.out.print ( "bookTitle: " );
        String title = bookInfo.nextLine( );

        System.out.print ( "bookID: " );
        int id = bookInfo.nextInt ( );

        System.out.print ( "bookPrice: " );
        double price = bookInfo.nextDouble ( );
        bookInfo.nextLine();




        Book addedBook = new Book ( title, price,id );

        bookArray.add ( addedBook );
        for ( int i = 0; i < bookArray.size ( ); i++ ) {
            System.out.println ( bookArray.get ( i ) );
        }

    }


    public void remove ( ) {
//        Prompts user for book id
        Scanner scan = new Scanner ( System.in );

        //User input stored in object variables
        System.out.print ( "bookID: " );
        int id = scan.nextInt ( );
        int size = bookArray.size ( );

//        conditional loop to match the book id to user input
        for ( int i = 0; i < size; i++ ) {
            Book rb = bookArray.get ( i );
            if ( id == rb.id ) {
                System.out.println ( "\nThe following book has been removed: \n" + bookArray.toString ( ) );
                bookArray.remove ( i );
            } else {
                System.out.println ( "\nBook not found\n" );
            }
        }

    }

    public void find ( ) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Please enter book data you'd like to find to the list. \n" );
        int id = scan.nextInt ( );
        int size = bookArray.size ( );

//        Array to loop through array to find matching id

        for ( int i = 0; i < size; i++ ) {
            Book rb = bookArray.get ( i );
            if ( id == rb.id ) {
                System.out.println ( "The following book has been found: \n" + bookArray.get ( i ) );
                // remove the book
            } else {
                System.out.println ( "Book not found \n" );


            }

        }
    }

    public void display ( ) {
//        loop to display entire array
        if ( bookArray.isEmpty ( ) ) {
            System.out.println ( "No books available\n" );
        } else {
            for ( Book books : bookArray ) {
                System.out.println ( books );
            }
        }


    }
}
