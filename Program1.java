// Find the special characters in a string (not a whitespace , digit and letter)
public class Main
{
	public static void main(String[] args) {
		String s = "Ayush@!   %  #  * ()";
		int count = 0;
		String noSpecialCharacters = "";
		
		for(char ch : s.toCharArray()){
		    if(!Character.isWhitespace(ch) && !Character.isDigit(ch) && !Character.isLetter(ch)){
		        count++;
		    }else{
		        noSpecialCharacters += ch;
		    }
		}
		// 2nd question is print the string with no special characters
		System.out.println("String with no special characters are " + noSpecialCharacters);
		
		if(count == 0){
		    System.out.println("There are no special characters");;
		}else{
		    System.out.println("There are " + count + " special characters in string");
		}
	}
}



