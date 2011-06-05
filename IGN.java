
public class IGN{
	
	
	public static String chessBoard[][] = new String[8][8];
	public static int currentX = 2, currentY = 7;
	
	public static void main(String args[]){
		
		/*
		 * Hello there person from IGN who will be reviewing my application!
		 * I have hard coded a sequence in which a knight will traverse an 8x8 chess board
		 * the least amount of turns possible in order for a knight to cover a chess board is 21
		 * turns. This is due to the fact that a knights first turn will always cover 4 spots. Thereafter,
		 * knights will only cover 3 spots by design.
		 * 
		 * I've created a multi-dimensional array to represent the chess board and several functions emulating
		 * possible knight movements.
		 * 
		 * the '*'s stand for a space the knight has traversed while the '0' stands for undiscovered territory
		 * 
		 * 
		 * After each position is called, a 1000 millisecond delay is added in order to show the progress in
		 * real time. 
		 * 
		 * 
		 */


		set();			//initializes the chess board with empty spaces ('0')

		chessBoard[2][7]="*";	//the starting point is now marked with a "*"

		position3();	//1
		position4();	//2
		position3();	//3
		position4();	//4
		position3();	//5
		position1();	//6
		position2();	//7
		position1();	//8
		position2();	//9
		position1();	//10
		position5();	//11
		position6();	//12
		position5();	//13
		position6();	//14
		position5();	//15
		position7();	//16
		position8();	//17
		position9();	//18
		position10();	//19
		position11();	//20
		position12();	//21 turns

		System.out.println("SCOOP! program finished, BEYOND!");
	}		//end main
	
	
	/********************************************************************/
	
	public static void set(){		//will set all the variables in the two dimensional array to 0 meaning knight has not traversed here
		for(int i = 0; i < 8;i++){
			for(int j = 0; j<8; j++){
				chessBoard[j][i] = "0";
			}
		}
	}
	/********************************************************************/
	public static void print(){		//will print the contents of the table
		
		for(int i = 7; i >= 0;i--){

			for(int j = 0; j<8; j++){
				System.out.print(chessBoard[j][i] + "  ");
				if(j == 7)
					System.out.print("\n");
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}		//end print function
	/********************************************************************/
	public static void position1(){
		/*
		 x
		 0
		 0  0
		 */
		int tempY = currentY - 1;
		chessBoard[currentX][tempY] = "*";
		tempY = tempY- 1;
		chessBoard[currentX][tempY] = "*";
		int tempX = currentX + 1;
		chessBoard[tempX][tempY] = "*";
		currentX = tempX;
		currentY = tempY;
		print();
	}
	/********************************************************************/
	public static void position2(){
		/*
		This is the position:
		0  0
		0  
		x 
		 */
		int tempY = currentY + 1;
		chessBoard[currentX][tempY] = "*";
		tempY = tempY + 1;
		chessBoard[currentX][tempY] = "*";
		int tempX = currentX + 1;
		chessBoard[tempX][tempY] = "*";
		currentX = tempX;
		currentY = tempY;
		print();
	}
	/********************************************************************/
	public static void position3(){
		/*
		 this is the position:
		 0  0  x
		 0
		 */
		
		int tempX = currentX - 1;
		chessBoard[tempX][currentY] = "*";
		tempX = tempX - 1;
		chessBoard[tempX][currentY] = "*";
		int tempY = currentY-1;
		chessBoard[tempX][tempY] = "*";
		currentX = tempX;
		currentY = tempY;
		print();
	}
	/********************************************************************/
	public static void position4(){
		/*
		 this is the position:
		 x  0  0
		 	   0
		 */
		
		int tempX = currentX + 1;
		chessBoard[tempX][currentY] = "*";
		tempX = tempX + 1;
		chessBoard[tempX][currentY] = "*";
		int tempY = currentY-1;
		chessBoard[tempX][tempY] = "*";
		currentX = tempX;
		currentY = tempY;
		print();
	}
	/********************************************************************/
	public static void position5(){
		/*
		 this is the position:
		      0
		x  0  0
		 */
		
		int tempX = currentX + 1;
		chessBoard[tempX][currentY] = "*";
		tempX = tempX + 1;
		chessBoard[tempX][currentY] = "*";
		int tempY = currentY+1;
		chessBoard[tempX][tempY] = "*";
		currentX = tempX;
		currentY = tempY;
		print();
	}
	/********************************************************************/
	public static void position6(){
		/*
		 this is the position:
		 0
		 0  0  x
		 */
		
		int tempX = currentX - 1;
		chessBoard[tempX][currentY] = "*";
		tempX = tempX - 1;
		chessBoard[tempX][currentY] = "*";
		int tempY = currentY+1;
		chessBoard[tempX][tempY] = "*";
		currentX = tempX;
		currentY = tempY;
		print();	
	}
	/********************************************************************/
	public static void position7(){
		/*
		This is the position:
		0  0  
		   0  
		   x 
		 */
		
		int tempY = currentY + 1;
		chessBoard[currentX][tempY] = "*";
		tempY = tempY + 1;
		chessBoard[currentX][tempY] = "*";
		int tempX = currentX - 1;
		chessBoard[tempX][tempY] = "*";
		currentX = tempX;
		currentY = tempY;
		print();
	}
	/********************************************************************/
	public static void position8(){
		/*
		    x
		    0
		 0  0
		 */
		int tempY = currentY - 1;
		chessBoard[currentX][tempY] = "*";
		tempY = tempY- 1;
		chessBoard[currentX][tempY] = "*";
		int tempX = currentX - 1;
		chessBoard[tempX][tempY] = "*";
		currentX = tempX;
		currentY = tempY;
		print();
	}
	/********************************************************************/
	public static void position9(){
		/*
	 0  x
	 0   
	 0  
	 */

		int tempX = currentX - 1;
		chessBoard[tempX][currentY] = "*";
		int tempY = currentY - 1;
		chessBoard[tempX][tempY] = "*";
		tempY = tempY- 1;
		chessBoard[tempX][tempY] = "*";
		currentX = tempX;
		currentY = tempY;
		print();		
	}
	/********************************************************************/
	public static void position10(){
		/*
		 0  
		 0   
		 0  x
		 */

			int tempX = currentX - 1;
			chessBoard[tempX][currentY] = "*";
			int tempY = currentY + 1;
			chessBoard[tempX][tempY] = "*";
			tempY = tempY + 1;
			chessBoard[tempX][tempY] = "*";
			currentX = tempX;
			currentY = tempY;	
			print();
	}
	/********************************************************************/
	public static void position11(){
		/*
		0  0  0
		x
		 */
			int tempY = currentY + 1;
			chessBoard[currentX][tempY] = "*";
			int tempX = currentX + 1;
			chessBoard[tempX][tempY] = "*";
			tempX = tempX + 1;
			chessBoard[tempX][tempY] = "*";

			currentX = tempX;
			currentY = tempY;
			
			print();
	}
	/********************************************************************/
	public static void position12(){
		/*
		0  0  0
			  x
		 */
			int tempY = currentY + 1;
			chessBoard[currentX][tempY] = "*";
			int tempX = currentX - 1;
			chessBoard[tempX][tempY] = "*";
			tempX = tempX - 1;
			chessBoard[tempX][tempY] = "*";

			currentX = tempX;
			currentY = tempY;
			
			print();
	}

}			//end class

