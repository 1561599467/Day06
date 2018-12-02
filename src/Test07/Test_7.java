package Test07;

public class Test_7 {
    public static void main(String[] args) {
        Book book = new Book("No0003", "JavaWeb实战", "isbn387648797524", 58.8, "2017-01-01");

        Book book1 = new Book("No0003", "JavaWeb实战", "isbn387648797524", 50.5, "2017-01-01");

        Book book2 = new Book("No0003", "JavaWeb实战", "isbn387648797524", 47.5, "2017-01-01");



        Book b=book.getPrice()>book1.getPrice()?book:book1;
        b=book.getPrice()>book2.getPrice()?book:book2;
        b.showBook();

    }
}
