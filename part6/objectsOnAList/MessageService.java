package part6.objectsOnAList;

import java.util.ArrayList;

public class MessageService {

  private ArrayList<Message> messageList;

  public MessageService() {
    this.messageList = new ArrayList<>();
  }

  public void add(Message message) {
    if(message.getContent().length()<=280) {
      messageList.add(message);
    }
  }

  public ArrayList<Message> getMessages() {
    return messageList;
  }
}
