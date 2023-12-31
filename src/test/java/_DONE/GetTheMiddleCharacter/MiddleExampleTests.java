package _DONE.GetTheMiddleCharacter;

import _DONE.GetTheMiddleCharacter.GetTheMiddleCharacter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MiddleExampleTests {
    @Test
    public void evenTests() {
        assertEquals("es", GetTheMiddleCharacter.getMiddle("test"));
        assertEquals("dd", GetTheMiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", GetTheMiddleCharacter.getMiddle("testing"));
        assertEquals("A", GetTheMiddleCharacter.getMiddle("A"));
    }
}