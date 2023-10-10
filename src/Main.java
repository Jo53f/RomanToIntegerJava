import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner scanObj = new Scanner(System.in);

        System.out.println("Please enter a roman numeral");
        String romanNumeral = scanObj.nextLine();

        Solution conversion = new Solution();
        int integer = conversion.romanToInt(romanNumeral);

        System.out.println(integer);

    }
}