import java.util.Scanner;

public class Inventory {

    public void add() {


            Scanner addRequest = new Scanner(System.in);
            System.out.println("Please enter book data you'd like to add to the list. ");


            //User input stored in object variables
            System.out.print("bookID: ");
            int id = addRequest.nextInt();//fix so that only int accepted


        System.out.print("bookPrice: ");
        double price = addRequest.nextInt();//fix so that only double accepted accepted


        System.out.print("bookTitle: ");
        String title = addRequest.next(); //fix so that only string accepted





//    Add: Prompts user for book data and add to the inventory list.
//    If the book already exists (based on id value),
//    the add request will fail and an error message will be printed to the console
    }



    public void remove() {
//        Prompts user for book id
        Scanner removeRequest = new Scanner(System.in);
        System.out.println("Please enter book id ");

//    b. Remove.  finds the id in the inventory list and removes it.
//        If the book matching the id is not in the inventory,
//        remove request will fail and an error message will be printed to the console
    }


    public void find() {
        Scanner findRequest = new Scanner(System.in);
        System.out.println("Please enter book id ");
//    c. Find: Prompts user for book id, finds the id in the inventory list and print all the data for the book
//            (id, title, and price). If the book matching the id is not in the inventory,
//            find request will fail and an error message will be printed to the console
    }

    public void display(){
        {
            System.out.println("Book id is:  and Student name is: "
                    );
            System.out.println();
        }



    }
}
