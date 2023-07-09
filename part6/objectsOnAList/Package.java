package part6.objectsOnAList;

import java.util.ArrayList;

public class Package {

  private ArrayList<Gift> gifts;
  private int totalWeight=0;

  public Package() {
    this.gifts=new ArrayList<>();
  }

  public void addGift(Gift gift) {
    gifts.add(gift);
  }

  public int totalWeight() {
    for(Gift gift: gifts) {
      totalWeight+= gift.getWeight();
    }
    return totalWeight;
  }

}
