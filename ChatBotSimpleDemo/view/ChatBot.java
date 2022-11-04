package chatbotapplication.view;

import chatbotapplication.controler.ChatBotControler;

import java.util.Scanner;

public class ChatBot {
    private Scanner scanner=new Scanner(System.in);
    private ChatBotControler chatBotControler;
    public static void main(String[] args) {
        ChatBot chatBot = new ChatBot();
        chatBot.chatBotPage();
    }
    private void chatBotPage() {
        System.out.println("-->Welcome To ChatBot<--");
         chatBotControler.question1();
    }
    private ChatBot()
    {
        chatBotControler=ChatBotControler.getInstance();
    }

}
