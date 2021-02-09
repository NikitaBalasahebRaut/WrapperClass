//program to demonstrate the concept of Integer Wrapper class

import java.lang.*;
import java.io.*;
import java.util.*;

class Wrapper_Integer
{
  public static void main(String args[])
  {
     Integer obj1 = 1000;
	 Integer obj2 = 2000;
	 
	 int no1 = obj1;
	 int no2 = obj2;
	 
	  System.out.println("Value of obj1\t"+obj1);
	  System.out.println("Value of obj1\t"+obj2);
	  System.out.println("Value of no1 \t"+no1);
	  System.out.println("Value of no2 \t"+no2);
	  
	  
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
	  
	  String str = obj1.toString();
	  System.out.println("After converting Integer class object into string as"+str);
  }
}

/*
output of the program 

Value of obj1   1000
Value of obj1   2000
Value of no1    1000
Value of no2    2000
obj1 < obj2
After converting Integer class object into string as1000

*/