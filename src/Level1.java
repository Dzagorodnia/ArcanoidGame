import java.util.List;

public class Level1 implements Level {
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
