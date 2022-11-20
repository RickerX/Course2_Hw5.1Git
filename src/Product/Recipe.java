package Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private final Map<Product, Integer> products = new HashMap<>();

    public Recipe(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Рецепт не заполнен");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product,int quantity) {
        if (quantity <= 0) {
            quantity = 1;
        }
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + quantity);
        } else {
            this.products.put(product, quantity);
        }
    }

    public int getPriceRecipe() {
        int sum = 0;
        for (Map.Entry<Product,Integer> product : products.entrySet()) {
            sum = sum + product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name) && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }
}
