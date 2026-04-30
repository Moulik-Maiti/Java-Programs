abstract class AbstractProduct {
    protected int productId;
    protected String name;
    protected String description;
    public AbstractProduct(int productId, String name, String description) {
        this.productId = productId;
        this.name = name;
        this.description = description;
    }
    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
class Product extends AbstractProduct {
    protected double price;

    public Product(int productId, String name, String description, double price) {
        super(productId, name, description);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
class Book extends Product {
    private String isbn;
    private String author;
    private String title;
    public Book(int productId, String name, String description, double price,String isbn, String author, String title){
        super(productId, name, description, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
}
class TravelGuide extends Book {
    private String country;

    public TravelGuide(int productId, String name, String description, double price, String isbn, String author, String title, String country) {
        super(productId, name, description, price, isbn, author, title);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

class CompactDisc extends Product {
    private String artist;
    private String title;

    public CompactDisc(int productId, String name, String description, double price,String artist, String title) {
        super(productId, name, description, price);
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}
public class Main {
    public static void main(String[] args) {
        TravelGuide guide = new TravelGuide(1, "Travel Guide Book", "Guide to Italy", 29.99, "1234567890", "John Doe", "Italy Guide", "Italy");
        CompactDisc cd = new CompactDisc(2, "Music CD", "Best Hits Album", 14.99, "Famous Artist", "Greatest Hits");
        System.out.println("Travel Guide: " + guide.getTitle() + ", Country: " + guide.getCountry());
        System.out.println("CD: " + cd.getTitle() + ", Artist: " + cd.getArtist());
    }
}
