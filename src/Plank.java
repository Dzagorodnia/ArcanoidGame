import java.awt.Rectangle;

public class Plank {
	int x = 0; //initial position x
	int y = 0; //initial pisition y
	
	int width;
	int height;
	
	int xSpeed = 0;
	int ySpeed =0;

    public Coordinates getCoordinates() {
        // TODO Auto-generated method stub
        return null;
    }
    
       
    public void invertHorizontalSpeed() {
    	xSpeed *= -1;
    }
    
    public void movePlank() {
		if (x + xSpeed > 0 && x + xSpeed < 300-width)
			x = x + xSpeed;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

}
