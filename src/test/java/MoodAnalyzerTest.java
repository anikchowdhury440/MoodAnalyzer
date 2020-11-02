import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	@Test
	public void testMood_WhenStringContainSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
		String isMoodSad = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD" , isMoodSad);
	}
	
	@Test
	public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Any Mood");
		String isMoodHappy = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY" , isMoodHappy);
    }
}
