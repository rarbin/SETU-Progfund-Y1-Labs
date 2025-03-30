import java.util.Scanner;
import java.util.HashSet;


//reads typed text input from terminal, then turned into words that are identified and a set of words is returned

public class InputReader
{
    Scanner input;


    //read text from terminal
    public InputReader()
    {
     input = new Scanner(System.in); 
    }


    //reads a line of text returns it as string

    public HashSet<String> getInput() {
        System.out.print("> ");
        String inputLine = input.nextLine().trim().toLowerCase();

        String[] wordArray = inputLine.split("");

        HashSet<String> words = new HashSet<>();
        for (String word : wordArray) {
            words.add(word);
        }
        return words;
    } }
