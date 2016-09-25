package com.fabientools;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DiamondTest {

    @Test
    public void print_with_1_diamond_returns_one_star() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");

        assertEquals(expected.toString(), Diamond.print(1));
    }

    @Test
    public void print_returns_null_when_diamond_number_is_even() {
        assertNull(Diamond.print(0));
        assertNull(Diamond.print(2));
        assertNull(Diamond.print(4));
    }

    @Test
    public void print_returns_null_when_diamond_number_is_negative() {
        assertNull(Diamond.print(-1));
        assertNull(Diamond.print(-3));
    }

    @Test
    @Ignore
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), Diamond.print(3));
    }

    @Test
    @Ignore
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), Diamond.print(5));
    }
}