import com.bur1y.tts.functions.Regex;
import com.sun.jna.platform.win32.User32;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


public class testRegex {

    @Test
    public void testProjectName() throws IOException {
        assertEquals(Regex.getActiveWindowTitleName(User32.INSTANCE.GetForegroundWindow()), "TTS");
    }

    @Test
    public void testAppName() {
        assertEquals(Regex.getActiveWindowPathName(User32.INSTANCE.GetForegroundWindow()), "idea64");
    }

}
