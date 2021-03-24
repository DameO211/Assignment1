import java.util.Scanner;

public class Inventory {

    public void addR() {
        Scanner addRequest = new Scanner(System.in);
        System.out.println("Please enter book data ");
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


    public void Find() {
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
