import java.util.Arrays;

public class Split {
	
	//main should use methods where you make strings and call methods.
	public static void main(String[] args) {
		
	/*	
		String statement="I really like really red apples";               //This is for playing around with string split method
		String[] newStatement=statement.split("really");
		System.out.println(Arrays.toString(newStatement));
		
	*/
		splitBread("applespineapplesbreadlettustomatobaconmayohambreadcheese");
	}

	 //chunk code: (1) is it a sandwich? (2) test 1 (3) test 2 (4) process the sandwich
	public static String splitBread(String statement){
		String[] ingredients = statement.split("bread");
		if (statement.indexOf("bread") < 2){						//testing if it is initially a sandwich. Less than 2 breads is not a sandwich.
			return ("This is not a sandwich.");
		}else if(statement.indexOf("bread")==2){
			
			
			//return(Arrays.toString(ingredients));
		}
	}
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
		
	/*
	public static void main(String[] args){
		String s="I really like really like apples";
	  String[] newS=s.split("really");
	  System.out.println(Array.toString(newS));
	}
	*/
	
		
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

		

	




