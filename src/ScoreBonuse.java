import java.awt.Graphics;

public class ScoreBonuse extends Bonus {
	private int width = 60;
	private int height = 30;
	private int x = 0;
	private int y = 0;

	protected void setDimensions(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void setScoreBonusX(int x){
		this.x = x;
	}
	public void setScoreBonusY(int y) {
		this.y = y;
		
	}
	public int getScoreBonusX(){
		return x;
	}
	public int getScoreBonusY(){
		return y;
	}

	protected int getScoreBonusWidth() {
		return width;
	}

	protected int getScoreBonusHeight() {
		return height;
	}

	public void draw(Graphics g) {
	}
	


}
