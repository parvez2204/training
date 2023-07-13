import java.io.*;
import java.util.*;
// Read only region start
class isPrime
{
    public int Solution(int input1) {
        // Read only region end
        // Write code here...
        boolean isPrime = true;
        for(int i = 2; i <= input1; i++) { // input1/2 & sqrt(input1) is a more optimised approach
            if(input1 % i == 0) {
                isPrime = false;
                // use a break statement here
            }
        }

        if (isPrime) {
            return 2;
        }

        return 1;

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}