package part6.userInterface;

import java.util.Scanner;

public class jokeManagerMain {

  public static void main(String[] args) {
    JokeManager manager = new JokeManager();
    Scanner scanner = new Scanner(System.in);

    JokeManagerUI ui = new JokeManagerUI(manager, scanner);
    ui.start();
  }

}
