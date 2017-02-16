package kanumuri.wolfe.controllingexecution;

import java.util.Scanner;

/**
 * Created by zipcoder on 2/16/17.
 */
public class UserInput {
    Prompt p = new Prompt();
    Scanner kb = new Scanner(System.in);

    public int getUserInput(){
        p.prompt();
        int input = kb.nextInt();
        return input;
    }
}
