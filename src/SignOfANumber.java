import java.util.*;
public class SignOfANumber {
    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=input.nextInt();
        //write your code here to determine if n is a negative or positive number
        if(n<0){System.out.println("The number entered is negative");}
        else{System.out.println("The number entered is positive");}
    }
}

