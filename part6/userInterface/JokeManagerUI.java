package part6.userInterface;

import java.util.Scanner;

public class JokeManagerUI {

  private JokeManager manager;
  private Scanner scanner;

  public JokeManagerUI(JokeManager manager, Scanner scanner) {
    this.manager = manager;
    this.scanner = scanner;
  }

  public void commands() {

  }

  public void start() {
    while(true) {
      System.out.println("Commands:");
      System.out.println(" 1 - add a joke");
      System.out.println(" 2 - draw a joke");
      System.out.println(" 3 - list jokes");
      System.out.println(" X - stop");

      Scanner reader = new Scanner(System.in);
      String command = reader.nextLine();

      if(command.equals("") || command.equals("X")) {
        break;
      }

      if(command.equals("1")) {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        manager.addJoke(joke);
      } else if(command.equals("2")) {
        System.out.println("Drawing a joke.");
        manager.drawJokes();
      } else if(command.equals("3")) {
        System.out.println("Printing the jokes.");
        manager.printJokes();
      }
    }
  }

}
