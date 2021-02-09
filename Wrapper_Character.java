//program to demonstrate the concept of Character Wraper class
//methods : 
//charValue           
//compareTo
//toString
//isDigit
//isLetter
//isLowerCase
//isUpperCase


import java.lang.*;
import java.io.*;
import java.util.*;

class Wrapper_Character
{
  public static void main(String args[])
  {
	  Character obj1 = 'n';
	  Character obj2 = 'n';
	
	  char ch1 = obj1;
	  char ch2 = obj1.charValue();
	
	  System.out.println("Value of obj1\t"+obj1);
	  System.out.println("Value of ch1 \t"+ch1);
	  System.out.println("Value of ch2 \t"+ch2);
	  
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
	  
	  String str = obj1.toString();      //convert character class object into string
	  System.out.println("Value of str After converting character class object into string\t"+str);
	  
	  if(Character.isLetter(obj1))
	  {
		  System.out.println("It is Character");
	  }
	  if(Character.isDigit(obj1))
	  {
		  System.out.println("It is Digit");
	  }
	  	  if(Character.isUpperCase(obj1))
	  {
		  System.out.println("It is Upper Case Character");
	  }
	  	  if(Character.isLowerCase(obj1))
	  {
		  System.out.println("It is Lower Case Character");
	  }
	  }
}

/*output

Value of obj1   n
Value of ch1    n
Value of ch2    n
Both objects are equal
Value of str After converting character class object into string        n
It is Character
It is Lower Case Character
*/