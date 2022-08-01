package anagrams.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class AnagramTest {

    /**
     * when (filter) and (input) are empty.
     */

    @Test
    public void Empty_Input_And_Empty_Filter() {
        String input = "";
        String filter = "";

        String expected = " ";

        assertEquals(expected, Anagram.build(input, filter));
    }

    /**
     * when (filter) is empty and (input) consist String.
     */

    @Test
    public void input_Reversing_With_Empty_Filter() {
        String input = "Foxminded cool 24/7";
        String filter = "";

        String expected = "dednimxoF looc 7/42 ";

        assertEquals(expected, Anagram.build(input, filter));
    }

    /**
     * when String are in input, but not in filter.
     */

    @Test
    public void input_Reversing_Without_Filter_Character_In_Input() {
        String input = "abcd efgh";
        String filter = "0123456789";

        String expected = "dcba hgfe ";

        assertEquals(expected, Anagram.build(input, filter));
    }

    /**
     * when String in input, and simultaneously String in filter.
     */

    @Test
    public void input_Reversing_With_Filter_Character_In_Input() {
        String input = "4uzzia is a te44orist sta7e";
        String filter = "0123456789";

        String expected = "4aizzu si a ts44iroet eat7s ";

        assertEquals(expected, Anagram.build(input, filter));
    }

}