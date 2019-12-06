import java.io.*;

public class ChatMessage implements Serializable {

    static final int ONLINE = 0, MESSAGE = 1, LOGOUT = 2;
    private int type;
    private String message;


    ChatMessage(int type, String message) {
        this.type = type;
        this.message = message;
    }

    int getType() {
        return type;
    }

    String getMessage() {
        return message;
    }
}