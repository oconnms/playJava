package Utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
        fail("No test yet");
    }

    @Test
    public void removePairs_initial() {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
    }

    @Test
    public void removePairs_seperatedPairs() {
        Utilities util = new Utilities();
        assertEquals("ABCBDEDF", util.removePairs("AABCBDDEDFF"));
    }

    @Test
    public void converter() {
        fail("No test yet");
    }

    @Test
    public void nullIfOddLength() {
        fail("No test yet");
    }
}