import java.util.*;
public class ques2 {
    //Take two nos. as input x and n & print the result x^n?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            System.out.println(i*100);
        }
    }
}
