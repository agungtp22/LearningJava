import java.util.Scanner;
public class CountVowel{
	//make your main class
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//oh yeah i'm forgot something
		String someString = input.nextLine();
		System.out.println(CountVowelString(someString));
	}
	//now make method for Count a vowel
	public static int CountVowelString(String s){
		//define variable
		s = s.toLowerCase();
		int count = 0;
		char c;//to save temp character
		//create your base case
		if(s.length() < 1) return 0; // the base case
		else
			c = s.charAt(0); //to get first character of string
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				count++;
			}
			return count+CountVowelString(s.substring(1));
			//now we will compile this program
	}
}