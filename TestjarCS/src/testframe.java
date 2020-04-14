import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JFrame;
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
	public static void main(String[] args) throws IOException
	{
		testframe frame = new testframe();
		frame.setVisible(true);
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
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}
}