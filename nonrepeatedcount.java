import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int Solution(int input1) {
        // Read only region end
        // Write code here...
        // write code to find unique digits in N
        int[] uDigits = new int[10];
        int count = 0;
        
        while (input1 >= 1) {
            int digit = input1 % 10;
            if (uDigits[digit] == 0) {
                uDigits[digit] = 1;
                count++;
            }
            input1 /= 10;
            
        }

        return count;

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}