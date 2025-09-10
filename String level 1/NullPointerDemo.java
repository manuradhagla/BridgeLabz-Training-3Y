public class NullPointerDemo {
    public static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException if uncommented
        // System.out.println(text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    // Safe variant: avoid NPE
    public static void safeCheck() {
        String text = null;
        if (text != null) {
            System.out.println("Length: " + text.length());
        } 
        else {
            System.out.println("text is null, cannot determine length.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating safe handling:");
        safeCheck();

        System.out.println("\nDemonstrating catch (not recommended as first choice):");
        handleNullPointerException();
    }
}