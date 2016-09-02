import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LevelGenerator {

	public static List<Brick> generateBricks(Borders borders) {
		Brick brick = new Brick();
		int brickWidth = brick.getBrickWidth();
		int brickHeight = brick.getBrickHeight();
		List<Brick> brickList = new ArrayList<Brick>();
		int leftSideInnerX = borders.getLeft().getWidth();
		int rightSideInnerX = borders.getRight().getX();
		int startPoint = StartPoint(leftSideInnerX, rightSideInnerX, brick);
		int endPoint = endPoint(leftSideInnerX, rightSideInnerX, brick);
		for (int x = startPoint; x < endPoint; x = x + brickWidth) {
			for (int y = 0; y < 90; y = y + brickHeight) {
				// position.y = 0;
				Brick newBrick = new Brick();
				newBrick.setBrickX(x);
				newBrick.setBrickY(y);
				brickList.add(newBrick);
			}
		}
		return brickList;
	}

	public static List<Bonus> generateBonuses() {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<ScoreBonuse> generateScoreBonuses() { //score bonuses
		return null;

	}

	public static List<ScoreBonuse> generateScoreBonuses1(List<Brick> brickList) {
		Brick brick = new Brick();
		List<ScoreBonuse> scroreBonuses = new ArrayList<ScoreBonuse>();
		List<Bonus> listForRandomization = new ArrayList<Bonus>();

		for (Brick brickItem : brickList) {
			ScoreBonuse scoreBonus = new ScoreBonuse();
			int x = brickItem.getBrickX();
			int y = brickItem.getBrickY();
			scoreBonus.setDimensions(brick.getBrickWidth(), brick.getBrickHeight());
			scoreBonus.setScoreBonusX(x);
			scoreBonus.setScoreBonusY(y);
			listForRandomization.add(scoreBonus);

		}
		for (int i = 0; i < 7; i++) {
			ScoreBonuse sBonuse = (ScoreBonuse) getRandomNumberInRange(listForRandomization);
			listForRandomization.remove(sBonuse);// ?
			scroreBonuses.add(sBonuse);

		}
		return scroreBonuses;

	}

	public static List<SpecialPowerBonuse> generateSpecialPowerBonuses1(List<Brick> brickList) {
		Brick brick = new Brick();
		List<SpecialPowerBonuse> spBonuses = new ArrayList<SpecialPowerBonuse>();
		List<Bonus> listForRandomization = new ArrayList<Bonus>();

		for (Brick brickItem : brickList) {
			SpecialPowerBonuse spBonus = new SpecialPowerBonuse();
			int x = brickItem.getBrickX();
			int y = brickItem.getBrickY();
			spBonus.setDimensions(brick.getBrickWidth(), brick.getBrickHeight());
			spBonus.setSpecialPowerBonusX(x);
			spBonus.setSpecialPowerBonusX(x);
			listForRandomization.add(spBonus);

		}
		for (int i = 0; i < 2; i++) {
			SpecialPowerBonuse sBonuse = (SpecialPowerBonuse) getRandomNumberInRange(listForRandomization);
			listForRandomization.remove(sBonuse);
			spBonuses.add(sBonuse);

		}
		return spBonuses;
	}

	public static Bonus getRandomNumberInRange(List<Bonus> list) {//random method

		Random r = new Random();
		return list.get(r.nextInt(list.size()));
	}

	public static int endPoint(int start, int end, Brick brick) {
		int width = brick.getBrickWidth();
		int area = end - start;
		int freeArea = area % width;
		int fullBrickArea = area - freeArea;
		return fullBrickArea - width;
	}

	public static int StartPoint(int start, int end, Brick brick) {// you
																	// should
																	// add
																	// border
																	// width
																	// +
																	// preStrtPoint
		int width = brick.getBrickWidth();
		int area = end - start;
		int freeArea = area % width;
		int preStartPoint = freeArea / 2;
		return preStartPoint + start;

	}

}
