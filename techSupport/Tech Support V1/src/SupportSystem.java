import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//class uses responder to generate response, contains a loop that repeatedly reads input until user exits
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;



    //create support system
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }
    public static void main(String[] argvs)
    {
        SupportSystem app = new SupportSystem();

        app.startSupport();

    }
  //print message and start support system
    public void startSupport()
    {

        printWelcome();
        HashSet<String> input = reader.getInput();
        while(!input.contains("bye")) {

            String response = responder.generateResponse(input);
            System.out.println(response);

            input = reader.getInput();
        }
        printSupportGoodbye();
    }


   //print welcome to terminal
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem. We will assist you");
        System.out.println("with any problem you might have. Please type 'bye'");
        System.out.println("to exit our system.");
    }

 //print goodbye to terminal
    private void printSupportGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }


}
