import java.util.Scanner;
public class ArrayBasics {
	public static void main(String[] args){
		Scanner userInput=new Scanner(System.in);
		System.out.println("How many integers would you like to input?");
		int numofInt=userInput.nextInt();
		System.out.println("Thanks. Now input your integers!");
		int integer=userInput.nextInt();
		int inputNum=integer;
		int[] array=new int[numofInt];
		for(int i=0;i<numofInt;i++){
			if(inputNum>=-4 && inputNum<=5 && inputNum%2!=0){
				array[i]=inputNum;
			}
		}
		userInput.close();
	}
	
}
