import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.mood.MoodAnalyser;


public class MoodAnalyserTest {

    //test for sad mood
    @Test
    public void testSadMood(){
        String mood="I am in sad mood";
        MoodAnalyser analyser=new MoodAnalyser(mood);
        String result=analyser.analyseMood();
        assertEquals("SAD", result);
    }
}
