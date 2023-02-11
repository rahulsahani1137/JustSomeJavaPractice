import java.util.*;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if (n % 3 == 0 || n % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}


