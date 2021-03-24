import java.util.Arrays;
import java.util.Scanner;

public class RunInventory {
    public static void Menu() {
        Scanner user_choice = new Scanner( System.in );
        int choice = user_choice.nextInt();
        System.out.println( "BOOK MENU \n" + "1: Add book \n" + "2: Remove book \n" +
                "3: Find book \n" + "4: Display all books \n" + "5: Exit program \n" );
//        do {
//            switch (choice) {
//                case 1:
//                    System.out.println( "Book Added!" );
//                    break;
//                case 2:
//                    System.out.println( "Book Removed~" );
//                    break;
//                case 3:
//                    System.out.println( "Book Found!" );
//                    break;
//                case 4:
//                    System.out.println( "All Book Displayed!" );
//                    break;
//            }
//            System.out.println( "Goodbye!" );
//        }
        }

        public static void main (String[] args){
            Menu();
        }
    }
