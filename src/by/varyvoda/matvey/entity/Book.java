package by.varyvoda.matvey.entity;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    // Task 14
    @Override
    protected Book clone() throws CloneNotSupportedException {
        Book copy = (Book) super.clone();
        copy.author = author;
        copy.title = title;
        copy.price = price;
        return copy;
    }

    // Task 12
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || o.getClass() != getClass() || o.hashCode() != hashCode()) return false;

        Book book = (Book) o;
        return (title == null && book.title == null
                || title != null && title.equals(book.title))
                && (author == null && book.author == null
                || author != null && author.equals(book.author))
                && price == book.price;
    }

    // Task 12
    @Override
    public int hashCode() {
        return 31 * (31 * (title == null ? 0 : title.hashCode()) + price) + (author == null ? 0 : author.hashCode());
    }

    // Task 12
    @Override
    public String toString() {
        return getClass().getSimpleName() + "(title: " + title + ", author: " + author + ", price: " + price + ")";
    }

    // Task 14
    @Override
    public int compareTo(Book book) {
        return Integer.compare(book.isbn, isbn);
    }
}
