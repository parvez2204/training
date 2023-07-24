import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int Solution(int input1) {
        // Read only region end
        // Write code here...
        int sum = 0;
        int sign = 1;

        if (input1 < 10 && input1 > -10) {
            return input1;
        }

        if (input1 < 0) {
            sign = -1;
            input1 *= -1;
        }

        while (input1 > 0) {
            int digit = input1 % 10;
            sum += digit;
            input1 /= 10;
        }

        return Solution(sum * sign);

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}