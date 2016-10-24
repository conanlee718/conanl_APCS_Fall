import java.util.Scanner;

public class Split {
	
	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		System.out.println("What is your string?");                    //asks for String statement such as apples....breadlettucecheesebreadlettuce
		String statement=userInput.nextLine();
		String results[]=splittedString(statement,"bread");
			for(String part:results){
				System.out.print(part);
			}
	}

	public static String[] splittedString(String statement, String splitpoint){
		return(statement.split(splitpoint));
	}
	 
	
	
	
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		

	}




