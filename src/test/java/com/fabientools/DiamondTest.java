package com.fabientools;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DiamondTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void print_returns_null_when_diamond_size_is_even() {
        assertNull(Diamond.print(0));
        assertNull(Diamond.print(2));
        assertNull(Diamond.print(4));
    }

    @Test
    public void print_returns_null_when_diamond_size_is_negative() {
        assertNull(Diamond.print(-1));
        assertNull(Diamond.print(-3));
    }

    @Test
    public void print_returns_a_diamond_with_one_star_when_size_of_diamond_is_1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");

        assertEquals(expected.toString(), Diamond.print(1));
    }

    @Test
    public void print_returns_a_diamond_with_9_stars_when_size_of_diamond_is_3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), Diamond.print(3));
    }

    @Test
    public void print_returns_a_diamond_with_13_stars_when_size_of_diamond_is_5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), Diamond.print(5));
    }
}