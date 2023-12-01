import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.mood.MoodAnalyser;
import com.mood.MoodAnalyserException;
import com.mood.MoodAnalyserErr;


public class MoodAnalyserTest {

    //test for sad mood
    @Test
    public void testSadMood(){
        String mood="I am in sad mood";
        MoodAnalyser analyser=new MoodAnalyser(mood);
        try{
        String result=analyser.analyseMood();
        assertEquals("SAD", result);
        }catch(MoodAnalyserException e){
            e.printStackTrace();
            fail("Error occured : "+ e.getMessage());
        }
    }

    //test for happy mood or any mood
    @ParameterizedTest
    @ValueSource(strings = {"I am in happy mood", "I am in any mood"})
    public void testHappyMood(String data){
        MoodAnalyser analyser=new MoodAnalyser(data);
        try{
        String result=analyser.analyseMood();
        assertEquals("HAPPY", result);
        }catch(MoodAnalyserException e){
            e.printStackTrace();
            fail("Error occured : "+ e.getMessage());
        }
    }

    //testing for null mood
    @Test
    public void testNullMood(){
        String mood=null;
         MoodAnalyser analyser=new MoodAnalyser(mood);
    MoodAnalyserException e=assertThrows(MoodAnalyserException.class, analyser::analyseMood);
    assertEquals(MoodAnalyserErr.EMPTY_MOOD,e.getError());
    assertEquals("Mood should not be empty or null", e.getMessage());


    }
}
