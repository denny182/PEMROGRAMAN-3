import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.*;
import javax.swing.JOptionPane;

public class action{

	public static void main(String args[] ){
	final JButton btnClick = new JButton("Click Me !");
	JPanel canvas = new JPanel(new FlowLayout(FlowLayout.CENTER,0,70));
	canvas.add(btnClick);
	class click implements ActionListener{
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null,"You Click me guys");
				btnClick.setEnabled(true);
			}
		}	

	click c = new click();
	btnClick.addActionListener(c);

	 JFrame fr = new JFrame("tugas praktikum");
	 fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 fr.getContentPane().add(canvas);

	  fr.setSize(150,150);	
	  fr.setLocationRelativeTo(null);
	  fr.setVisible(true);

	 }
}