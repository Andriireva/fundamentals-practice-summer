package files;

public class TryWithResources {
    public static void main(String[] args) {
        // Only classes that implement AutoClosable Interface
        try (  MyCustomClose myCustomClose = new MyCustomClose()  ) {

        }
    }
}
