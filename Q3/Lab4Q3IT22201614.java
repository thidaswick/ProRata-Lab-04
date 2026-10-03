import java.util.Scanner;

public class Lab4Q3IT22201614{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        String result = (number > 0) ? "Positive"
                : (number < 0) ? "Negative"
                  : "Zero";

        System.out.println("The number is: " + result);
    }
}

