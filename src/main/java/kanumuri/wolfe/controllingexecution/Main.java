package kanumuri.wolfe.controllingexecution;


/**
 * Created by zipcoder on 2/16/17.
 */
public class Main {

    public static void main(String[] args){
        SumNumbers num = new SumNumbers();
        UserInput input = new UserInput();

        int userInput = input.getUserInput();

        int result = num.addNumbers(userInput);

        System.out.println(result);
    }
}
