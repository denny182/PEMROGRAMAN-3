 package belajar.swing;
 
 import javax.swing.JFrame;
 import javax.swing.JLabel;

public class HaloSwing {
   public static void main(String[] xx) {
     
	 
	  JFrame fr = new JFrame();
	  fr.setTitle(":: Halo Swing ::");
	  
	  JLabel lb =  new JLabel ("Halo Swing");
	  fr.getContentpane().add(lb);
	  
	  fr.setSize(300,300);
	  fr.setVisble(true);
	}
}