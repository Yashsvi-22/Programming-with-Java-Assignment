import java.util.*;

class Book implements Comparable<Book> {

    int id;
    String name;
    double price;

    Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int compareTo(Book b) {
        return this.id - b.id;
    }
}

class PriceComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        if (b1.price > b2.price)
            return 1;
        else if (b1.price < b2.price)
            return -1;
        else
            return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book(3, "Java", 500));
        list.add(new Book(1, "Python", 400));
        list.add(new Book(2, "C++", 300));

        Collections.sort(list);
        System.out.println("Sorting by ID(Comparable):");
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.price);
        }

        Collections.sort(list, new PriceComparator());
        System.out.println("\nSorting by Price(Comparator):");
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.price);
        }
    }
}
