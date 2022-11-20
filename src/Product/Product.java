package Product;
import java.util.Map;
import java.util.Objects;

public class Product {
    private final String product;
    private final int price;

    public Product(String product, int price) {
        if (product == null || product.isBlank() || product.isEmpty() || price < 0) {
            throw new IllegalArgumentException("Продукт не заполнен");
        }
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product1 = (Product) o;
        return price == product1.price && Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price);
    }

    @Override
    public String toString() {
        return "Продукт: " + product + ", цена: " + price + ", количество";
    }
}
