package part6.objectsOnAList;

import java.util.ArrayList;

public class Stack {

  private ArrayList<String>  list;

  public Stack() {
    this.list=new ArrayList<>();
  }

  public boolean isEmpty() {
    if(list.size()==0) {
      return true;
    }
    return false;
  }

  public void add(String value) {
    list.add(list.size(),value);
  }

  public ArrayList<String> values() {
    return list;
  }

  public String take() {
    String taken = list.get(list.size()-1);
    list.remove(taken);
    return taken;
  }
}
