
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class framea extends JFrame implements MouseListener
{
	public static final int LENGTH = 1600;
	public static final int HEIGHT = 1000;
	JLabel a, b, c, d;
	public framea() throws IOException
	{
		super("Team Derek Jar");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setBounds(150, 25, LENGTH, HEIGHT);
		addMouseListener(this);
		super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(framea.class.getResource("background.png")))));	
		init();
	}
	public void init() throws IOException
	{
		int num = (int) Math.floor(Math.random() * (18) + 1);
//		System.out.println(num);
		
		a = new JLabel();
		if(num==6)
			a.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource("ripsoldier.png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		else
			a.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource(num+".png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		super.add(a);
		a.setBounds(100, 225, 260, 350);
		
		num = (int) Math.floor(Math.random() * (18) + 1);
		
		b = new JLabel();
		if(num==6)
			b.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource("ripsoldier.png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		else
			b.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource(num+".png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		super.add(b);
		b.setBounds(475, 225, 260, 350);
		
		num = (int) Math.floor(Math.random() * (18) + 1);
		
		c = new JLabel();
		if(num==6)
			c.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource("ripsoldier.png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		else
			c.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource(num+".png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		super.add(c);
		c.setBounds(850, 225, 260, 350);
		
		num = (int) Math.floor(Math.random() * (18) + 1);
		
		d = new JLabel();
		if(num==6)
			d.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource("ripsoldier.png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
		else
			d.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource(num+".png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
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
		try
		{
			int num = (int) Math.floor(Math.random() * (18) + 1);
//			System.out.println(num);
			//a
			if (event.getX() < 360 && event.getY() < 585 && event.getX() > 100  && event.getY() > 225) // shows card window
			{
	//			System.out.println("Pressed 1");
				if(num==6)
					a.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource("ripsoldier.png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
				else
					a.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource(num+".png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
			}
			//b
			else if (event.getX() < 735 && event.getY() < 585 && event.getX() > 475  && event.getY() > 225) // shows card window
			{
	//			System.out.println("Pressed 2");
				if(num==6)
					b.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource("ripsoldier.png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
				else
					b.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource(num+".png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
			}
			//c
			else if (event.getX() < 1100 && event.getY() < 585 && event.getX() > 850  && event.getY() > 225) // shows card window
			{
	//			System.out.println("Pressed 3");
				if(num==6)
					c.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource("ripsoldier.png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
				else
					c.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource(num+".png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
			}
			//d
			else if (event.getX() < 1485 && event.getY() < 585 && event.getX() > 1225  && event.getY() > 225) // shows card window
			{
	//			System.out.println("Pressed 4");
				if(num==6)
					d.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource("ripsoldier.png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
				else
					d.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(framea.class.getResource(num+".png"))).getImage().getScaledInstance(260, 350, Image.SCALE_DEFAULT)));
			}
		}
		catch (Exception x)
		{
//			System.out.println(x);
		}
	}	
	public static void main(String[] args) throws IOException
	{ 
		framea frame = new framea();
		frame.setVisible(true);
	}
}