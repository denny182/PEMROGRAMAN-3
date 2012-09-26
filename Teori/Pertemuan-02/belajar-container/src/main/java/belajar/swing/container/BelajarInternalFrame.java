package belajar.swing.container;

import javax.swing.JFrame;
import javax.swing.JD

public class BelajarInternalFrame{
   public static void main (String[] xx) {
   //membuat object fr yang bertipe JFrame
       JFrame fr = new JFrame();]
	   
	   //judul frame
	   fr.setTitle("Belajar Internal Frame");
	   
	   //ukurannya
	   fr.setSize(800,600);
	   fr.setLocationRelativeTo(null);
	   fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   JDesktopPane jdp = new JDesktopPane();
	   
	   ifr.setTitle("ini internal frame")
	   ifr.setSize(200,200);
	   ifr.setClosable(true);
	   ifr.setResizable(true);
	   ifr.setIconifiable(true);
	   ifr.setMaxi
	   jdp.add(ifr);
	   ifr.setVisble(true);
	   
	   fr.setContentPane(jdp);
	   fr.setVisible(true);
	   
	   
   }
 }