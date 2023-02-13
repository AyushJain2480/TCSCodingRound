// String1 = ABCD
// String2 = CDAB
// You have to write a program which will check whether the strings are in rotation of each other or not 

// Is CDAB is a rotation of ABCD?
// I will append the ABCD twice and try to find if CDAB is present in this 
// ABCDABCD --- CDAB
// ABCD
// DABC
// CDAB

// The .indexOf() method is used to find the first occurrence of a specified string value in a given string. It returns the index of the first occurrence of the specified value, or -1 if the value is not found.

// So in this case, the expression ("ABCDABCD").indexOf("CDAB") returns the index of the first occurrence of "CDAB" in the string "ABCDABCD".

// The final part of the expression, != -1, checks if the result of .indexOf() is not equal to -1. In other words, it checks if the string "CDAB" was found in the string "ABCDABCD".

// So the expression as a whole will return true if "CDAB" can be found in "ABCDABCD", and false otherwise.

public class Main
{
	public static void main(String[] args) {
	  
	  String str = "ABCD";
	  String afterRotation = "CDAF";
	  if(isRotation(str , afterRotation)){
	      System.out.println("Strings are in rotation");
	  }else{
	      System.out.println("Strings are not in rotation");
	  }
	 
	}
	// I need to check that second is rotation of first
	// (str + str).indexOf(afterRotation) != -1)
	// When the index is not equal to -1 means the string is present in the first string as a substring
	public static boolean isRotation(String str , String afterRotation){
	    return (str.length() == afterRotation.length() && (str + str).indexOf(afterRotation) != -1);
            // we can also use 
            // return (str.length() == afterRotation.length() && (str + str).contains(afterRotation));
	}
}
