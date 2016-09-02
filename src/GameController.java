import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class GameController {
	private List<Consumer<String>> listeners = new LinkedList<>();

	public void startGame() {
		Plank plank = new Plank();
		Borders borders = new Borders();
		Ball ball = new Ball();
		ScoreCount score = new ScoreCount();
		UI ui = new UI();
		LevelsContainer levelsContainer = new LevelsContainer();

		List<Level> levels = levelsContainer.getLevelsContainer();

		ui.print(plank, borders, ball);

		while (!levels.isEmpty()) {
			for (Level levelItem : levels){
		List<Brick> bricks = levelItem.bricksGenerator();
		List<ScoreBonuse> scoreBonuses = levelItem.scoreBonusesGenerator();
		List<SpecialPowerBonuse> spBonuses = levelItem.specialPowerBonusesGenerator();
		while (!bricks.isEmpty()) {
			movePlank(plank);
			moveBall(ball);

			if (plankHit(plank, ball)) {
				ball.invertVerticalSpeed();
			}

			if (brickHit(bricks, ball)) {
				Brick brick = hitBrick(bricks, ball);
				bricks.remove(brick);
				ball.invertVerticalSpeed();
			}
			if (ScoreBonusHit(scoreBonuses, ball)) {
				ScoreBonuse scoreBonus = hitScoreBonus(scoreBonuses, ball);
				scoreBonuses.remove(scoreBonus);
				score.scoreCount(100);

			}
			if (SpecialPowerBonusHit(spBonuses, ball)) {
				SpecialPowerBonuse spBonus = hitSpecialPowerBonus(scoreBonuses, ball);
				spBonuses.remove(spBonus);
				//if score bonus is ON check. If true make SP power OFF
			}

			if (borderHit(borders, ball)) {
				if (hitVerticalBorders(borders, ball)) {
					if (hitDownBorder(borders, ball)) {
						gameOver(score);
						break; // ???? use labeled break
					} else {
						ball.invertVerticalSpeed();
					}
				}
				if (hitHorizontalBorders(borders, ball)) {
					ball.invertHorizontalSpeed();
				}

			}
			ui.print(plank, borders, ball);
		}
		}
	}
		gameWon(score);
	}

	private SpecialPowerBonuse hitSpecialPowerBonus(List<ScoreBonuse> scoreBonuses, Ball ball) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean SpecialPowerBonusHit(List<SpecialPowerBonuse> spBonuse, Ball ball) {
		// TODO Auto-generated method stub
		return false;
	}

	private void gameWon(ScoreCount score) {
		// TODO Auto-generated method stub

	}

	private boolean hitDownBorder(Borders borders, Ball ball) {
		// TODO Auto-generated method stub
		return false;
	}

	private void gameOver(ScoreCount score) {
		// TODO Auto-generated method stub

	}

	private boolean hitHorizontalBorders(Borders borders, Ball ball) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean hitVerticalBorders(Borders borders, Ball ball) {
		// TODO Auto-generated method stub
		return false;
	}

	private ScoreBonuse hitScoreBonus(List<ScoreBonuse> scoreBonuses, Ball ball) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean ScoreBonusHit(List<ScoreBonuse> scoreBonuses, Ball ball) {
		// TODO Auto-generated method stub
		return false;
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

	protected void mainGameController() {
		while (true) {
			// move ball
			// move plank
			// UIrepaint
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
