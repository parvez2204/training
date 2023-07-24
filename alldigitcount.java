import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int Solution(int input1) {
        // Read only region end
        // Write code here...
        int count = 0;
        
        while (input1 >= 1) {
            input1 = input1 / 10;
            count++;
        }

        return count;

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}