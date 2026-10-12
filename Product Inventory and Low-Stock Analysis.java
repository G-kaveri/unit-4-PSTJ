import java.util.*;

class Product {
    int id;
    String name;
    int stock;
    double price;

    Product(int id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Product> inventory = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int stock = sc.nextInt();
            double price = sc.nextDouble();

            inventory.put(id, new Product(id, name, stock, price));
        }

        int sales = sc.nextInt();

        for (int i = 0; i < sales; i++) {
            int id = sc.nextInt();
            int quantity = sc.nextInt();

            Product p = inventory.get(id);

            if (p != null && quantity > 0 && quantity <= p.stock) {
                p.stock -= quantity;
            }
        }

        int threshold = sc.nextInt();

        List<Product> products = new ArrayList<>(inventory.values());
        products.sort(Comparator.comparingInt(p -> p.stock));

        System.out.println("Low Stock Products:");

        for (Product p : products) {
            if (p.stock < threshold) {
                System.out.println(p.id + " " + p.name + " " + p.stock);
            }
        }

        System.out.println("Products Sorted by Stock:");

        for (Product p : products) {
            System.out.printf("%d %s %d %.2f%n",
                    p.id, p.name, p.stock, p.price);
        }

        sc.close();
    }
}