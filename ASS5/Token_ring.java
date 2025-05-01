import java.util.Scanner;

class TokenRing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        int token = 0;  // Start token with node 0

        System.out.print("Ring Formation: ");
        for (int i = 0; i < n; i++)
            System.out.print(i + " -> ");
        System.out.println(0);  // Ring closes back to 0

        boolean running = true;  // flag to control main loop

        try {
            while (running) {
                System.out.println("\nToken is with node: " + token);
                System.out.print("Does node " + token + " want to enter Critical Section? (yes/no): ");
                String choice = sc.next();

                if (choice.equalsIgnoreCase("yes")) {
                    System.out.println("Node " + token + " is ENTERING Critical Section...");
                    Thread.sleep(2000); // Simulate CS
                    System.out.println("Node " + token + " is EXITING Critical Section...");
                }

                System.out.print("Do you want to continue? (yes/no): ");
                String cont = sc.next();

                if (cont.equalsIgnoreCase("no")) {
                    running = false;   // set running to false to break the loop
                    System.out.println("Exiting the Token Ring Simulation...");
                } else {
                    // pass token to next node
                    token = (token + 1) % n;
                }
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}