import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<List<Object>> students = new ArrayList<>();
        TreeSet<Double> grades = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());

            students.add(Arrays.asList(name, grade));
            grades.add(grade);
        }

        double secondLowest = grades.higher(grades.first());
        List<String> names = new ArrayList<>();

        for (List<Object> student : students) {
            if ((double) student.get(1) == secondLowest) {
                names.add((String) student.get(0));
            }
        }

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}