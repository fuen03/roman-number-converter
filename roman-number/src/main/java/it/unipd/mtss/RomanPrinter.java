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
        "___       __",
        "\\ \\      / /",
        " \\ \\    / / ",
        "  \\ \\  / /  ",
        "   \\ \\/ /   ",
        "    \\  /    ",
        "     \\/     "
    };

    private static final String[] X_Rep = {
        " ___   __ ",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   \\  /   ",
        "   /  \\   ",
        "  / /\\ \\  ",
        " /_/  \\_\\ "
    };

    private static final String[] L_Rep = {
        " __      ",
        "|  |     ",
        "|  |     ",
        "|  |     ",
        "|  |     ",
        "|  |_____ ",
        "|________|"
    };

    private static final String[] C_Rep = {
        " ________  ",
        "/  ______| ",
        "|  |       ",
        "|  |       ",
        "|  |       ",
        "|  |______ ",
        "\\________|"
    };

    private static final String[] D_Rep = {
        " _______   ",
        "|  ____  \\ ",
        "|  |  |  | ",
        "|  |  |  | ",
        "|  |  |  | ",
        "|  |__|  | ",
        "|_______/  "
    };

    private static final String[] M_Rep = {
        " __    __  ",
        "|  \\  /  | ",
        "|   \\/   | ",
        "| |\\  /| | ",
        "| | \\/ | | ",
        "| |    | | ",
        "|_|    |_| "
    };

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            throw new IllegalArgumentException("The roman number could not be null or empty");
        }

        if (!romanNumber.matches("[IVXLCDM]+")) {
            throw new IllegalArgumentException("The roman number has invalid characters");
        }

        String[] result = new String[7];
        for (int i = 0; i < 7; i++) {
            result[i] = "";
        }

        for (int i = 0; i < romanNumber.length(); i++) {
            char romanChar = romanNumber.charAt(i);
            String[] rep;

            switch (romanChar) {
                case 'I':
                    rep = I_Rep;
                    break;
                case 'V':
                    rep = V_Rep;
                    break;
                case 'X':
                    rep = X_Rep;
                    break;
                case 'L':
                    rep = L_Rep;
                    break;
                case 'C':
                    rep = C_Rep;
                    break;
                case 'D':
                    rep = D_Rep;
                    break;
                case 'M':
                    rep = M_Rep;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid character: " + romanChar);
            }

            for (int j = 0; j < 7; j++) {
                String padded = String.format("%-13s", rep[j]);
                result[j] += padded;
            }
        }
        
        return String.join("\n", result);
    }
}
