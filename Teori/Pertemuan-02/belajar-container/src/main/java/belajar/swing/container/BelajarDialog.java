package belajar.swing.container;

import javax.swing.JFrame;

public class BelajarDialog{
   public static void main (String[] xx) {
   //membuat object fr yang bertipe JFrame
       JFrame fr = new JFrame();]
	   
	   //judul frame
	   fr.setTitle("Belajar Dialog");
	   
	   //ukurannya
	   fr.setSize(800,600);
	   fr.setLocationRelativeTo(null);
	   fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   fr.setVisible(true);
	   
	   JDialog jd = new JDialog();
	   fr.setSize(200,200);
	   fr.setLocationRelativeTo(null); 
	   JD.setTitle("dialog box");
	   jd.setModal(true);
	   jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	   
	   //delay dulu 5 detik
	   Thread sleep(5*1000);
	   
	   //tampilkan dialog
	   jd.setVisible(true);
   }
 }