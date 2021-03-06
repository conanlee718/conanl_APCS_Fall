//Conan Lee
//APCS 2nd period
//Date Finished: 10/30/16
//Working with String split

import java.util.Arrays;

public class Split {
	
	//main should use methods where you make strings and call methods.
	public static void main(String[] args) {
		
		//String statement="I really like really red apples";               //This is for playing around with string split method
		//String[] newStatement=statement.split("really");
		//System.out.println(Arrays.toString(newStatement));
		
		System.out.println(splitBread("applespineapplesbreadlettustomatobaconmayohambreadcheese"));
		System.out.println(splitBread2("apples pineapples bread lettus tomato bacon mayo ham bread cheese"));
	}

	 //chunk code: (1) is it a sandwich? (2) test 1 (3) test 2 (4) process the sandwich
	public static String splitBread(String statement){
		int countBread=0;                                                  
		String result;
		for(int i=0;i<statement.length()-4;i++){						
			if(statement.substring(i,i+5).equals("bread")){				//checks if substring is "bread"
				countBread+=1;											//countBread counts amount of bread in given string
			}
		}
		if(countBread<2){												//tests if string has less than 2 breads, meaning it is not a sandwich
			result=" This is not a sandwich. ";
		}else{
			int firstBread=statement.indexOf("bread")+5;				//finds index after last character of "bread"
			String lastBread=statement.substring(firstBread);
			String Ingredients=lastBread.substring(0, lastBread.lastIndexOf("bread"));
			if(Ingredients.indexOf("bread")>=0){
				String[] sandwich=Ingredients.split("bread");
					if(sandwich.length== 0){							//if we split bread and the result has nothing in between, then it is not a sandwich
						result=" This is not a sandwich. ";				//^^With this, we can declare "breadbreadbread" or "breadbread" or "breadbreadbreadbread" as non sandwiches
					}else{
						result=Arrays.toString(sandwich);
					}
			}else{
				result="["+Ingredients+"]";
			}
		}
		result = result.substring(1,result.length()-1);			        //this is to take out the brackets ([]) 
		return(result);
	}
	
	public static String splitBread2(String statement){
		String[] noSpace=statement.split(" ");	                        //This first splits the spaces, or takes out all spaces
		String newStatement="";
		for(String part:noSpace){										//for each loop to print out each part or content
			newStatement+=part;
		}								
		int countBread=0;                                               //Rest of code below is repetition of part 1 code   
		String result="";
		for(int i=0;i<newStatement.length()-4;i++){
			if(newStatement.substring(i,i+5).equals("bread")){
				countBread+=1;
			}
		}
		if(countBread<2){
			result=" This is not a sandwich. ";
		}else{
			int firstBread=newStatement.indexOf("bread")+5;
			String lastBread=newStatement.substring(firstBread);
			String Ingredients=lastBread.substring(0, lastBread.lastIndexOf("bread"));
			String[] sandwich=Ingredients.split("bread");
				if(sandwich.length == 0){
					result=" This is not a sandwich. ";
				}else{
					for(String part:sandwich){
						result+=part;
					}
				}
			}
		return(result);
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

		

	




