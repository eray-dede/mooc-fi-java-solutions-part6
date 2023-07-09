package part6.userInterface;

import java.util.Scanner;

public class WordSetProgram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    WordSet set = new WordSet();

    UserInterfacee userInterfacee = new UserInterfacee(set, scanner);
    userInterfacee.start();
  }

}
