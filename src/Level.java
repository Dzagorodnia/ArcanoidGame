import java.util.List;

public interface Level {
	List<Brick> bricksGenerator();
	List<ScoreBonuse> scoreBonusesGenerator();
	List<SpecialPowerBonuse> specialPowerBonusesGenerator();
}
