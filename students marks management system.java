import java.util.Scanner;

class DynamicArray {
    private int[] marks;
    private int size;

    DynamicArray() {
        marks = new int[2];
        size = 0;
    }

    void addMark(int mark) {
        if (size == marks.length) {
            int[] newMarks = new int[marks.length * 2];
            for (int i = 0; i < size; i++) {
                newMarks[i] = marks[i];
            }
            marks = newMarks;
        }

        marks[size] = mark;
        size++;
    }

    void displayMarks() {
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DynamicArray students = new DynamicArray();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int mark = sc.nextInt();
            students.addMark(mark);
        }

        students.displayMarks();

        sc.close();
    }
}