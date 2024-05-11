package org.example;

import static org.junit.Assert.*;
import org.junit.Test;


public class Testik {

    @Test
    public void _min() {
        assertEquals(1,Main._min(Main.read("num1.txt")));
        assertEquals(1,Main._min(Main.read("num2.txt")));
        assertEquals(1,Main._min(Main.read("num3.txt")));
    }

    @Test
    public void _max() {
        assertEquals(8,Main._max(Main.read("num1.txt")));
        assertEquals(9,Main._max(Main.read("num2.txt")));
        assertEquals(7,Main._max(Main.read("num3.txt")));
    }

    @Test
    public void _sum() {
        assertEquals(32,Main._sum(Main.read("num1.txt")));
        assertEquals(61,Main._sum(Main.read("num2.txt")));
        assertEquals(60,Main._sum(Main.read("num3.txt")));
    }

    @Test
    public void _mult() {
        assertEquals(9408,Main._mult(Main.read("num1.txt")));
        assertEquals(31352832,Main._mult(Main.read("num2.txt")));
        assertEquals(91445760,Main._mult(Main.read("num3.txt")));
    }
}