import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int Solution(int input1) {
        // Read only region end
        // Write code here...
        int sum = 0;

        while (input1 > 0) {
            int digit = input1 % 10;
            if (digit % 2 == 0 || digit % 2 == 1) {
                sum += digit;
            }
            input1 /= 10;
        }

        return sum;

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}