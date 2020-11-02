
public class MoodAnalyzer {
	
	private String moodMessage;

	public MoodAnalyzer(){
		
	}

	public MoodAnalyzer(String moodMessage) {
		this.moodMessage = moodMessage;
	}
    
	public String analyseMood() throws MoodAnalyzerException {
		try {
			if(moodMessage.length() == 0)
            {
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERD_EMPTY, "Don't pass empty value");
            }
			if(moodMessage.contains("Sad")) {
				return "SAD";
			}
			else {
				return "HAPPY";
			}
		}
		catch (NullPointerException e) {
			throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERD_NULL, "Don't pass null value");
		}
	}
}
