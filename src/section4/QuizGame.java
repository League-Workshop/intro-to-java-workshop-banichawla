package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String football= JOptionPane.showInputDialog("Is Carson Weinz a football player?");
		// 3.  Use an if statement to check if their answer is correct
		if(football.equalsIgnoreCase("yes")) {
			score++;
		}
		String cricket= JOptionPane.showInputDialog("Does Arin Ramsey play cricket?");
		if(cricket.equalsIgnoreCase("no")) {
			score++;
		}
		String basketball= JOptionPane.showInputDialog("Does Stephen Starburg play basketball?");
		if(cricket.equalsIgnoreCase("no")) {
			score++;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
	}
}
