import java.util.Scanner;
//Importing Scanner class.
public class TakingInputFromTheUser {
    public static void main(String[] args){
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your full name : ");
//        String str = sc.next();
        String str = sc.nextLine(); //nextLine() is used to print the input of the whole line by the user.
        System.out.println("Hello "+str+" could you please ");
        System.out.print("Enter Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        float n2 = sc.nextFloat();
        float sum = n1 + n2;
        System.out.println("The Sum of two numbers is : "+sum);

    }
}
