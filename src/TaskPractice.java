public class TaskPractice {
    public static void main(String[] args) {
//        Task: Leap Year Checker
//        Description: Write a program that checks whether a given year is a leap year or not.
//      Year  every year that is divided by 4 exepc
//      the year that can be divide on 400
//      2000
        // 7 % 4 = 3  8 % 4 = 0 9 % 4= 1
        int yearToCheck = 1600;
        if (yearToCheck % 4 == 0 && yearToCheck % 400 != 0) {
            System.out.println("Year " + yearToCheck + " is leap");
        } else {
            System.out.println("Year " + yearToCheck + " is not leap");
        }

//        Task: Temperature Converter
//        Description: Write a program that converts temperature from Celsius to Fahrenheit or vice versa based on user input.
//        Celsius to Fahrenheit Formula: (°C * 1.8) + 32 = °F
//        Fahrenheit to Celsius Formula: (°F - 32) / 1.8 = °C

        double temperatureMultiplier = 1.8;
        double temperatureAdditional = 32;
        double initialCelsius = 100.0;
        double waterBoilFahrenheit = initialCelsius * temperatureMultiplier + temperatureAdditional;
        System.out.println("Boil temperature in Fahrenheit is " + waterBoilFahrenheit);

        // 36.6 C - normal body temperature
        //
        double humanBodyTemperatureFahrenheit = 90.9;
        double normalHumanTemperatureCelsius = 36.6;
        double humanBodyTemperatureCelsius = (humanBodyTemperatureFahrenheit - temperatureAdditional) / temperatureMultiplier;
        if ( humanBodyTemperatureCelsius > normalHumanTemperatureCelsius) {
            System.out.println("Your temperature is high " + humanBodyTemperatureCelsius);
        }

//      Task: Fibonacci Series
//      Description: Write a program that generates the Fibonacci series up to a specified number of terms.
//      0 1 1 2 3 5 8 13 21 .......
        System.out.println("===== Task: Fibonacci Series =====");
        long fibonacciNumberIndex = 3;
        long firstFibNumber = 0;
        long secondFibNumber = 1;
        long fibNumber = 0;
        for (long i = 2; i < fibonacciNumberIndex; i++) {
            fibNumber = firstFibNumber + secondFibNumber; // 1st we calculate next value
            firstFibNumber = secondFibNumber; // 2nd assign 1st VARIABLE to a second VALUE
            secondFibNumber = fibNumber; //3rd assign a 2nd value to JUST calculated value
            System.out.println("Index = " + i + ", Current fib number " + fibNumber );
        }
        System.out.println("Fib number at index " + fibonacciNumberIndex + " is " + fibNumber);

//      Task: Grade Calculator
//      Description: Write a program that calculates the average grade for a student based on their scores in multiple subjects.
        // from 1 to 12
        // { 12 10 6 6 } - 8 - (10 + 10 + 6 + 6) / 4 = 34 / 4 = 8.25
        //
        //
        int[] grades = { 5, 6, 7, 5, 10, 12, 8, 6, 10 };
        double sum = 0; // It is very important because double / int = double
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        System.out.println(sum / grades.length);


//        Task: Palindrome Checker
//        Description: Write a program that checks whether a given string is a palindrome or not.
//        Example: kazak - true, hello (olleh)- false
        String word = "kalhak";
        int j = word.length() - 1;
        for (int i = 0; i < (word.length() / 2); i++) {
            System.out.println("Index i=" + i + ", j=" + j + " " + word.charAt(i) + " " + word.charAt(j));
            if (word.charAt(i) != word.charAt(j)) {
                System.out.println("This string is not Palindrome");
                break; // STOP LOOP at all
            }
            j -= 1; // reduce value by 1
        }
        if (j < (word.length() / 2)) {
            System.out.println("This string is Palindrome");
        }
    }
}
