//Maria Fuensanta Trigueros Hernandez [2133487]
//Alba Hui Larrosa Serrano [2133266]

package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRomanTest {

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


}
