import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int Solution(int input1, int input2) {
        // Read only region end
        // Write code here...
        int count = 0;
        for (int i = input1; i <= input2; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        return count;

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}