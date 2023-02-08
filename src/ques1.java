import java.util.*;
public class ques1 {
    //Take two nos. as input x and n & print the result x^n?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        System.out.println("Enter the index of number : ");
        int n = sc.nextInt();
        int result = 1;
        for(int i = 1; i<=n; i++){
            result = result*x;
        }
        System.out.println(result);
    }
}
