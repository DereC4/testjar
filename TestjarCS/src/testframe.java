import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class testframe extends JFrame
{
	private JPanel welcome;
	private JLabel to, summoners, rift;

	public testframe()
	{
		int ok;
		String idk;
		
		super.setName("Hamp Grading Simulator");
		super.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		welcome = new JPanel();
		welcome.setBorder(new EmptyBorder(9, 9, 9, 9));
		setContentPane(welcome);
		welcome.setLayout(null);
		
		to = new JLabel();
		to.setFont(new Font("Arial", Font.PLAIN, 70));
		to.setHorizontalAlignment(SwingConstants.CENTER);
		to.setBounds(10, 11, 414, 103);
		welcome.add(to);
		
//		summoners = new JLabel("Hamp Grading Simulator");
//		summoners.setFont(new Font("Arial", Font.PLAIN, 35));
//		summoners.setHorizontalAlignment(SwingConstants.CENTER);
//		summoners.setBounds(10, 55, 414, 103);
//		welcome.add(summoners);
		
//		rift = new JLabel("<html>To remove this annoying message in "
//				+ "<br/>the middle of your simulator, <br/>all you have to do is pay up!<html>");
//		rift.setFont(new Font("Arial", Font.PLAIN, 15));
//		rift.setHorizontalAlignment(SwingConstants.CENTER);
//		rift.setBounds(10, 100, 414, 103);
//		welcome.add(rift);
		 
		ok = (int) Math.floor(Math.random() * (11) + 90);
//		System.out.println(x);
		idk = String.valueOf(ok);
		to.setText(idk);
	}
	public static void main(String[] args)
	{
					testframe frame = new testframe();
					frame.setVisible(true);
	}
}