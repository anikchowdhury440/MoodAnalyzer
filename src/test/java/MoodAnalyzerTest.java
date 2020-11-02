import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	@Test
	public void testMood_WhenStringContainSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
		String isMoodSad = null;
		try {
			isMoodSad = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD" , isMoodSad);
		} catch (MoodAnalyzerException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMood_WhenStringNotContainSad_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Any Mood");
		String isMoodHappy = null;
		try {
			isMoodHappy = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY" , isMoodHappy);
		} catch (MoodAnalyzerException e) {
			e.printStackTrace();
		}
    }
	
	@Test
    public void testMood_WhenStringContainNull_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERD_NULL, e.type);
		}
    }
	
	@Test
    public void testMood_WhenStringContainEmpty_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERD_EMPTY, e.type);
		}
    }
}
