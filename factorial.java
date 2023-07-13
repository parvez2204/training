import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
    public int Solution(int input1) {
        // Read only region end
        // Write code here...
        int fact = 1;
        
        for (int i = 1; i <= input1; i++) {
            fact = fact * i;
        }

        return fact;

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}
