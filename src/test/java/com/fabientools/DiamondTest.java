package com.fabientools;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DiamondTest {

    @Test
    public void testDiamond0() {
        StringBuffer expected = new StringBuffer();
        expected.append("\n");

        assertEquals(expected.toString(), Diamond.print(0));
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