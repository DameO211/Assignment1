public class Book {
    //    Attribute
    private int id;
    private String title;
    private int price;

    public Book(int bookID, String bookTitle, int bookPrice) {
        this.id = bookID;
        this.title = bookTitle;
        this.price = bookPrice;
    }

//    Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }


//    Getters

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

}