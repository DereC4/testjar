import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class testframe extends JFrame implements MouseListener
{
	public static final int LENGTH = 1600;
	public static final int HEIGHT = 1000;

	public testframe() throws IOException
	{
		super("Seven Wonders");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setBounds(150, 25, LENGTH, HEIGHT);
		addMouseListener(this);
	}
	public void paint(Graphics g)
	{
		try
		{
			int ok = (int) Math.floor(Math.random() * (11) + 90);
			BufferedImage a, b, c, d;
			if(ok == 6)
				a = ImageIO.read(new File("images\\assets\\coin.png"));
			b = ImageIO.read(new File("images\\assets\\victory1.png"));
			c = ImageIO.read(new File("images\\assets\\victoryminus1.png"));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}
	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent event)
	{
		if (event.getX() < 1100 && event.getY() < 200 && event.getX() > 1000 && event.getY() > 100) // shows card window
		{
			
		}
		repaint();
	}	
	public static void main(String[] args) throws IOException
	{
		testframe frame = new testframe();
		frame.setVisible(true);
	}
}