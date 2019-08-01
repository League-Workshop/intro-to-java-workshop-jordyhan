package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below
	public static void main(String[]args) {
		
		int thing = new Random().nextInt(4);


		System.out.println(thing);
		if(thing == 0){
			
		JOptionPane.showMessageDialog(null, "is awesome!");
			
		}		
		System.out.println(thing);
		if(thing == 1){
		JOptionPane.showMessageDialog(null, "is ...");
			
		}			
		System.out.println(thing);
		if(thing == 2){
		JOptionPane.showMessageDialog(null, "is boring.");
		}
		System.out.println(thing);
		if(thing == 3){	
			
		JOptionPane.showMessageDialog(null, "is extremmely, extremely, extremely ... ... ... ... ... ... ... ");
		}	
					speak("oooooooooooooooooooof");




	}
		static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
	 catch (Exception e) {
		 e.printStackTrace();
	 }
}

}