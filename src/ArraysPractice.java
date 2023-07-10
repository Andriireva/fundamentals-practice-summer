public class ArraysPractice {
    public static void main(String[] args) {
        // Array is a structure that allows to store same type objects/values
        // [] - indicator that it is an array
        int arrayItem = 40;
        //                 0  1  2  3          4    5   6
        int[] intArray = {1, 9, 3, arrayItem, 10, -55, 66, 888, 101, 2023}; // int array
        String[] stringArray = {"it is", "a ", " vales"};
        // arrayInstance[index] - return array value at index
        System.out.println(intArray[6]);
        // Replacing value at index
        System.out.println(intArray[0]);
        intArray[0] = 124;
        // System.out.println(intArray[100]); // You will get an error "out of bound"

        // array.length returns array length
//        int intArrayLength = intArray.length;
//        System.out.println("intArrayLength " + intArrayLength);

        // Print every value to console
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Value at index " + i + " = " + intArray[i]);
        }

        // I want to summ all array values
        int arraySum = 0;
        for (int i = 0; i < intArray.length; i++) {
            arraySum = arraySum + intArray[i];
        }
        System.out.println("Int array sum result = " + arraySum);

        // I want to sum all positive odd values
        int arrayOddSum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 0 && intArray[i] % 2 != 0) {
                arrayOddSum = arrayOddSum + intArray[i];
            }
        }
        System.out.println("Int array odd sum result = " + arrayOddSum);

        // I want to print values in reverse order and itself multiply
        System.out.println("I want to print values in reverse order and itself multiply");
        for (int i = intArray.length - 1; i != -1; i--) {
            int value = intArray[i] * intArray[i];
            System.out.println("Value is " + value);
        }

        // I want to have a new array of values where it have all values that can be divided by 3
        int sizeOfArray = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 3 == 0) { // check that value can be divided by 3
                sizeOfArray++;
            }
        }
        System.out.println("New array size is " + sizeOfArray);
        // new int[size] - it initialize an array of <size>
        int[] newIntArray = new int[sizeOfArray]; // { 0, 0, 0}
        int newIntArrayIndex = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 3 == 0) { // check that value can be divided by 3
                newIntArray[newIntArrayIndex] = intArray[i];
                newIntArrayIndex++;
            }
        }
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.println("newIntArray: Value at index " + i + " = " + newIntArray[i]);
        }

        // find the smallest value in array
        double[] doubles = {44.0, 44.1, 12.66, 105.444, 102.44};
        double biggestDouble = doubles[0]; // when you seach a value it is better to assign the first value as indicator
        for (int i = 1; i < doubles.length; i++) {
            System.out.println("Index = " + i + ", value is " + doubles[i]);
            if (doubles[i] < biggestDouble) {
                System.out.println("smallest value is found");
                biggestDouble = doubles[i];
            }
        }
        System.out.println("smallest double is " + biggestDouble);

        // [][] it make an array like 2 dimension
        int[][] someSquare = {
                {1, 2},   // index 0
                {4, 5, 6, 11, 77},     // index 1
                {10, 22, 36, 66}  // index 2
        };
        // someSquare[0] - it will return an array - { 1, 2, 3}
        System.out.println("value at index 1,2 " + someSquare[1][2]);
//        someSquare[1][2]
        for (int i = 0; i < someSquare.length; i++) { // outer interation
            for (int j = 0; j < someSquare[i].length; j++) { // internal iterations
                System.out.println("value at index " + i + "," + j + " is " + someSquare[i][j]);
            }

        }
    }
}
