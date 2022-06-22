import java.util.Scanner;

// In charge of all the user input!
// Scanner class required!
public class UserInput {

    public String userInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your guess?:");

        String guess = input.nextLine();
        return guess;
    }



}
