package edu.kosta.restaurant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class AssertTest {

    @Test
    void sizeComparison() {
        assertTrue(1 < 3);
    }

    @Test
    void equlasTest() {
        assertEquals("Hello", "Hello", "값이 일치하지 않습니다.");
    }

    @Test
    void trueAssumption() {
        assumeTrue(5 > 1);
        assertEquals(5 + 2, 7);
    }
    @Test
    void falseAssumption() {
        assumeFalse(5 < 1);
        assertEquals(5 + 2, 7);
    }

}
