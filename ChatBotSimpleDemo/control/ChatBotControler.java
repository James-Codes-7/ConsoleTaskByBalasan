package chatbotapplication.controler;

import chatbotapplication.model.ChatBotDatabase;

import java.util.Scanner;

public class ChatBotControler {

    private Scanner scanner = new Scanner(System.in);
    private ChatBotDatabase chatBotDatabase;
    private static ChatBotControler chatBotControler;
    private String option = "";

    public static ChatBotControler getInstance() {
        if (chatBotControler == null) chatBotControler = new ChatBotControler();
        return chatBotControler;
    }

    public void question1() {
        System.out.println("\n-->Question 1<---");
        System.out.println("-->Target Sum<--\n");
        System.out.println("Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.\n" +
                "\n" +
                "You may assume that each input would have exactly one solution, and you may not use the same element twice.\n" +
                "\n" +
                "You can return the answer in any order.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: nums = [2,7,11,15], target = 9\n" +
                "Output: [0,1]\n" +
                "Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].\n");
        System.out.println("View Next Question Press 1");
        System.out.println("Go Back         Press 0");
        System.out.println("Enter the Option ");
        option = scanner.next();
        if (option.equals("1")) {
            chatBotDatabase.setStackList("question1");
            question2();
        } else if (option.equals("0")) System.exit(0);
    }

    private void scrollControl() {
        System.out.println("View Next Question Press 1");
        System.out.println("Go Back         Press 0");
        System.out.println("Enter the Option ");
    }

    private void question2() {
        System.out.println("\n-->Ouestion 2<--");
        System.out.println("-->Longest Palindromic SubString<--\n");
        System.out.println("Given a string s, return the longest palindromic substring in s.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: s = \"babad\"\n" +
                "Output: \"bab\"\n" +
                "Explanation: \"aba\" is also a valid answer.\n" +
                "Example 2:\n" +
                "\n" +
                "Input: s = \"cbbd\"\n" +
                "Output: \"bb\"");
        scrollControl();
        option = scanner.next();
        if (option.equals("1")) {
            chatBotDatabase.setStackList("question2");
            question3();
        } else if (!chatBotDatabase.getStackList().isEmpty() && option.equals("0"))
            backTrack(chatBotDatabase.getStackList().pop());
        else question2();
    }

    private void question3() {
        System.out.println("\n-->Question 3<--");
        System.out.println("-->Reverse Integer<--\n");
        System.out.println("Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.\n" +
                "\n" +
                "Assume the environment does not allow you to store 64-bit integers (signed or unsigned).\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: x = 123\n" +
                "Output: 321\n" +
                "Example 2:\n" +
                "\n" +
                "Input: x = -123\n" +
                "Output: -321");
        scrollControl();
        option = scanner.next();
        if (option.equals("1")) {
            chatBotDatabase.setStackList("question3");
            question4();
        } else if (option.equals("0") && !chatBotDatabase.getStackList().isEmpty())
            backTrack(chatBotDatabase.getStackList().pop());
        else question3();
    }

    private void question4() {
        System.out.println("\n-->Question 4<--");
        System.out.println("-->Palindrome Number<--\n");
        System.out.println("Given an integer x, return true if x is a palindrome, and false otherwise.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: x = 121\n" +
                "Output: true\n" +
                "Explanation: 121 reads as 121 from left to right and from right to left.");
        scrollControl();
        option = scanner.next();
        if (option.equals("1")) {
            chatBotDatabase.setStackList("question4");
            question5();
        } else if (option.equals("0") && !chatBotDatabase.getStackList().isEmpty()) {
            backTrack(chatBotDatabase.getStackList().pop());
        } else question4();
    }

    private void question5() {
        System.out.println("\n-->Question 5<--");
        System.out.println("-->Search Insert Position<--");
        System.out.println("Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.\n" +
                "\n" +
                "You must write an algorithm with O(log n) runtime complexity.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: nums = [1,3,5,6], target = 5\n" +
                "Output: 2");
        System.out.println("Go Back             Press 0");
        System.out.println("Enter the Option ");
        option = scanner.next();
        if (option.equals("0") && !chatBotDatabase.getStackList().isEmpty())
            backTrack(chatBotDatabase.getStackList().pop());
        else question5();
    }

    private void backTrack(String methodName) {
        switch (methodName) {
            case "question1":
                question1();
                break;
            case "question2":
                question2();
                break;
            case "question3":
                question3();
                break;
            case "question4":
                question4();
                break;
            case "question5":
                question5();
        }
    }

    private ChatBotControler() {
        chatBotDatabase = ChatBotDatabase.getInstance();
    }
}
