package part6.userInterface;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

  private ArrayList<String> jokes;

  public JokeManager() {
    this.jokes = new ArrayList<String>();
  }
  public void addJoke(String joke) {
    jokes.add(joke);
  }
  public String drawJokes() {
    if (jokes.isEmpty()) {
      return "Jokes are in short supply";
    }
    Random number = new Random();
    int i = number.nextInt(jokes.size());
    return jokes.get(i);
  }
  public void printJokes() {
    for(int i=0;i<jokes.size();i++) {
      System.out.println(jokes.get(i));
    }
  }


}
