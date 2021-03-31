//*************************************
// Author: Cole, Dameon
// Course: CMIS 242 7383
// Date :  03/30/2021
// Project Desc: Assignment1
// ************************************
public class Book {
    //    Attribute
    public int id;
    public String title;


    public double price;

    public Book (int bookID, String bookTitle, double bookPrice) {
        this.id = bookID;
        this.title = bookTitle;
        this.price = bookPrice;
    }

//    Setters

    public void setId (int id) {
        this.id = id;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public void setPrice (int price) {
        this.price = price;
    }


//    Getters

    public int getId ( ) {
        return this.id;
    }

    public String getTitle ( ) {
        return title;
    }

    public double getPrice ( ) {
        return price;
    }


    @Override
    public String toString ( ) {  //create to get call books from array
        return "\n" +
                "Book" +
                "\nid: " + id +
                "\ntitle: " + title +
                "\nprice: " + price +
                "\n";
    }
}