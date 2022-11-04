package chatbotapplication.model;

import java.util.Stack;

public class ChatBotDatabase {
    private static ChatBotDatabase chatBotDatabase;
    public static ChatBotDatabase getInstance() {
        if (chatBotDatabase == null) chatBotDatabase = new ChatBotDatabase();
        return chatBotDatabase;
    }
    public Stack<String> getStackList() {
        return stackList;
    }
    public void setStackList(String stackList) {
        this.stackList.push(stackList);
    }
    private Stack<String> stackList;
    private ChatBotDatabase() {
        stackList = new Stack<>();
    }
}
