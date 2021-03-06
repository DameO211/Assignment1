//*************************************
// Author: Cole, Dameon
// Course: CMIS 242 7383
// Date :  03/30/2021
// Project Desc: Assignment1
// ************************************
import java.util.Scanner;

public class RunInventory {
    public Inventory bookRequest; //instance of inventory

    public RunInventory ( ) { //contructor to init inventory
        bookRequest = new Inventory ( );
    }

    public void Menu ( ) {

        System.out.println ( "BOOK MENU \n" + "1: Add book \n" + "2: Remove book \n" +
                "3: Find book \n" + "4: Display all books \n" + "5: Exit program \n" );
    }

    public void choiceMade (int choice) {


        switch (choice) {

            case 1:
                bookRequest.add ( );
                break;
            case 2:
                bookRequest.remove ( );
                break;
            case 3:
                bookRequest.find ( );
                break;
            case 4:
                bookRequest.display ( );
                break;
            case 5:
                System.out.println ( "Goodbye" );
                break;
            default:
                throw new IllegalStateException ( "Unexpected value: " + choice );
        }
    }

    public static void main (String[] args) {

        RunInventory run = new RunInventory ( ); //instance of class used to reference

        Scanner user_choice = new Scanner ( System.in );
        int choice = 0;


        do {
            run.Menu ( );

            System.out.println ( "Make your choice " );
            choice = user_choice.nextInt ( );

            run.choiceMade ( choice );

        } while (choice != 5);//loop to keep code going
        user_choice.close ( );
    }

}
