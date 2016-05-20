import java.awt.Image;

import javax.swing.JButton;

public class GameController {
	GameFrame frame = new GameFrame();
	GamePanelUI gameField = new GamePanelUI();
	Ball ball = new Ball((ImageLoader.Load("ball.png")));
	Plank plank = new Plank();
	Brick brick = new Brick();
	Bonus bonus = new Bonus();
	ScoreCount score = new ScoreCount();
	LevelGenerator level = new LevelGenerator();
	
	protected void startGame() {
		//initialize elements at inital positions
		//if ENTER pressed start moving ball
		
	}
	protected void gameWon(){
		//showing dialog message with "You Won" and total score
	}
	protected void gameOver(){
		//showing dialog message with "You Lost" and total score
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
}
