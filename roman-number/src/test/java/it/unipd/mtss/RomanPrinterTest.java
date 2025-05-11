package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanPrinterTest {

    @Test
    public void testPrintOne() {
        String result = RomanPrinter.print(1);
        System.out.println(result);
        assertNotNull(result);
    }

    @Test
    public void testPrintFive() {
        String result = RomanPrinter.print(5);
        System.out.println(result); 
        assertNotNull(result);
    }

    @Test
    public void testPrintTen() {
        String result = RomanPrinter.print(10);
        System.out.println(result); 
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintInvalidNumber() {
        RomanPrinter.print(0);  
    }
}
