package oop.exceptions;

import oop.Boat;

// Throwable -> Exception (checked exception)
//                          -> RuntimeException (not checked exception)
//                                              -> RuntimeException
//                                              -> ArithmeticException
//                                              -> IndexOutOfBoundException
//           -> Error (not checked exception)
public class ExceptionEmpls {
    public static void main(String[] args) {
        // Empty string "" is different from null
        String someString = null;
        Boat boat = new Boat("Green", 1989, 1000022.66, "Pefrect shiip", 43125555123L, true);

//        String upperCased;
//        if (someString != null) {
//            upperCased = someString.toUpperCase();
//        } else {
//            upperCased = "";
//        }
        String upperCased = "";
        try {
            System.out.println("Code before actual try body");
//             you put a code that MAY produce exception
            boat.getCreatedYear();
            boat.setPrice(-1000); // it will produce other exception
            System.out.println("Code after actual try body");
//            upperCased = someString.toUpperCase();
        } catch (NullPointerException exception) { // in () you put Exception class that MAY appears
//          NullPointerException it appears when method, or varialbe or any other action is called on
//          variable that is assigned to null
////            upperCased = "";
            System.out.println("CAtch NullPointerException executed");
        } catch (IllegalArgumentException exception) {
            System.out.println("IllegalArgumentException is caught. I handle it");
        }
        System.out.println("Code after catch");

        System.out.println("===== Custom Exceptions ====");
        Bag bag = new Bag(6);
        try {
            bag.putValue("item");
            bag.putValue("BAD_ITEM");
            bag.shakeItems(7);

//        } catch (BagException shakeException) {
//            System.out.println("ShakeException appears. Message: " + shakeException.getMessage());
//      Exceptions catch sequenect should goes from lower Class of Hierarchy to top
        } catch (ShakeException shakeException) {
            System.out.println("ShakeException appears. Message: " + shakeException.getMessage());
        } catch (BadItemException shakeException) {
            System.out.println("BadItemException appears. Message: " + shakeException.getMessage());
        } catch (BagException bagException){
//            int badConnetion = 1200;
//            if (bagException.getErrorCode() == badConnetion) {
//
//            }
            System.out.println("General BagException appears. Message: " + bagException.getMessage());
        } catch (RuntimeException exception) {
            String exceptionMessage = exception.getMessage();
            if (exceptionMessage.equals("Shake cannot be more than 5")) {
                // handle shake part
            } else if (exceptionMessage.equals("Bat items cannot be put in bag")) {
                // handle other
            }
            System.out.println("RuntimeException appears. Message: " + exceptionMessage);
        }

        bag.putValue("123");
        try {
            bag.putMoreWeight(44);
        } catch (NoMetterWhatException e) {
            System.out.println("NoMetterWhatException appears. Message: " + e.getMessage());
        }

        System.out.println("===== Error =====");
        try {
            String s = "abs";
            while (true) {
                s = s + s;
            }
        } catch (OutOfMemoryError error) {
            System.out.println("OutOfMemoryError appears");
        }
        System.out.println("Code after OutOfMemoryError");

    }
}
