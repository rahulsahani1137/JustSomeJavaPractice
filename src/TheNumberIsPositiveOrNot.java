import java.util.*;
public class TheNumberIsPositiveOrNot {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        if(x>0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is negative");
        }
        System.out.println("Right!!");
    }
}
//Take an input n & if the number n is a positive no.,print "Positive".
// At the last print "Hello" for any value of n (whether positive or not).