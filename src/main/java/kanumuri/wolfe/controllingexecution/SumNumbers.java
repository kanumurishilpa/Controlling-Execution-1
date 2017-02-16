package kanumuri.wolfe.controllingexecution;

/**
 * Created by zipcoder on 2/16/17.
 */
public class SumNumbers {

    public int addNumbers(int num){
        int result = 0;
        for(int i = 1; i <= num; i++){
            result += i;
        }
        return result;
    }
}
