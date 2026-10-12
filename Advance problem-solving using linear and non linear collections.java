import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Order implements Comparable<Order> {
    int orderId;
    int priority;

    Order(int orderId, int priority) {
        this.orderId = orderId;
        this.priority = priority;
    }

    public int compareTo(Order other) {
        return Integer.compare(other.priority, this.priority);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        HashMap<Integer, Product> productMap = new HashMap<>();
        PriorityQueue<Order> orders = new PriorityQueue<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double price = sc.nextDouble();

            Product p = new Product(id, name, price);
            products.add(p);
            productMap.put(id, p);
        }

        int searchId = sc.nextInt();
        Product found = productMap.get(searchId);

        if (found != null) {
            System.out.printf("Product Found: %d %s %.2f%n",
                    found.id, found.name, found.price);
        } else {
            System.out.println("Product Not Found");
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int orderId = sc.nextInt();
            int priority = sc.nextInt();
            orders.add(new Order(orderId, priority));
        }

        while (!orders.isEmpty()) {
            Order order = orders.poll();
            System.out.println(order.orderId);
        }

        sc.close();
    }
}