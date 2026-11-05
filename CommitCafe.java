public class CommitCafe {

    private static String barista = "Nadine"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String nickname = "The Coffee Master"; 

    private static int cups = 0;
    

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        // STUDENT_TODO_2B: Add a second brew-related improvement
        System.out.println("Grabbing the cups...");
        System.out.println("Grinding the beans...");
        System.out.println("Steaming the milk...");
        cups++;
        System.out.println(barista + " (" + nickname + ") brewed a " + drink + "!");
        
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}