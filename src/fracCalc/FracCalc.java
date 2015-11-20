package fracCalc;
import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two fractions: ");
        String fraction = input.nextLine();
        produceAnswer(fraction);
    	

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        String[] words = input.split(" ");
        if(words[1] == "+"){
        	
        }
        System.out.println(words[2]);
        return " ";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
