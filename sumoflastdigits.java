import java.io.*;
import java.util.*;

class UserMainCode
{
    public int addlastdigits(int input1,int input2)
    {
        if (input1<0 && input2<0)
        {
            int num1=input1*(-1);
            int num2=input2*(-1);
            return ((num1%10)+(num2%10));
        }
        else if(input1<0 && input2>=0)
        {
            int num1 = input1*(-1);
            int num2 = input2;
             return ((num1%10)+(num2%10));

        }
        else if(input1>=0 && input2 <0)
        {
            int num1 = input1;
            int num2 = input2*(-1);
             return ((num1%10)+(num2%10));
        }
        else
        {
            return ((input1%10)+(input2%10));
        }
        
    }
}