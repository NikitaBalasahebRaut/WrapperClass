//In java everything is considered as class .All premitive data type is considered as class
//program to deonstrate the concept of Wrapper class

class Wrapper
{
  public static void main(String args[])
  {
        int i = 11;
		Integer iobj = i;                                  //AutoBoxing
		
		System.out.println("value of iobj \t"+iobj);        //11
		System.out.println("Value of i \t"+i);              //11
		
		int j = iobj;                                       //AutoUnboxing
		System.out.println("value of j \t"+j);

  }
}  

/*
output of the program

value of iobj   11
Value of i      11
value of j      11

*/