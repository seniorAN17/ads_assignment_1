import java.util.Scanner;

public class Main {

    // task 1
    // Time complexity: O(n)
    // Explanation: the function calls itself n times,
    // each call decreases n by 1 until n == 1,
    // so the total number of calls is proportional to n.
    // Recursion depth is also n -> O(n) space.
    static int sumSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumSquares(n - 1);
    }


    // task2
    // Time complexity: O(n)
    // Explanation: the function is called once for each element
    // of the array, so the number of recursive calls is n.
    // Recursion depth is n -> O(n) space.
    static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sumArray(arr, n - 1);
    }


    // task 3
    // Time complexity: O(n^2)
    // Explanation: sumPowers is called n times,
    // and each time it calls power(), which itself
    // takes O(n) time, so total complexity is n * n = O(n^2).
    // Recursion depth is n.
    static int sumPowers(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return power(b, n) + sumPowers(b, n - 1);
    }

    // Time complexity: O(n)
    // Explanation: power() multiplies b recursively n times.
    static int power(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return b * power(b, n - 1);
    }


    // task 4
    // Time complexity: O(n)
    // Explanation: the function reads n numbers and
    // makes n recursive calls, so the number of operations
    // is proportional to n.
    // Recursion depth is n -> O(n) space.
    static void reverseSequence(int n, Scanner sc) {
        if (n == 0) {
            return;
        }
        int x = sc.nextInt();
        reverseSequence(n - 1, sc);
        System.out.print(x + " ");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Task 1
        System.out.println("Task1:");
        System.out.println(sumSquares(4));

        // Task 2
        System.out.println("Task2:");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumArray(arr, 5));

        // Task 3
        System.out.println("Task3:");
        System.out.println(sumPowers(4, 3));

        // Task 4
        System.out.println("Task4:");
        int n = sc.nextInt();
        reverseSequence(n, sc);

    }
}