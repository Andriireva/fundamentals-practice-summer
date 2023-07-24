package assigmentone;

public class AssigmentOne {
    public static void main(String[] args) {
        System.out.println("====== TASK 1 ===========");
        int currenYear = 2023;
        String myFavoriteSport = "swimming";
        double PI = 3.141592653589793;
        System.out.println("Current year :" + currenYear);
        System.out.println("myFavoriteSport :" + myFavoriteSport);
        System.out.println("PI :" + PI);


        System.out.println("====== TASK 2 ===========");
        int a = -40;
        int b = 20;
        if (a == (-1 * b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("====== TASK 3 ===========");
        int[] array = {1, 2, 3, 4, 5};
        int sumOddValues = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sumOddValues = sumOddValues + array[i];
            }
        }
        System.out.print("array={");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < (array.length - 1)) {
                System.out.print(" , ");
            }
        }
        System.out.print("}" + "\n");
        System.out.println("The sum of odd values is " + sumOddValues);

        System.out.println("====== TASK 4 ===========");
        double[] doubleArray = {3.4, 9.7, 2.1, 7.67, 5.55};
        double largestNumber = doubleArray[0];
        System.out.print("doubleArray={");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < (doubleArray.length - 1)) {
                System.out.print(" , ");
            }
        }
        System.out.println("}");
        for (int i = 1; i < doubleArray.length; i++) {
            if (doubleArray[i] > largestNumber) {
                largestNumber = doubleArray[i];
            }
        }
        System.out.println("largestNumber=" + largestNumber);

        System.out.println("====== TASK 5 ===========");
        String str = "Hello World";
        int countOfOcuurence = 0;
        char chr = 'o';
        for (int i = 0; i < str.length(); i++) {
            if (chr == str.charAt(i)) {
                countOfOcuurence++;
            }
        }
        System.out.println("char " + chr + " occurence is:" + countOfOcuurence);

        System.out.println("====== TASK 6 ===========");

        boolean primNumber = true;
        int num = 7;

        if (num == 2) {
            primNumber = true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primNumber = false;
                    break;
                }

            }
        }

        if (primNumber) {
            System.out.println(num + " is a prime Number");
        } else {
            System.out.println(num + " is not a prime Number");
        }

    }




}
