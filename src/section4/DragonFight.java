package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main bethod (below) 
	public static void main(String[] args) {
		
		Random r = new Random();
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
	
		
		int playerHealth = 100;
	
		
		int dragonHealth = 100;
		
		
		int playerDMG = 0;
		
		
		int DragonDMG = 0;
		
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		
		String action = JOptionPane.showInputDialog(" type if you want to attack the dragon with a yell or a kick");
		
		if(action.equalsIgnoreCase("Yell")) {
			DragonDMG = r.nextInt(10);
			
			dragonHealth -= DragonDMG;
			
		}
		if(action.equalsIgnoreCase("Kick")) {
			DragonDMG = r.nextInt(25);
			
			dragonHealth -= DragonDMG;
		}
		
		int dodge  = 0;
		
		dodge = r.nextInt(100);
		
		if(dodge <=25) {
			
			
		}
		else {
		
			playerDMG = r.nextInt(35);
			
			playerHealth -= playerDMG;
			
		}
			
			
			if(playerHealth <= 0){
				
			JOptionPane.showMessageDialog(null, "You have lost the game and the dragon dabs on you");
				
			}
			else{
				if(dragonHealth <= 0){
					JOptionPane.showMessageDialog(null, "You have won the game and then you dab on the dragon");					
				}
				else {
					JOptionPane.showMessageDialog(null, "Your health is " + playerHealth + ". You took " + playerDMG + " points of damage" +
							
														"The Dragon's health is " + dragonHealth + ". The Dragon took " + DragonDMG + " points of damage");					
					
					
				}
			}
		
			
		{
		}
				
		}
	}
	}
