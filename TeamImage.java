package oop_project2;

//Code sample from http://www.tutorialspoint.com/awt/awt_image.htm

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

@SuppressWarnings("serial")
public class TeamImage extends Component {
	
	BufferedImage img;

	public void paint(Graphics g)
	{
		g.drawImage(img, 0, 0, null);
	}
	
	public TeamImage(String imgPath)
	{
		try{
			img = ImageIO.read(new File(imgPath));
			
			//System.out.println("Imagefile: " + imgPath);
			
		}catch (IOException e) { System.out.println("Cannot read image file"); }
	}
	
	public Dimension getPreferredSize() 
	{
		if(img == null){ return new Dimension(100, 100); }
		else return new Dimension(img.getWidth(), img.getHeight());
	}
}
