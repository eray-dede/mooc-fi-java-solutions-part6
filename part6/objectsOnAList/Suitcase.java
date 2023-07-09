package part6.objectsOnAList;

import java.util.ArrayList;

public class Suitcase {
  private ArrayList<Item> items;
  private int maxWeight;
  private int currentWeight;

  public Suitcase(int maxWeight) {
    this.maxWeight=maxWeight;
    this.items = new ArrayList<>();
    this.currentWeight=0;
  }

  public void addItem(Item item) {
    if(item.getWeight()+currentWeight<=maxWeight) {
      items.add(item);
      currentWeight+=item.getWeight();
    }
  }

  public int totalWeight() {
    return currentWeight;
  }

  public void printItems() {
    for(Item item : this.items) {
      System.out.println(item);
    }
  }

  public Item heaviestItem() {
    if(items.isEmpty()) {
      return null;
    }

    Item returnElement= items.get(0);

    for(Item item : this.items) {
      if(returnElement.getWeight()<item.getWeight()) {
        returnElement=item;
      }
    }

    return returnElement;
  }

  public String toString() {
    if(items.size()==0) {
      return "no items (" + currentWeight + " kg)";
    } else if(items.size()==1) {
      return items.size() + " item (" + currentWeight + " kg)";
    }
    return items.size() + " items (" + currentWeight + " kg)";
  }



}
