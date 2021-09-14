/*
* Author: Colin Bradshaw
*/
public class Assignment1{
	/*
	* Exercise on formatting output
	*/
	public static void main(String[] args){
		Assignment1 Fo = new Assignment1();
		
		// pattern 1
		System.out.println("1)");
		for(int i = 1; i < 5; i++){
			Fo.printChar('*', i);
			System.out.println();
		}
		Fo.printChar('.', 9);
		System.out.println();
		
		// pattern 2
		System.out.println("2)");
		Fo.printChar('.', 9);
		System.out.println();
		for(int i = 4; i > 0; i--){
			Fo.printChar('*', i);
			System.out.println();
		}
		
		//pattern 3
		System.out.println("3)");
		for(int i = 1; i < 9; i+=2){
			Fo.printChar('*', i, 11);
			System.out.println();
		}
		Fo.printChar('.', 11);
		System.out.println();
		
		// pattern 4
		System.out.println("4)");
		Fo.printChar('.', 11);
		System.out.println();
		for(int i = 7; i > 0; i-=2){
			Fo.printChar('*', i, 11);
			System.out.println();
		}
	}
	
	// prints specified character a number of times
	private void printChar(char x, int n){
		if(n > 0){
			System.out.print(x);
			printChar(x, n-1);
		}
	}
	
	// allows for left and right padding totalling (width - n) / 2
	// ideally, width - n  should be an even number
	private void printChar(char x, int n, int width){
		if(n > 0) {
			printChar(' ', ((width - n) / 2));
			printChar(x, n);
			printChar(' ', ((width - n) / 2));
		}
	}
	
}


