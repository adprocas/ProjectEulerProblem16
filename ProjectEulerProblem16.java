package projecteulerproblem16;

import java.math.BigInteger;

/**
 *
 * @author Adam Leathorn
 */
public class ProjectEulerProblem16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 2;
        int y = 1000;

        String power = calculatePower(x, y).toString();

        System.out.println(x + "^" + y + " is:");
        System.out.println(power);
        System.out.println("The sum of the digits of " + x + "^" + y + " is:");
        System.out.println(addDigitsFromString(power));
    }

    public static BigInteger calculatePower(int x, int y) {
        BigInteger result = new BigInteger(String.valueOf(x));
        BigInteger bigX = new BigInteger(String.valueOf(x));
        
        result = bigX.pow(y);

        return result;
    }

    public static long addDigitsFromString(String nums) {
        long numbers = 0;

        for (int i = 0; i < nums.length(); i++) {
            numbers += nums.charAt(i) - '0';
        }

        return numbers;
    }
}
