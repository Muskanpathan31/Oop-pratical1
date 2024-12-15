class Publication {
    String title;
    double price;
    int copies;

    Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    double saleCopy() {
        return price * copies;
    }
}

class Book extends Publication {
    String author;

    Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    void orderCopies(int additionalCopies) {
        copies += additionalCopies;
    }
}

class Magazine extends Publication {
    String currentIssue;

    Magazine(String title, double price, int copies, String currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }

    void orderQty(int additionalCopies) {
        copies += additionalCopies;
    }

    void receiveIssue(String newIssue) {
        currentIssue = newIssue;
    }
}

public class PublicationDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 500, 100, "John Doe");
        Magazine mag1 = new Magazine("Tech Today", 100, 50, "Issue 1");

        book1.orderCopies(50);
        mag1.orderQty(30);

        double totalSale = book1.saleCopy() + mag1.saleCopy();

        System.out.println("Total sale of publications: " + totalSale);
    }
}
