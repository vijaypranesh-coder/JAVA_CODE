class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;
    String available;

    Book(int bookId, String title, String author, String category,
        double price, String available) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.category = category;
            this.price = price;
            this.available = available;
    }


    void displayBookDetails() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Category  : " + category);
        System.out.println("Price     : " + price);
        System.out.println("Available : " + available);
        System.out.println("--------------------------------");
    }
}
public class Library {
    public static void main(String[] args) {
        Book book1 = new Book(101,"Wings of Fire","Abdul Kalam","Autobiography",550.00,"In stock");
        Book book2 = new Book(102,"The Psycology of Money","Morgan Housel","Psycology",450.00,"Out of Stock");

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}