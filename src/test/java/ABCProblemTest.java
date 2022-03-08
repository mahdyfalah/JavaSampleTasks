import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ABCProblemTest {
    ABCProblem abc = new ABCProblem();

    @Test
    void canMakeWordTest() {
        assertEquals(true, abc.canMakeWord("A"));
        assertEquals(true, abc.canMakeWord("BARK"));
        assertEquals(false, abc.canMakeWord("BOOK"));
        assertEquals(true, abc.canMakeWord("TREAT"));
        assertEquals(false, abc.canMakeWord("COMMON"));
        assertEquals(true, abc.canMakeWord("SQUAD"));
        assertEquals(true, abc.canMakeWord("CONFUSE"));
    }

    @Test
    void canMakeWordTestLowerCaseTest() {
        assertEquals(true, abc.canMakeWord("a"));
        assertEquals(true, abc.canMakeWord("BaRk"));
        assertEquals(false, abc.canMakeWord("bOok"));

    }
}
