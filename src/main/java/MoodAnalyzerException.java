
public class MoodAnalyzerException extends Exception {
	
	enum ExceptionType{
		ENTERD_NULL, ENTERD_EMPTY
	}
	
	ExceptionType type;
	
	public MoodAnalyzerException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
