import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Book [] bookCollection  = new Book[2];
        bookCollection[0] = new Book(345,"Harry Potter",19);
        bookCollection[1] = new Book(346,"Super Fudge",23);
        bookCollection[0] = new Book(347,"Capn Underpants",15);


        System.out.println(bookCollection);

    }
}
