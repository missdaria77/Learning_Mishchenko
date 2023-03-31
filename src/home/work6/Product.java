package home.work6;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    private ProductType type;
    private double price;
    private boolean discountApp;
    private LocalDate addDate;
    private int Id;

    public Product(ProductType type, double price) {
        this.type = type;
        this.price = price;
    }

    public Product(ProductType type, double price, boolean discountApp) {
        this.type = type;
        this.price = price;
        this.discountApp = discountApp;
    }

    public Product(ProductType type, double price, boolean discountApp, LocalDate addDate) {
        this.type = type;
        this.price = price;
        this.discountApp = discountApp;
        this.addDate = addDate;
    }

    public Product(ProductType type, double price, boolean discountApp, LocalDate addDate, int id) {
        this.type = type;
        this.price = price;
        this.discountApp = discountApp;
        this.addDate = addDate;
        Id = id;
    }

    public Product newPrice() {
        return new Product(this.type, this.price * 0.9, this.discountApp, this.addDate, this.Id);
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscountApp() {
        return discountApp;
    }

    public void setDiscountApp(boolean discountApp) {
        this.discountApp = discountApp;
    }

    public LocalDate getAddDate() {
        return addDate;
    }


    public int getId() {
        return Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && discountApp == product.discountApp && Id == product.Id && type == product.type
                && Objects.equals(addDate, product.addDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, discountApp, addDate, Id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", price=" + price +
                ", discountApp=" + discountApp +
                ", addDate=" + addDate +
                ", Id=" + Id +
                '}';
    }
}

