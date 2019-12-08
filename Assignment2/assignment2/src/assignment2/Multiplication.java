
package assignment2;

import java.util.Scanner;


public class Multiplication {
    Scanner sc = new Scanner(System.in);
       
    public int var (String input) {        
        switch (input) {
            case "1":
                return multiply(input);
            case "2":
                return multiply(input);
            case "3":
                return multiply(input);
            case "4":
                return multiply(input);
            case "5":
                return multiply(input);
            case "6":
                return multiply(input);
            case "7":
                return multiply(input);
            case "8":
                return multiply(input);
            case "9":
                return multiply(input);
            case "E":
                break;
            default:
                System.out.println("Wrong input, Please try again");              
        }
        return 0;
    }
   
    public int multiply(String input) {
        String guess;
        int score = 0;

        for (int i = 0; i <= 10; i++) {
            int answer = Integer.valueOf(input) * i;
            int count = 5;
            System.out.println("What is " + input + " * " + i + "?");

            do {
                guess = sc.next();
                if (guess.equals("E")) {
                    break;
                }
                int iGuess = Integer.valueOf(guess);
                

                if (iGuess != answer) {
                    System.out.println("You got wrong asnwer.");
                    count--;
                    
                    if (count > 0) {
                        System.out.println("Would you like to try again? y/n (" + count + " attempts left)");
                        if (!sc.next().equals("y")) {     
                            break;
                        }
                    }
                } else {
                    System.out.println("You got right answer");
                    score += count;
                    break;              
                }
            } while (count > 0);

            if (guess.equals("E")) {              
                break;
            }
        }
        System.out.println("Your total score is " + score);
        System.out.println("Lets try another set");
        return 0;
    }
}
