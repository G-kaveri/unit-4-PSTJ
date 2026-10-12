import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Student> students = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int marks = sc.nextInt();

            students.put(id, new Student(name, marks));
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int id = sc.nextInt();
            Student s = students.get(id);

            if (s != null) {
                System.out.println(s.name + " " + s.marks);
            } else {
                System.out.println("Student not found");
            }
        }

        sc.close();
    }
}