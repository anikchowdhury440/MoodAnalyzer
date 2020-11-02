
public class MoodAnalyzer {
	
	private String moodMessage;

	public MoodAnalyzer(){
		
	}

	public MoodAnalyzer(String moodMessage) {
		this.moodMessage = moodMessage;
	}
    
	public String analyseMood() {
		if(moodMessage.contains("Sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
