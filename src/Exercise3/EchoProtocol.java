package Exercise3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeanette
 */
public class EchoProtocol
{

    public String processInput(String theInput)
    {
        String[] splitInput = new String[100];
        String theOutput = null;
        String[] wordArray =
        {
            "hund,Dog", "hest,Horse", "fisk,fish", "hus,House"
        };
        splitInput = theInput.split("#");

        for (String input : splitInput)
        {
            System.out.println(input);
            if (input.contains("UPPER"))
            {
                System.out.println("kommer vi her ind?");
                return theOutput = (String) splitInput[splitInput.length - 1].toUpperCase();

            } else if (input.contains("LOWER"))
            {
                return theOutput = (String) splitInput[splitInput.length - 1].toLowerCase();

            } else if (input.contains("REVERSE"))
            {
                return theOutput = Reverser(splitInput);
            } else if (input.contains("TRANSLATE"))
            {
                for (String translatedWords : wordArray)
                {
                    System.out.println("translate word: " + translatedWords);
                    if (translatedWords.contains((String) splitInput[splitInput.length - 1]))
                    {
                        System.out.println("kommer vi her ned?");
                        String[] splitTranslatedWord = translatedWords.split(",");
                        return theOutput = (String) splitTranslatedWord[splitTranslatedWord.length - 1];
                    }
                }
                return theOutput="#NOT FOUND";
            }
        }
        return theOutput = "Bye.";
    }

    public String Reverser(String[] inputArray)
    {
        String result = "";
        String string = inputArray[inputArray.length - 1];
        for (int i = string.length() - 1; i >= 0; i--)
        {
            result = result + string.charAt(i);
        }
        return result;
    }
}
