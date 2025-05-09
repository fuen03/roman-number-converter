//Maria Fuensanta Trigueros Hernandez [2133487]
//Alba Hui Larrosa Serrano [2133266]


package it.unipd.mtss;
public class RomanPrinter {
  private static final String[] I_Rep = {
    " _____ ",
    "|_   _|",
    "  | |  ",
    "  | |  ",
    "  | |  ",
    " _| |_ ",
    "|_____|"
  };

  private static final String[] V_Rep = {
    "___        ___",
    "\\ \\     / /",
    " \\ \\   / / ",
    "  \\ \\ / /",
    "   \\    /",
    "    \\  /",
    "     \\/"
  };

  private static final String[] X_Rep = {
    " ___    ___ ",
    " \  \  /  /",
    "  \  \/  /",
    "   \    /",
    "   /    \",
    "  /  /\  \",
    " /__/  \__\"
  };

  private static final String[] L_Rep = {
    " __",
    "|  |",
    "|  |",
    "|  |",
    "|  |",
    "|  |_____",
    "|________|",
  };

  private static final String[] C_Rep = {
    " ________",
    "/  ______|",
    "|  |",
    "|  |",
    "|  |",
    "|  |______",
    "\_________|"
  };

  private static final String[] D_Rep = {
    " _______",
    "|  ____  \",
    "|  |  |  |",
    "|  |  |  |",
    "|  |  |  |",
    "|  |__|  |",
    "|_______ /"
  };

  private static final String[] M_Rep = {
    " ___    ___",
    "|   \  /   |",
    "|    \/    |",
    "|  |\  /|  |",
    "|  | \/ |  |",
    "|  |    |  |",
    "|__|    |__|"
  };

  private static String printAsciiArt(String romanNumber){

  }
  
  
  public static String print(int num){
    return printAsciiArt(IntegerToRoman.convert(num));
  }
}
