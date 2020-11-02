
public class MoodAnalyzer {
	public String analyseMood(String mood) {
		if(mood.contains("Sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
