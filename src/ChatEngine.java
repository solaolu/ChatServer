import java.lang.reflect.Array;

public class ChatEngine {

    public static void main(String[] args){
        ChatServer chatServer = new ChatServer();

        ChatRoom chatRoom1 = new ChatRoom(chatServer, "Room 1");
        ChatRoom chatRoom2 = new ChatRoom(chatServer, "Room 2");
        ChatRoom chatRoom3 = new ChatRoom(chatServer, "Room 4");

        String[] msgs = {"Message 1, no room will pick this","Hello World","I'm new here","I love this will also not be posted","Cool stuff"};

        for (int i=0; i<5; i++){
            ChatMessage cm = new ChatMessage();
            cm.message = msgs[i];
            cm.chatRoom = "Room "+i;
            chatServer.sendMessage(cm);
            try{
            Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
