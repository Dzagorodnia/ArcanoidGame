import java.awt.Graphics;
import java.awt.Image;

public class Ball  {
	Image image;
	private int width = 30;
	private int height = 30;
	protected int x = 130;
	protected int y = 320;
	
	private int xSpeed = 0; //can cause problems!!!!!
	private int ySpeed = 0;//!!!!

	public void setDimensions(int width, int height){
		this.width = width;
		this.height = height;
	}
	public int getBallWidth(){
		return width;
	}
	public int getBallHeight(){
		return height;
	}
	public void setSpeed(int xSpeed, int ySpeed){
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	
	public void draw(Graphics g) {
		g.drawImage(image, x, y, width, height,null);
	}
   
   
	  public void invertVerticalSpeed() {
	    	ySpeed *= -1;
	        
	    }
	    public void invertHorizontalSpeed() {
	    	xSpeed *= -1;
	    }

}
