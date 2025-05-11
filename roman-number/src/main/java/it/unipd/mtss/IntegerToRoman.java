////////////////////////////////////////////////////////////////////
// [Maria Fuensanta] [Trigueros Hernandez] [2133487]
// [Alba Hui] [Larrosa Serrano] [2133266]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.TreeMap;

public class IntegerToRoman {
  private static final TreeMap<Integer, String> romanMap = new TreeMap<>();
  static {
    romanMap.put(1000, "M");
    romanMap.put(900, "CM");
    romanMap.put(500, "D");
    romanMap.put(400, "CD");
    romanMap.put(100, "C");
    romanMap.put(90, "XC");
    romanMap.put(50, "L");
    romanMap.put(40, "XL");
    romanMap.put(10, "X");
    romanMap.put(9, "IX");
    romanMap.put(5, "V");
    romanMap.put(4, "IV");
    romanMap.put(1, "I");
}
  public static String convert(int number){

      if (number <= 0 || number > 1000) {
          throw new IllegalArgumentException("El número debe estar entre 1 y 1000");
      }
      int closest = romanMap.floorKey(number);
      if (number == closest) {
          return romanMap.get(number);
      }
      return romanMap.get(closest) + convert(number - closest);
  }
  


  public static void main(String[] args) {
  for (int i = 1; i <= 3; i++) {
      System.out.println(i + " -> " + convert(i));
  }
}
}
