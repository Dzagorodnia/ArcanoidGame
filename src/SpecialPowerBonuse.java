import java.awt.Graphics;

public class SpecialPowerBonuse extends Bonus {
	private int width = 60;
	private int height = 30;
	private int x = 0;
	private int y = 0;

	protected void setDimensions(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void setSpecialPowerBonusX(int x){
		this.x = x;
	}
	public void setSpecialPowerBonusY(int y) {
		this.y = y;
		
	}
	public int getSpecialPowerBonusX(){
		return x;
	}
	public int getSpecialPowerBonusY(){
		return y;
	}

	protected int getSpecialPowerBonusWidth() {
		return width;
	}

	protected int getSpecialPowerBonusHeight() {
		return height;
	}

	public void draw(Graphics g) {
	}
	

}
