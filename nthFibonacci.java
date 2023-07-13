import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
    public int Solution(int input1) {
        // Read only region end
        // Write code here...
        //nth fibonacci number
        int a=0,b=1;

        input1 = input1 - 1;

        if(input1 == 0 || input1 == 1){
            return input1;
        }
        else {
            while (input1 != 0) {
                int c= a + b;
                a = b;
                b = c;
            }
            return a;
        }
        

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}
