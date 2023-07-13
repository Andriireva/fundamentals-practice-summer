import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String stringVar = "HELLO from THere!!! QWEkk";
        System.out.println(stringVar + " another string");

        System.out.println("String length " + stringVar.length()); // it returns number of characters

        // byte i s sequence of 8 1 or 0
        // 000111100 - a
        // 000111101 - b
        // ASCI code or UNICODE
        byte[] stringByte = stringVar.getBytes();
        System.out.println("byte lenght " + stringByte.length);
        System.out.println("first bute elem " + stringByte[0]);

        String lowerCaseResult = stringVar.toLowerCase();
        System.out.println("to lower result: " + lowerCaseResult);

        String upperCaseResult = stringVar.toUpperCase();
        System.out.println("to upper result: " + upperCaseResult);

        // it returns 1st char of string
        System.out.println("Return 1st char: " + stringVar.charAt(0));
        // it returns last char
        int lastIndexOfString = stringVar.length() - 1;
        System.out.println("Return last char: " + stringVar.charAt(lastIndexOfString));

        // concat DOES NOT change initial string
        String concatResult = stringVar.concat(" ADD THIS"); // equals to stringVar + " ADD THIS"
        System.out.println("Return concat: " + concatResult);
        System.out.println("Original string: " + stringVar);

        System.out.println("Does string contain 'HELLO' : " + stringVar.contains("HELLO"));
        System.out.println("Does string contain 'LO fr' : " + stringVar.contains("LO fr"));
        System.out.println("Does string contain 'lo fr' : " + stringVar.contains("lo fr"));

        System.out.println("Does string end with 'end' : " + stringVar.endsWith("end"));
        System.out.println("Does string end with '! QWEkk' : " + stringVar.endsWith("! QWEkk"));

        System.out.println("Does string start with 'HELLO' : " + stringVar.startsWith("HELLO"));
        System.out.println("Does string start with 'NOT FROM THIS' : " + stringVar.startsWith("NOT FROM THIS"));

        //
        System.out.println("Does string equals to 'ANOTHe string' : " + stringVar.equals("ANOTHe string"));
        System.out.println("Does string equals to exact original one : " + stringVar.equals("HELLO from THere!!! QWEkk"));

        String javaString = "JAVA is cool";
        // JAVA equalsIgnoreCase java
        System.out.println("Does string equalsIgnoreCase to 'java IS COOL' : " + javaString.equalsIgnoreCase("java IS COOL"));

        String stringToindent = "Helo\nfrom there"; // \n means move to new line

        System.out.println("Indent result: " + stringToindent.indent(2));

        String strIndexExmpl = "QW ba ba QW gg";
        System.out.println("indexOf : " + strIndexExmpl.indexOf("ba")); // it returns an index where the param FIRST met
        System.out.println("lastIndexOf indexOf : " + strIndexExmpl.lastIndexOf("ba")); // it returns an index where the param LAST met

        String stringEmpty = "   ";
        System.out.println("Is empty : " + stringEmpty.isEmpty());
        System.out.println("Is blank : " + stringEmpty.isBlank());

        System.out.println("repeat : " + stringVar.repeat(3)); // copy X amount of time

        System.out.println("replaceFirst : " + strIndexExmpl.replaceFirst("QW", "JJJ"));
        System.out.println("replaceAll : " + strIndexExmpl.replaceAll("QW", "JJJ"));
        System.out.println("replace : " + strIndexExmpl.replace("QW", "JJJ"));

        System.out.println("substring from x to end : " + strIndexExmpl.substring(3));
        System.out.println("substring from x to y : " + strIndexExmpl.substring(3, 5));
        String[] splitBySpace = strIndexExmpl.split(" "); // exam "QW ba ba QW" -> { "QW" , "ba", "ba", "QA"}
        System.out.println("Split by space result length:  " + splitBySpace.length);

        // We have a sentence separated by spaces.
        // Find the longest word and make it capitalized
        String sentence = "I would like to say that asdasdasdasdasdasdasd it is a long sentence"; // SENTENCE
        String[] words = sentence.split(" "); // {"I", "would", .......}
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int currentWordLength = currentWord.length();
            if (currentWordLength > longestWord.length()) {
                longestWord = words[i];
            }
        }
        String capitalizedLongestWord = longestWord.toUpperCase();
        System.out.println("Longest capitalized word = " + capitalizedLongestWord);
    }
}
