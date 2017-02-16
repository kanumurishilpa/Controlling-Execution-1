package kanumuri.wolfe.controllingexecution;

import java.util.Scanner;

/**
 * Created by zipcoder on 2/16/17.
 */
public class UserInput {
    Scanner kb = new Scanner(System.in);

    public int getUserInput(){
        return kb.nextInt();
    }
}
