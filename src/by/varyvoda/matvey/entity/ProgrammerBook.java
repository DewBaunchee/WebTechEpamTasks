package by.varyvoda.matvey.entity;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    // Task 13
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProgrammerBook book = (ProgrammerBook) o;
        return level == book.level
                && (language == null && book.language == null
                || language != null && language.equals(book.language));
    }

    // Task 13
    @Override
    public int hashCode() {
        return 31 * (31 * (super.hashCode()) + level) + (language == null ? 0 : language.hashCode());
    }

    // Task 13
    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "(title: " + getTitle() + ", " +
                "author: " + getAuthor() + ", " +
                "price: " + getPrice() + ", " +
                "language: " + language + ", " +
                "level: " + level + ")";
    }
}
