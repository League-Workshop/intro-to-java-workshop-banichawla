package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	Random r=new Random();
	int change=r.nextInt(4);

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable
	System.out.println(change);
	// 4. Get the user to enter something that they think is awesome
String awsome= JOptionPane.showInputDialog("What do you think is awsome?");
	// 5. If the random number is 0
if(change==0) {
JOptionPane.showMessageDialog(null,"That's awsome!");
}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if(change==1) {
	JOptionPane.showMessageDialog(null,"That's good i guess!");	
}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if(change==2) {
	JOptionPane.showMessageDialog(null,"That's sooo boring!");	
}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if(change==3) {
	JOptionPane.showMessageDialog(null,"dude that's dumb!");	
}
	// -- write your own answer
       }
}


