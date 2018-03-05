/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select â€œCopy Image URLâ€�)
String image = "https://www.codeproject.com/KB/GDI-plus/ImageProcessing2/flip.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component kayla;
		// 3. use the "createImage()" method below to initialize your Component
kayla = createImage(image);
		// 4. add the image to the quiz window
quizWindow.add(kayla);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String fur = JOptionPane.showInputDialog("Is this dogs fur color brown");
		// 7. print "CORRECT" if the user gave the right answer
if (fur.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null, "Correct");
}else{
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(kayla);
		// 10. find another image and create it (might take more than one line of code)
String pic = "https://www.bmw.com.ph/content/dam/bmw/common/all-models/4-series/gran-coupe/2017/images-and-videos/images/BMW-4-series-gran-coupe-images-and-videos-1920x1200-03.jpg.asset.1487328215131.jpg";
		// 11. add the second image to the quiz window
Component wright;
wright = createImage(pic);
quizWindow.add(wright);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String car = JOptionPane.showInputDialog("Is this a BMW");
		// 14+ check answer, say if correct or incorrect, etc.
if (car.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "Correct");
}else{
	JOptionPane.showMessageDialog(null, "Incorrect");
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





