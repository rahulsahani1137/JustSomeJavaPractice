import java.util.*;
public class PlaceValues {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("\nError! Number more than 5 digits.");
        }
        else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        }
        else if (10000<=number&&number<=99999){
            //WRITE YOUR CODE HERE
            int ones=(number/1)%10;
            int tens = (number/10)%10;
            int hundreds = (number/100)%10;
            int thousands = (number/1000)%10;
            int tenThousands = (number/10000)%10;
            System.out.println(ones);
            System.out.println(tens);
            System.out.println(hundreds);
            System.out.println(thousands);
            System.out.println(tenThousands);
        }
    }
}
