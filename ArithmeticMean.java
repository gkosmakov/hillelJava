import java.util.Scanner;
public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        int sum = first + second;

        if (sum%2 == 0) {
            int average = sum/2 ;
            System.out.println("The arithmetic mean is " + avarage);
        } else if (sum%2 != 0) {
            double averageD = (double) sum /2;
            System.out.println("The arithmetic mean is " + avarageD);
        }

    }
}
