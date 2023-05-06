import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        if (((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0))) {
            System.out.println("leap year");
        } else {
            System.out.println("common year");
        }
    }

}
