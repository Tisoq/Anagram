package anagrams.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class AnagramTest {
    @Test
    public void inputReversingWithEmptyFilter() {
        String input = "Foxminded cool 24/7";
        String filter = "";

        String expected = "dednimxoF looc 7/42 ";

        assertEquals(expected, Anagram.build(input, filter));
    }

    @Test
    public void inputReversingWithoutFilterCharacterInInput() {
        String input = "abcd efgh";
        String filter = "0123456789";

        String expected = "dcba hgfe ";

        assertEquals(expected, Anagram.build(input, filter));
    }

    @Test
    public void inputReversingWithFilterCharacterInInput() {
        String input = "4uzzia is a te44orist sta7e";
        String filter = "0123456789";

        String expected = "4aizzu si a ts44iroet eat7s ";

        assertEquals(expected, Anagram.build(input, filter));
    }
}