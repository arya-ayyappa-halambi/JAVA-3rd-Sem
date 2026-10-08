import java.util.Scanner;

class book {
    String id;
    String title;
    String author;
    int price;
    static int count = 0;

    book(String id, String title, String author, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }

    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    void findGreater(book other) {
        if (this.price > other.price) {
            System.out.println(this.title + " is more expensive than " + other.title);
        } else if (this.price < other.price) {
            System.out.println(this.title + " is less expensive than " + other.title);
        } else {
            System.out.println(this.title + " is equally priced as " + other.title);
        }
    }

    static void countDisplay() {
        System.out.println("Total books created: " + count);
    }
}

public class book_info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        book[] books = new book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = sc.next();
            System.out.print("Title: ");
            String title = sc.next();
            System.out.print("Author: ");
            String author = sc.next();
            System.out.print("Price: ");
            int price = sc.nextInt();
            books[i] = new book(id, title, author, price);
        }

        System.out.println("\nTotal books created: " + book.count);
        System.out.println("\nDetails of all books:");
        for (int i = 0; i < n; i++) {
            books[i].displayInfo();
            System.out.println();
        }

        System.out.println("Price Comparisons:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                books[i].findGreater(books[j]);
            }
        }

        System.out.print("\nEnter Book ID to search: ");
        String searchid = sc.next();
        int found = 0;

        for (int i = 0; i < n; i++) {
            if (books[i].id.equals(searchid)) {
                System.out.println("\nBook found:");
                books[i].displayInfo();
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Book not found.");
        }

        sc.close();
    }
}
