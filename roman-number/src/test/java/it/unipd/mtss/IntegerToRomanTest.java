////////////////////////////////////////////////////////////////////
// [Maria Fuensanta] [Trigueros Hernandez] [2133487]
// [Alba Hui] [Larrosa Serrano] [2133266]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRomanTest {

    //Cases 1-10
    @Test
    public void testConvertForOne() {
        int num = 1;
        String exp = "I";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 1 has to be I", exp, res);
    }

    @Test
    public void testConvertForTwo() {
        int num = 2;
        String exp = "II";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 2 has to be II", exp, res);
    }

    @Test
    public void testConvertForThree() {
        int num = 3;
        String exp = "III";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 3 has to be III", exp, res);
    }

    @Test
    public void testConvertForFour() {
        int num = 4;
        String exp = "IV";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 4 has to be IV", exp, res);
    }

    @Test
    public void testConvertForFive() {
        int num = 5;
        String exp = "V";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 5 has to be V", exp, res);
    }

    @Test
    public void testConvertForSix() {
        int num = 6;
        String exp = "VI";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 6 has to be VI", exp, res);
    }

    @Test
    public void testConvertForNine() {
        int num = 9;
        String exp = "IX";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 9 has to be IX", exp, res);
    }

    @Test
    public void testConvertForTen() {
        int num = 10;
        String exp = "X";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 10 has to be X", exp, res);
    }

    // Cases 11-20
    @Test
    public void testConvertForFortyNine() {
        int num = 49;
        String exp = "XLIX";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 49 has to be XLIX", exp, res);
    }


    // Cases 21-49
    
    
    // Cases 50-100
    @Test
    public void testConvertForFifty() {
        int num = 50;
        String exp = "L";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 50 has to be L", exp, res);
    }

    @Test
    public void testConvertForFiftyOne() {
        int num = 51;
        String exp = "LI";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 51 has to be LI", exp, res);
    }

    @Test
    public void testConvertForNinetyNine() {
        int num = 99;
        String exp = "XCIX";
        String res = IntegerToRoman.convert(num);
        assertEquals("The number 99 has to be XCIX", exp, res);
    }

    // Cases 101-500



    // Cases 501-1000
}
