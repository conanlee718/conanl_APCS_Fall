public class HourglassCode {
	public static void main(String[] args) {
		printBase(); //Print the firstline
		topHalf(); //Print the top half
		System.out.println("     ||     ");
		bottomHalf();
		printBase();
	}

	public static void topHalf(){
		int colons=0;
		for (int i=1; i <=4; i++){//print each line
			//print spaces
			for (int j=1; j<=i; j++){
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int j=4; j>colons; j--){
				System.out.print("::");
			}
			System.out.println("/");
			colons++;
		}
	}
	public static void printBase(){
	System.out.print("|");
		for (int i = 1; i<=10;i++){
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static void bottomHalf(){
		int colons=3;
		for(int i=4;i>=1;i--){
			//print spaces
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			System.out.print("/");
			for(int k=4;k>colons;k--){
				System.out.print("::");
			}
			System.out.println("\\");
			colons--;
		}
	}
}
