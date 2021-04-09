package sample;

import org.junit.Test;

import static org.junit.Assert.*;

// Testing whether the String added in the number.
public class ControllerTest {

    @Test
    public void addSeven() {
        String s = "0";
        s += 7;
        System.out.println(s);
    }

    @Test
    public void addEight() {
        String s = "0";
        s += 8;
        System.out.println(s);
    }

    @Test
    public void addNine() {
        String s = "0";
        s += 9;
        System.out.println(s);
    }

    @Test
    public void addFour() {
        String s = "0";
        s += 4;
        System.out.println(s);
    }

    @Test
    public void addFive() {
        String s = "0";
        s += 5;
        System.out.println(s);
    }

    @Test
    public void addSix() {
        String s = "0";
        s += 6;
        System.out.println(s);
    }
}