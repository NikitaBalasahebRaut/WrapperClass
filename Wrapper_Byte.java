//program to demonstrate the concept of Byte Wrapper class

import java.lang.*;
import java.io.*;
import java.util.*;

class Wrapper_Byte
{
  public static void main(String args[])
  {
      Byte obj1 = 101;
	  Byte obj2 = 102;
	  
	  byte b1 = obj1;
	  byte b2 = obj2;
	  
	  System.out.println("Value of obj1 \t"+obj1);
	  System.out.println("Value of obj2 \t"+obj2);
	  System.out.println("Value of b1 \t"+b1);
	  System.out.println("Value of b2\t"+b2);
	  
	  String str = obj1.toString();
	  System.out.println("After converting Byte class object into string \t"+str);
	  
	  	int out = obj1.compareTo(obj2);
	  
	  if(out == 0)
	  {
		  System.out.println("Both objects are equal");
	  }
	  else if(out < 0)
	  {
		  System.out.println("obj1 < obj2");
	  }
	  else if(out > 0)
	  {
		  System.out.println("obj1 > obj2");
	  }
	  
  }
}

/*output

Value of obj1   101
Value of obj2   102
Value of b1     101
Value of b2     102
After converting Byte class object into string  101
obj1 < obj2

*/