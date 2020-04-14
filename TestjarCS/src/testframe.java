
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class testframe extends JFrame implements MouseListener
{
	public static final int LENGTH = 1600;
	public static final int HEIGHT = 1000;
	JLabel a, b, c, d;
	public testframe() throws IOException
	{
		super("Test Jar Derek");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setBounds(150, 25, LENGTH, HEIGHT);
		addMouseListener(this);
		super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("images\\background.png")))));	
		init();
	}
	public void init() throws IOException
	{
		a = new JLabel();
		a.setIcon(new ImageIcon(new ImageIcon("images\\restinpeacetruesoldier.png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		super.add(a);
		a.setBounds(100, 225, 260, 350);
		
		b = new JLabel();
		b.setIcon(new ImageIcon(new ImageIcon("images\\1.png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		super.add(b);
		b.setBounds(475, 225, 260, 350);
		
		c = new JLabel();
		c.setIcon(new ImageIcon(new ImageIcon("images\\3.png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		super.add(c);
		c.setBounds(850, 225, 260, 350);
		
		d = new JLabel();
		d.setIcon(new ImageIcon(new ImageIcon("images\\5.png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		super.add(d);
		d.setBounds(1225, 225, 260, 350);
	}
	public void mouseClicked(MouseEvent arg0)
	{
	}
	public void mouseEntered(MouseEvent arg0)
	{
	}	
	public void mouseExited(MouseEvent arg0)
	{
	}
	public void mousePressed(MouseEvent arg0)
	{
	}
	public void mouseReleased(MouseEvent event)
	{ 
		int num = (int) Math.floor(Math.random() * (18) + 1);
		System.out.println(num);
		//a
		if (event.getX() < 360 && event.getY() < 585 && event.getX() > 100  && event.getY() > 225) // shows card window
		{
//			System.out.println("Pressed 1");
			if(num==6)
				a.setIcon(new ImageIcon(new ImageIcon("images\\restinpeacetruesoldier.png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
			else
				a.setIcon(new ImageIcon(new ImageIcon("images\\"+num+".png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));

		}
		//b
		else if (event.getX() < 735 && event.getY() < 585 && event.getX() > 475  && event.getY() > 225) // shows card window
		{
//			System.out.println("Pressed 2");
			if(num==6)
				b.setIcon(new ImageIcon(new ImageIcon("images\\restinpeacetruesoldier.png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
			else
				b.setIcon(new ImageIcon(new ImageIcon("images\\"+num+".png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));

		}
		//c
		else if (event.getX() < 1100 && event.getY() < 585 && event.getX() > 850  && event.getY() > 225) // shows card window
		{
//			System.out.println("Pressed 3");
			if(num==6)
				c.setIcon(new ImageIcon(new ImageIcon("images\\restinpeacetruesoldier.png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
			else
				c.setIcon(new ImageIcon(new ImageIcon("images\\"+num+".png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));

		}
		//d
		else if (event.getX() < 1485 && event.getY() < 585 && event.getX() > 1225  && event.getY() > 225) // shows card window
		{
//			System.out.println("Pressed 4");
			if(num==6)
				d.setIcon(new ImageIcon(new ImageIcon("images\\restinpeacetruesoldier.png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
			else
				d.setIcon(new ImageIcon(new ImageIcon("images\\"+num+".png").getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));

		}
	}	
	public static void main(String[] args) throws IOException
	{
		testframe frame = new testframe();
		frame.setVisible(true);
	}
}