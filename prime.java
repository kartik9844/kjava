//37.wp to display all prime number from 1 to 50

public class prime {
    public static void main(String[] args) {
        for (int number = 1; number <= 50; number++) {
            boolean isPrime = true;
            if (number > 1) {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }
            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}

