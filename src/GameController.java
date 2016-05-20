import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class GameController {
    private List<Consumer<String>> listeners = new LinkedList<>();
	
	public void startGame() {
	    Plank plank = new Plank();
	    Borders borders = new Borders();
	    Ball ball = new Ball();
	    UI ui = new UI();
	    
	    ui.print(plank, borders, ball);
	    List<Brick> bricks = LevelGenerator.generateBricks();
	    while(! bricks.isEmpty()){
	        movePlank(plank);
	        moveBall(ball);
	        
	        if(plankHit(plank, ball)){
	            ball.invertVerticalSpeed();
	        }
	        
	        if(brickHit(bricks, ball)){
	            Brick brick = hitBrick(bricks, ball);
	            bricks.remove(brick);
	            ball.invertVerticalSpeed();
	        }
	        
	        if(borderHit(borders, ball)){
	            
	        }
	        
	        ui.print(plank, borders, ball);
	    }
	}
	
	private Brick hitBrick(List<Brick> bricks, Ball ball) {
        // TODO Auto-generated method stub
        return null;
    }

    private boolean borderHit(Borders borders, Ball ball) {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean brickHit(List<Brick> bricks, Ball ball) {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean plankHit(Plank plank, Ball ball) {
        // TODO Auto-generated method stub
        return false;
    }

    private void moveBall(Ball ball) {
        // TODO Auto-generated method stub
        
    }

    private void movePlank(Plank plank) {
        // TODO Auto-generated method stub
        
    }

    protected void mainGameController(){
		while (true) {
			//move ball
			//move plank
			//UIrepaint
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public void addCloseListener(Consumer<String> listener) {
        this.listeners.add(listener);   
    }
}
