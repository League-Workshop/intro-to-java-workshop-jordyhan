package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("do you know the wea?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("Yes")) {
			score ++;						
		}
		else {
		JOptionPane.showMessageDialog(null,"YOU DO NOT KNOW THE WEA,YOU HAVE EBOLA!!!!!");		
		
		}
		String answer2 = JOptionPane.showInputDialog("do you know the wea?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("Yes")) {
		score ++;						
		}
		else {
		JOptionPane.showMessageDialog(null,"YOU DO NOT KNOW THE WEA,YOU HAVE EBOLA!!!!!");	
		
		score = + 0;
		
		}
		
		String answer3 = JOptionPane.showInputDialog("do you know the wea?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("Yes")) {
			 score  ++;						
		}
		else {
		JOptionPane.showMessageDialog(null,"YOU DO NOT KNOW THE WEA,YOU HAVE EBOLA!!!!!");
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 

		
		System.out.println(score);
	}

}