import com.bur1y.tts.functions.Regex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class testRegex {

    @Test
    public void testProjectName() {
        assertEquals(Regex.getActiveWindowTitleName(), "TTS");
    }

    @Test
    public void testAppName() {
        assertEquals(Regex.getActiveWindowPathName(), "idea64");
    }

}
