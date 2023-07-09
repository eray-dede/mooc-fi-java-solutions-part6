package part6.objectsOnAList;

import java.util.ArrayList;

public class Hold {

  private int maxWeight;
  private int currentWeight;
  private int luggage;
  private ArrayList<Suitcase> suitcases;

  public Hold(int maxWeight) {
    this.maxWeight=maxWeight;
    this.currentWeight=0;
    this.luggage=0;
    this.suitcases=new ArrayList<>();
  }

  public void addSuitcase(Suitcase suitcase) {
    if(suitcase.totalWeight()+this.currentWeight<=this.maxWeight) {
      suitcases.add(suitcase);
      this.currentWeight+=suitcase.totalWeight();
      luggage++;
    }
  }

  public void printItems() {
    for(Suitcase suitcase : suitcases) {
      suitcase.printItems();
    }
  }

  public String toString() {
    return this.luggage + " suitcases (" + this.currentWeight + " kg)";
  }

}
