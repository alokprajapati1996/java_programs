import java.util.Scanner;

public class TwoStringEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String first");
        String str1 = sc.nextLine();
        System.out.println("Enter String second");
        String str2 = sc.nextLine();

        System.out.println(str1.equals(str2));

    }
}