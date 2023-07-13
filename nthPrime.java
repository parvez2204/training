import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int Solution(int input1) {
        // Read only region end
        // Write code here...
        // nth prime
        int count = 0, current = 2;

        while (count != input1) {
            boolean isPrime = true;
            for (int i = 2; i < current; i++) {
                if (current % i  == 0) {
                    isPrime = false;
                    break;
                }
            }
            current++;
            if (isPrime) {
                count++;
            }
        }

        return current-1;

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}
