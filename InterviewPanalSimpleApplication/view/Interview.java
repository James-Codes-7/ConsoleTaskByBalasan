package interviewpanal.view;

import interviewpanal.controler.InterviewControl;
import interviewpanal.controler.ReceptionControl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interview {

    private ReceptionControl receptionControl;
    public InterviewControl interviewControl;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Interview interview = new Interview();
        interview.interviewPage();
    }

    private void interviewPage() {
        byte option = 0;
        while (true) {
            try {
                System.out.println("Reception               Press 1");
                System.out.println("Waiting hall            Press 2");
                System.out.println("Exit                    Press 3");
                option = scanner.nextByte();
                if (option == 3) return;
                switch (option) {
                    case 1:
                        receptionControl.receptionHall();
                        break;
                    case 2:
                        interviewControl.interviewHall();
                        break;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("\n" + e.getMessage());
                scanner.next();
            }
        }
    }
    private Interview() {
        receptionControl = ReceptionControl.getInstance();
        interviewControl = InterviewControl.getInstance();
    }
}
