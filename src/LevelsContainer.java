import java.util.ArrayList;
import java.util.List;

public class LevelsContainer {
	
	private List<Level> levelsContainer = new ArrayList<Level>();
	
	public LevelsContainer() {
		levelsContainer.add(new Level1());
	}
	public List<Level> getLevelsContainer(){
		return levelsContainer;
	}

	/*public static class Level1 implements Levels {

		@Override
		public List<Brick> bricksGenerator() {
			return LevelGenerator.generateBricks(new Borders());
		}

		@Override
		public List<ScoreBonuse> scoreBonusesGenerator() {
			return LevelGenerator.generateScoreBonuses1(bricksGenerator());
		}

		@Override
		public List<SpecialPowerBonuse> specialPowerBonusesGenerator() {
			return LevelGenerator.generateSpecialPowerBonuses1(bricksGenerator());
		}
	}

	public static class Level2 implements Levels {

		@Override
		public List<Brick> bricksGenerator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<ScoreBonuse> scoreBonusesGenerator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<SpecialPowerBonuse> specialPowerBonusesGenerator() {
			// TODO Auto-generated method stub
			return null;
		}

	}*/
	
}
