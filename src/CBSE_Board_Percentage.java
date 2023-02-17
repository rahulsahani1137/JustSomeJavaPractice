import java.util.*;
// Write a program to Calculate percentage of a given student
// in CBSE board exam. His marks from 5 subjects must be taken
// as input from the keyboard (Marks are out of hundred).
public class CBSE_Board_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Please Enter Your Full Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Your Branch(PCM[1]/PCB[2]/Commerce[3]/Arts[4]) : ");
        int branch = sc.nextInt();
        int s1=0,s2=0,s3=0,s4=0,s5=0;
        if (branch == 1) {
            System.out.print("Enter your obtained marks in subject Mathematics : ");
            s1 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject English : ");
            s2 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Physics : ");
            s3 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Chemistry : ");
            s4 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Hindi : ");
            s5 = sc.nextInt();
        } if (branch == 2) {
            System.out.print("Enter your obtained marks in subject Biology : ");
            s1 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject English : ");
            s2 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Physics : ");
            s3 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Chemistry : ");
            s4 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Hindi : ");
            s5 = sc.nextInt();
        } if (branch == 3) {
            System.out.print("Enter your obtained marks in subject Business studies : ");
            s1 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject English : ");
            s2 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Economy : ");
            s3 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Accountancy : ");
            s4 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Hindi : ");
            s5 = sc.nextInt();
        } if (branch == 4) {
            System.out.print("Enter your obtained marks in subject History : ");
            s1 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject English : ");
            s2 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Geography : ");
            s3 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Politics : ");
            s4 = sc.nextInt();
            System.out.print("Enter your obtained marks in subject Hindi : ");
            s5 = sc.nextInt();
        }
        else{System.out.print("Please Enter a valid CBSE course stream!");}

        float Result;
        Result = (s1 + s2 + s3 + s4 + s5) / 5;
        System.out.println(name + " The Percentage of your CBSE board result is : "+Result);

  }
}
