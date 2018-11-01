public class ChatRoom implements Observer {

    private Subject chatServer;
    private String roomName;
    private String message;

    ChatRoom (Subject chatServer, String roomName){
        this.roomName = roomName;
        this.chatServer = chatServer;
        System.out.println("New room - " + roomName + " has been added to the engine.");
        chatServer.addObserver(this);
    }

    @Override
    public void getNotification(ChatMessage message) {
        System.out.println(roomName + " got a new message from the Server (" + message.chatRoom + ")" );
        if (message.chatRoom.equals(roomName)) System.out.println("Message is for me - " + roomName + ": " + message.message);
    }
}
