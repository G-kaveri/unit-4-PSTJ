import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> contacts = new HashMap<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String phone = sc.nextLine();
            contacts.put(name, phone);
        }

        String searchName = sc.nextLine();

        if (contacts.containsKey(searchName)) {
            System.out.println("Phone: " + contacts.get(searchName));

            String newPhone = sc.nextLine();
            contacts.put(searchName, newPhone);

            System.out.println("Updated Phone: " + contacts.get(searchName));
        } else {
            System.out.println("Contact not found");
        }

        sc.close();
    }
}