package Test07;

public class Book {
    private String num;
    private String book;
    private String ISBN;
    private double price;
    private String day;

    public Book() {
    }

    public Book(String num, String book, String ISBN, double price, String day) {
        this.num = num;
        this.book = book;
        this.ISBN = ISBN;
        this.price = price;
        this.day = day;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public void showBook(){
        System.out.println("最贵的书:"+num+","+book+","+ISBN+","+price+","+day);
    }
}
