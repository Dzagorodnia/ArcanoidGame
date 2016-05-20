import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Ball  {
	Image image;
	private int width = 30;
	private int height = 30;
	protected int x = 130;
	protected int y = 320;

	public Ball() {
		this.image = image;
	}
	protected void setDimensions(int width, int height){
		this.width = width;
		this.height = height;
	}
	protected int getBallWidth(){
		return width;
	}
	protected int getBallHeight(){
		return height;
	}

	
	public void draw(Graphics g) {
		g.drawImage(image, x, y, width, height,null);
	}
    public Coordinates getCoordiantes() {
        // TODO Auto-generated method stub
        return null;
    }
    public void invertVerticalSpeed() {
        // TODO Auto-generated method stub
        
    }

}
