public class BookManagement {

    // Book class
    static class Book {
        private String bookName;
        private String author;
        private String publisher;
        private double price;
        private int yearPublished;

        public Book(String bookName, String author, String publisher, double price, int yearPublished) {
            this.bookName = bookName;
            this.author = author;
            this.publisher = publisher;
            this.price = price;
            this.yearPublished = yearPublished;
        }

        public void display() {
            System.out.println("Book Name: " + bookName);
            System.out.println("Author: " + author);
            System.out.println("Publisher: " + publisher);
            System.out.println("Price: $" + price);
            System.out.println("Year Published: " + yearPublished);
        }
    }

    // BookSales class
    static class BookSales {
        private String salesName;
        private int numberOfSales;
        private String saleId;

        public BookSales(String salesName, int numberOfSales, String saleId) {
            this.salesName = salesName;
            this.numberOfSales = numberOfSales;
            this.saleId = saleId;
        }

        public void display() {
            System.out.println("Sales Name: " + salesName);
            System.out.println("Number of Sales: " + numberOfSales);
            System.out.println("Sale ID: " + saleId);
        }
    }

    // Main method
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", "Pearson", 45.0, 2018);
        book.display();

        System.out.println();

        BookSales sales = new BookSales("Effective Java Sales", 120, "SALE2025");
        sales.display();
    }
}