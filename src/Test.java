import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static List<Brick> generateBricks(Borders borders) {
		Brick brick = new Brick();
		int brickWidth = brick.getBrickWidth();
		int brickHeight = brick.getBrickHeight();
		List<Brick> brickList = new ArrayList<Brick>();
		int leftSideInnerX = borders.getLeft().getWidth();
		int rightSideInnerX = borders.getRight().getX();
		int startPoint = StartPoint(leftSideInnerX, rightSideInnerX, brick);
		int endPoint =  endPoint(leftSideInnerX, rightSideInnerX, brick);
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
	public static int endPoint(int start, int end, Brick brick) {
		int width = brick.getBrickWidth();
		int area = end - start;
		int freeArea = area % width;
		int fullBrickArea = area - freeArea;
		return fullBrickArea - width;
	}

	public static int StartPoint(int start, int end, Brick brick) {
		int width = brick.getBrickWidth();
		int area = end - start;
		int freeArea = area % width;
		int preStartPoint = freeArea / 2;
		return preStartPoint + start;

	}
	
	public static void printListBricks(){
		List<Brick> listForPrint = generateBricks(new Borders());
		for (Brick element : listForPrint){
		System.out.println("Brick coordinates: " + "x:" + element.getBrickX() + " y:" + element.getBrickY());
		}
	}
	public static void printListScoreBonuses(){
		List<ScoreBonuse> listForPrint = LevelGenerator.generateScoreBonuses1(generateBricks(new Borders()));
		for (ScoreBonuse element : listForPrint){
			System.out.println("Bonus coordinates: " + "x:" + element.getScoreBonusX() + " y:" + element.getScoreBonusY());
		}
	}
	public static void printListSpecialPowerBonuses(){
		List<SpecialPowerBonuse> listForPrint = LevelGenerator.generateSpecialPowerBonuses1(generateBricks(new Borders()));
		for (SpecialPowerBonuse element : listForPrint){
			System.out.println("SpecialPowerBonus coordinates: " + "x:" + element.getSpecialPowerBonusX() + " y:" + element.getSpecialPowerBonusY());
		}
	}
	
	public static void main(String[] args) {
		int end = 498;
		int start = 1;
		int width = 60;
		int area = end-start;
		int freeArea = area % width;
		int fullBrickArea = area - freeArea;
		int freeAreaSidePart = freeArea/2;
		//System.out.println(freeAreaSidePart);
		//System.out.println(fullBrickArea);
		//System.out.println(freeArea);
		
		printListBricks(); // printing out bricks
		System.out.println("   ");
		printListScoreBonuses();//printing out bonuses
		System.out.println(" ");
		printListSpecialPowerBonuses();
	}
	


}
