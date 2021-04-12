package Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class StringPracticeHwTest {

    @Test
    void getStrReverse() {
        assertEquals("olleH", StringPracticeHw.getStrReverse("Hello"));
        assertEquals("olleH", StringPracticeHw.getStrReverse("Hello   "));
        assertEquals("olleH", StringPracticeHw.getStrReverse("   Hello"));
        assertNull(StringPracticeHw.getStrReverse(""));
        assertNull(StringPracticeHw.getStrReverse("  "));
        assertNull(StringPracticeHw.getStrReverse(null));
    }

    @Test
    void getCountWords() {
        String sent = "Two beers or not two beers";
        assertEquals(2, StringPracticeHw.getCountWords(sent,"two"));
        assertEquals(0, StringPracticeHw.getCountWords(sent,"three"));
        assertNull(StringPracticeHw.getCountWords(sent, null));
        assertNull(StringPracticeHw.getCountWords(null, "two"));
        assertNull(StringPracticeHw.getCountWords(null, null));
        assertNull(StringPracticeHw.getCountWords(sent, "   "));
        assertNull(StringPracticeHw.getCountWords("  ", ""));
    }
}