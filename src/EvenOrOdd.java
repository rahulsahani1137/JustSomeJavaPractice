import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class EvenOrOdd {

    public static void main(String[] args) {
        //Write a program to find number entered by the user is odd or even
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number entered is even");
        } else {
            System.out.println("The number entered is odd");
        }
    }
}

