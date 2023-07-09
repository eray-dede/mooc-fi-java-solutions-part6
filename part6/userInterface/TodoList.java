package part6.userInterface;

import java.util.ArrayList;

public class TodoList {

  private ArrayList<String> todo;

  public TodoList() {
    this.todo=new ArrayList<String>();
  }

  public void add(String task) {
    todo.add(task);
  }

  public void print() {
    for(int i=0; i<todo.size(); i++) {
      System.out.println((i+1) + ":" + todo.get(i));
    }
  }

  public void remove(int number) {
    todo.remove(number-1);
  }

}
