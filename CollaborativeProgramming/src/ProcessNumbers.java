//Author: Conan Lee APCS 2nd period
//Date started:9/28
//What we want:
// 1) Accepts as user input a string of numbers.
// 2) Prints the smallest and largest of all numbers supplied by user.
// 3) Prints the sum of all even numbers, along with largest even number typed.

import java.util.Scanner;

public class ProcessNumbers {
		
	public static void main(String[] args){
	Scanner userInput= new Scanner(System.in);
	System.out.println("How many integers would you like to input?"); //Determines number of inputs
	int numofInt=userInput.nextInt();
	System.out.println("Thanks. Now input your integers!");           //Determines the input values
	int min=userInput.nextInt();
	int max=min;
	int inputNumber=min;
	int evenSum=0;
	int largestEven=0;
	
	if(inputNumber%2==0){                           //Necessary because other if is for next input #
		evenSum+=inputNumber;
	}
	for(int i=1;i<numofInt;i++){
		inputNumber=userInput.nextInt();
		if(inputNumber<=min){
			min=inputNumber;
		} else if(inputNumber>=max){
			max=inputNumber;
		}
		if(inputNumber%2==0){
			evenSum+=inputNumber;
			if(inputNumber>largestEven){
				largestEven=inputNumber;
			}
		}
	}
	
	
	System.out.println("Smallest number is "+min+" and largest number is "+max+".");
	System.out.println("Sum of even numbers is "+evenSum+" and largest even is "+largestEven+".");
	userInput.close();
	}
}
	

