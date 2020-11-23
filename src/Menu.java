import java.util.Scanner;

public class Menu {
    private static StackADT<String> arrayStack = new ArrayStack<>();

    public void CLI() {
        Scanner scanner = new Scanner(System.in);
        //Batch batch = new Batch();

        System.out.println("");
        System.out.println("Welcome to the ArrayStack Application");
        //System.out.println("");

        //check if today's grade prices have been submitted
        //batch.pricingPrompt();


        System.out.println("");
        System.out.println("Choose an option:");
        System.out.println("1. Add a String value");
        System.out.println("2. Remove the top value");
        System.out.println("3. Examine top value");
        System.out.println("4. Is stack empty?");
        System.out.println("5. Show me stack size");
        System.out.println("quit  -This can be typed at any point to leave");
        System.out.println("menu  -This can be typed at any point to come back to menu");
        System.out.println("");

        String input;
        boolean validInput;
        do {
            validInput = false;
            System.out.print(">>> ");

            input = scanner.nextLine();
            //System.out.println("");
            //System.out.print("You have selected option: " + input);

            //Call appropriate functionality from input
            switch (input) {
                case "1":
                    validInput = true;
                    System.out.println("Enter a String value: ");
                    input = scanner.nextLine();
                    arrayStack.push(input);
                    System.out.println("Value added: " + arrayStack.top());
                    pressEnterToContinue();
                    CLI();
                    break;
                case "2":
                    validInput = true;
                    System.out.println("Top value: " + arrayStack.pop() + " was removed");
                    pause();
                    CLI();
                    break;
                case "3":
                    validInput = true;
                    System.out.println("Top value is: " + arrayStack.top());
                    pressEnterToContinue();
                    CLI();
                    break;
                case "4":
                    validInput = true;
                    System.out.println("Is stack empty? : " + arrayStack.isEmpty());
                    pressEnterToContinue();
                    CLI();
                    break;
                case "5":
                    validInput = true;
                    System.out.println("Stack size: " + arrayStack.size());
                    pressEnterToContinue();
                    CLI();
                    break;
                case "menu":
                    validInput = true;
                    CLI();
                    break;
                case "quit":
                    validInput = true;
                    System.out.println("Goodbye");
                    break;
                default:
                    break;
            }
        } while (validInput == false);
    }


    //Press enter button to proceed to next program stage
    public void pressEnterToContinue() {
        System.out.println("** Press ENTER to return to menu **");
        try {
            System.in.read();
            CLI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //This is used to allow users to return to menu or quit throughout the program
    public void hotKeys(String hotKey) {
        if (hotKey.equals("quit")) {
            System.exit(0);
        } else if (hotKey.equals("menu")) {
            CLI();
        }
    }

    public void pause(){
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

}
