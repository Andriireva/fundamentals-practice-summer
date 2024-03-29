// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// it is a comment that does not do anything, it is just a simple description
public class Main {


    // Organ (blue in light version) words are "Key words"
    public static void main(String[] args) { //this line is Entry point in java

        // Press Opt+Enter with your caret at the highlighted text to see how java is cool
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello World!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        // for (int i = 1; i <= 5; i++) {

        // Press Ctrl+D to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Cmd+F8.
        // System.out.println("i = " + i);
        //}

        // VARIABLE_TYPE VARIABLE_NAME = value

        // binary code is sequence of 0 and 1
        // 1 - 1
        // 2 - 10
        // 3 - 11
        // 4 - 100
        // 5 - 101

        // int is keyword that says that we declare a variable of type integer
        // it is a strong recommendation to name your variables as something meaningful
        // = is called assign
        // ; - it is indicator that command line ends
        int year = 2147483647; // -2147483648 to 2147483647, The most used integer value
        byte byteVariable = 100; // -128 to 127
        short shortValue = 444; // -32768 to 32767
        long longValue = 5555; // -9223372036854775808 to 9,223,372,036,854,775,807

        double amount = 12.55; // double is type for fractional numbers. double is used more
        float floatValue = 55.666f; //

        int q = 44;

        int a = 5;
        int b = 25;
        double bDouble = 25.0;
        int c = 10;
        int sum = a + b + c;
        int negative = c - b;
        int multiply = a * b; // * is multiply operation
        int divide = b / c; // / is divide operation
        double divideDouble = bDouble / c; // / is divide operation
        // there is a rule that int / int is ALWAYS integer
        // there is a rule that double * or / int(any other integer) is ALWAYS double
        double bigFunction = a + (1.0 * b) / c + 4.4;


        System.out.println(year); // System.out.println - is the command to print in console
        System.out.println(sum);
        System.out.println(negative);
        System.out.println(multiply);
        System.out.println(divide); // 2
        System.out.println(divideDouble); // 2.5
        System.out.println(bigFunction);

        int maxInt = 2147483647; // 10101001010101010100101010101010101
//        long l = 1;
        long multiPly = 1L + maxInt + 1;

        // String is NOT a key word. String is used for char sequence
        String text = "      this is text !!___?#$!@^^*(";
        String text1 = "      Another one String";

        // String + string is = concatenation
        String textResult = text + text1;
        // String + any number  = String
        String summaryResult = "Sum = " + (sum + 5);
        String stringResult = "1" + 5 + (40 / 8);

        System.out.println(multiPly);
        System.out.println(textResult);
        System.out.println(summaryResult);
        System.out.println(stringResult);


        // we want to execute a code based on condition
        // if else statement
        // switch case ...

        int k = 55;
        // boolean has 2 states : true (keyword), of false (keyword)
        boolean simpleBooleanValue = true;
        boolean comparingResult = k >= 555;
        // I want to execute the code bellow if k is 5
        // if is keyword
        // == is comparing, >, <, >=, <=
        // logic operation. AND - && , OR || ,  NOT - ! before logical operation, EQUAL - ==
        // { } - united code lines, code block, block of code
        boolean otherResult = k > 40 && (k * 4 > 210 || (k < 0));
        if (otherResult) {
            System.out.println("otherResult is true");
        }
        if (comparingResult || k / 5 == 10) { // a typing rule to add a tab after {
            System.out.println("This code is cool");
            System.out.println("and this one should printed in case comparingResult is true");
        } else {
            System.out.println("Else statement is executed ");
        }

        // Is number positive or negative
        // it is possible to have as much if else statements as you want, but there may be only 1 else
        int number = 0;
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Switch case example
        // We want to determinate name of week depends on number
        // 1 - Sunday, 2 - Monday
        int dayOfWeek = 8;
        double doubl = 5.4;
        char ch = 'A'; // char is single chachter variable
        // in switch case it is possible to put variables of type: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break; // break word prevent other cases
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            default:
                // this code is executed in other cases...
                System.out.println("dayOfWeek " + dayOfWeek + " is not applicable");
                // balblalbal
        }

        if (dayOfWeek == 1) {
            System.out.println("Sunday");
        } else if (dayOfWeek == 2) {
            System.out.println("Monday");
        } else if (dayOfWeek == 3) {
            System.out.println("Tuesday");
            // dasdadasdsad
        } else {
            System.out.println("dayOfWeek " + dayOfWeek + " is not applicable");
        }


        // Loop in java

        System.out.println("====== LOOPS ===========");
        // for loop. Is used when you know the exact number of iterations
        //   initial state; condition until loop runs; after loop execution
        int j = 2;
        System.out.println("J = " + j);
        // we can re-assign declared variable to something new
        j = j + 10; // such contruction icrease value by 1
        System.out.println("J = " + j);
//        for (int i = 0; i < 10; i = i + 1) { // there will 10 times iterations
//            System.out.println("Looped code: Hello from Java");
//            // "Magic code that is 3rd block in for statement is executed
//        }

        int n = 11;
        int sumResult = 0; // it will be initial value of sum result
        // We want to sum a values from 1 to n; summ = 1 + 2 + 3 + ...... n;
        int ii = 0;
        ii = ii + 1;
        ii++; // ++ is the same as  ii = ii + 1
        for (int i = 1; i <= n; i++) {
            System.out.println("Iteration counter = " + i);
            sumResult = sumResult + i;
        }
        System.out.println("Summ result = " + sumResult);

        System.out.println("===== Even Sum Task ======");
        // We want to summ even number from 0 to m ; summ = 0 + 2 + 4 + 6.... + m
        int m = 10;
        int sumEven = 0;
        for (int i = 0; i <= m; i = i + 2 ) {
            System.out.println("Iteration counter = " + i);
            sumEven = sumEven + i;
        }
        System.out.println("Summ even result = " + sumEven);

        // We want to summ values from u to 10; u + u-1 + u-2 + ..... 12 + 11 + 10
        int u = 9;
        int minValuesResult = 0;
        // i = i - 1 is same as i--
        for (int i = u; i >= 10; i--) {
            System.out.println("Iteration counter = " + i);
            minValuesResult = minValuesResult + i;
        }
        System.out.println("Summ min result = " + minValuesResult);

        // we want to do this N! = 1 * 2 * 3 *....... * N
        // 3! = 1 * 2 * 3;
        int factorResult = 1;
        int factor = 6;
        for (int i = 1; i <= factor; i++) {
            System.out.println("Iteration counter = " + i);
            factorResult = factorResult * i;
        }
        System.out.println("Factor result = " + factorResult);

        // WHILE is a loop that iterate unitl condion is true
        System.out.println("==== WHILE ======");
        boolean untillNotRich = true;
        int money = 100;
        int monthSalary = 200;
        while (untillNotRich) {
            if ( money >= 1000000 ) {
                untillNotRich = false;
            }
            money = money + monthSalary;
            // it shoulde run in a loop, but it is not clear the number of ierations
        }
        System.out.println("My money = " + money);

        int sumEvenWhile = 0;
        int counter = 2;
        while (counter < m) {
            sumEvenWhile = sumEvenWhile + counter;
            counter = counter + 2;
        }
        System.out.println("sumEvenWhile = " + sumEvenWhile);

        // do while will be executed AT LEAST once
        int taxes = 1200;
//        money = 2000;
        do {
            money = money - taxes;
        } while (money > 500000);
        System.out.println("My money after taxes = " + money);

        int notLikedNumber = 20; // in case i reach this number as iterator I want to force stop loop
        // We want sum all numbers that can be devided by 7
        // int value % another value return module. 10 % 7 = 3, 16 % 7 = 2, 14 % 7 = 0
        int devideSevenSum = 0;
        for (int i = 0; i < 2000; i++) {
            System.out.println("Iteration counter = " + i);
            if (i % 7 == 0) { // check that value can be dived by 7
                devideSevenSum = devideSevenSum + i;
            }
            if (i == notLikedNumber) {
                break;
            }
        }
        System.out.println("devideSevenSum " + devideSevenSum);
    }
}