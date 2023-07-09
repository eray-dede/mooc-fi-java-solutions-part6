package part6.objectsOnAList;

import java.util.ArrayList;

public class Room {

  private ArrayList<Person> listOfPerson;

  public Room() {
    this.listOfPerson = new ArrayList<>();
  }

  public void add(Person person) {
    listOfPerson.add(person);
  }

  public boolean isEmpty() {
    if(listOfPerson.isEmpty()) {
      return true;
    }
    return false;
  }

  public ArrayList<Person> getPersons() {
    return listOfPerson;
  }

  public Person shortest() {
    if(listOfPerson.isEmpty()) {
      return null;
    }

    Person returnObject = this.listOfPerson.get(0);

    for(Person person : listOfPerson) {
      if(returnObject.getHeight()>person.getHeight()){
        returnObject=person;
      }
    }

    return returnObject;
  }

  public Person take() {
    if(listOfPerson.isEmpty()) {
      return null;
    }

    Person returnObject = this.listOfPerson.get(0);

    for(Person person : listOfPerson) {
      if(returnObject.getHeight()>person.getHeight()){
        returnObject=person;
      }
    }
    listOfPerson.remove(returnObject);

    return returnObject;
  }
}
