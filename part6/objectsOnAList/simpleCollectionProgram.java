package part6.objectsOnAList;

public class simpleCollectionProgram {

  public static void main(String[] args) {

    SimpleCollection j = new SimpleCollection("characters");
    System.out.println("Longest: " + j.longest());

    j.add("magneto");
    j.add("mystique");
    j.add("phoenix");

    System.out.println("Longest: " + j.longest());
  }

}
