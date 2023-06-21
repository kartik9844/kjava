//wp to display fibanoci series upto 15

public class Fibonacci {
    public static void main(String[] args) {
        int n = 15;
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        System.out.print(firstTerm + " ");

        for (int i = 1; i < n; i++) {
            System.out.print(secondTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
