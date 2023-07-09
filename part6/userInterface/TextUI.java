package part6.userInterface;

import java.util.Scanner;

public class TextUI {
  private Scanner scanner;
  private SimpleDictionary dictionary;

  public TextUI(Scanner scanner, SimpleDictionary dictionary) {
    this.scanner=scanner;
    this.dictionary=dictionary;
  }

  public void start() {
    while(true) {
      System.out.println("Command:");
      String word=scanner.nextLine();

      if(word.equals("end")) {
        System.out.println("Bye bye!");
        break;
      } else if(word.equals("add")) {
        System.out.println("Word:");
        String word1=scanner.nextLine();

        System.out.println("Translation:");
        String translation=scanner.nextLine();

        dictionary.add(word1, translation);

      } else if(word.equals("search")) {
        System.out.println("To be translated:");
        String translated=scanner.nextLine();
        String returnTranslation=dictionary.translate(translated);

        if(returnTranslation==null) {
          System.out.println("Word: "+ translated + " was not found");
        } else {
          System.out.println("Translation: " + dictionary.translate(translated));
        }
      } else {
        System.out.println("Unknown command");
      }
    }
  }


}
