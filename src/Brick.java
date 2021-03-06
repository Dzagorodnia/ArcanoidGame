import java.awt.Graphics;
import java.awt.Image;

public class Brick {
	Image image;
	private int width = 60;
	private int height = 30;
	private int x = 0;
	private int y = 0;

	protected void setDimensions(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void setBrickX(int x){
		this.x = x;
	}
	public void setBrickY(int y) {
		this.y = y;
		
	}
	public int getBrickX(){
		return x;
	}
	public int getBrickY(){
		return y;
	}

	protected int getBrickWidth() {
		return width;
	}

	protected int getBrickHeight() {
		return height;
	}

	public void draw(Graphics g) {
		g.drawImage(image, x, y, width, height, null);
	}
	

}
