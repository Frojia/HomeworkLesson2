//Factorial of 6, 10 iterations

public class TaskFive {
    public static void main(String[] args) {
        int factorialLimit = 10;
        int fact = 6;
        for (int a = 1; a < factorialLimit; a++) {
            fact *= a;
            System.out.println("Factorial = "+fact);
        }

    }
}
