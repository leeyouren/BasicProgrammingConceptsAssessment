package rockpaperscissors;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
	
	
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int numberOfRounds;
		int currentRound = 1;
		int playerMove;
		int compMove;
		String roundResult;
		int winCounter = 0;
		int lossCounter = 0;
		int tieCounter = 0;
		String playAgainResponse = "y";
		boolean playAgain = false;
		boolean invalidResponse = false;	
		
		
		
		do {
			System.out.println("How many rounds will you like to play? (1-10)");
			numberOfRounds = Integer.parseInt(myScanner.nextLine());
			if(numberOfRounds < 1 || numberOfRounds > 10) {
				System.out.println("Error, the number you have selected is invalid. The system will now exit the program");
				
			}else {
				while(currentRound < numberOfRounds +1) {
					
					System.out.println("Select your move");
					System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
					playerMove = Integer.parseInt(myScanner.nextLine());
					compMove = randomlyChosenRPS();
					
					if (playerMove == 1 || playerMove == 2 || playerMove == 3){
						
						roundResult = determineWinner(playerMove,compMove); 
						
						 if (roundResult.equals("win")){
	                            winCounter++;
	                        }else if(roundResult.equals("lose")){
	                            lossCounter++;
	                        }else{
	                            tieCounter++;
	                        }
	                        currentRound++; 
					 } else {
	                        System.out.println("Response is invalid");
						
					}
				}
				
				System.out.println("========== RESULTS ==========");
				if(winCounter > lossCounter) {
					System.out.println("You win!");
				} else if(winCounter < lossCounter) {
					System.out.println("You lose!");
				} else {
					System.out.println("It's a draw!");
				}
                
                do {
                	System.out.println("Would you like to play again? (yes/no)");
                    playAgainResponse = myScanner.nextLine();
                    if(playAgainResponse.equals("yes")){
                        System.out.println("Let's play again!");
                        playAgain = true;
                        currentRound =1;
                        winCounter=0;
                        lossCounter=0;
                        tieCounter=0;
                        invalidResponse = false;
                    } else if (playAgainResponse.equals("no")){ 
                        playAgain = false;
                        invalidResponse = false;
                        System.out.println("See you next time!");
                    } else {
                        System.out.println("You entered an invaid response. Please try again.");
                        invalidResponse = true;
                    }
                }while(invalidResponse);    
                
            }
        }while (playAgain == true);	
	}

	private static String determineWinner(int playerMove, int compMove) {
		 String a = "draw";
	        if (playerMove == compMove){
	            System.out.println("Computer chose " + compMove + " It's a draw");
	            System.out.println("");
	        } 
	        if (playerMove == 1 && compMove == 2){ 
	            System.out.println("Computer chose " + compMove + " You lose");
	            System.out.println("");
	            a = "lose";   
	        }
	        if (playerMove == 1 && compMove == 3){
	            System.out.println("Computer chose " + compMove + " You win");
	            System.out.println("");
	            a = "win";   
	        }
	        if (playerMove == 2 && compMove == 1){
	            System.out.println("Computer chose " + compMove + " You Win");
		        System.out.println("");
	             a = "win";  
	        }
	        if (playerMove == 2 && compMove == 3){
	            System.out.println("Computer chose " + compMove + " You Lose");
	            System.out.println("");
	            a = "lose";   
	        }
	        if (playerMove == 3 && compMove == 1){
	            System.out.println("Computer chose " + compMove + " You lose");
		        System.out.println("");
	            a = "lose"; 
	        }
	        if (playerMove == 3 && compMove == 2){
	            System.out.println("Computer chose " + compMove + " You win");
	            System.out.println("");
	            a= "win";
	        }
		return a;
	}

	private static int randomlyChosenRPS() {
		Random randomNumber = new Random();
		int x = randomNumber.nextInt(3) + 1;
		return x;
	}


} //class
