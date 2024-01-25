package inDepthJavaCollections.set.treeSet;


import java.util.*;

/**
 * treeSet, comparator
 */


public class SetDemo2 {

    private static void treeSetDemo() {
        Book2 book1 = new Book2("Harry Potter", "J.K.Rowling", 1997);
        Book2 book2 = new Book2("Harry Potter", "J.K.Rowling", 1997);
        Book2 book3 = new Book2("Walden", "Henry David Thoreau", 1854);
        Book2 book4 = new Book2("Effective Java", "Joshua Bloch", 2008);

       Set<Book2> books = new TreeSet<>();
        //Set<Book2> books = new TreeSet<>(new TitleComparator()); // to use comparator
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book2 book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        treeSetDemo();
    }

}

class Book2 implements Comparable {
    private String title;
    private String author;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book2(String title, String author, int year) {
        super();
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book2 other = (Book2) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (year != other.year)
            return false;
        return true;
    }


    public int compareTo(Object book) {
        return getTitle().compareTo(((Book2) book).getTitle()); // utilizing String s compareTo
    }

}

class TitleComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Book2) o1).getTitle().compareTo(((Book2) o2).getTitle());
    }

}


/**
 *  -----> down casting <----------
 * public int compareTo(Object book) {
 *         return getTitle().compareTo((Book2)book).getTitle());
 *     }
 *
 *  (int) Integer
 *
 */