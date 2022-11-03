package interviewpanal.controler;

import interviewpanal.model.Candidate;
import interviewpanal.model.CandidateDatabase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterviewControl {

    private static InterviewControl interviewControl;
    private Candidate candidate;
    private final Scanner scanner = new Scanner(System.in);
    private final CandidateDatabase candidateDatabase;
    public static InterviewControl getInstance() {
        if (interviewControl == null) interviewControl = new InterviewControl();
        return interviewControl;
    }
    public void interviewHall() {
        byte option = 0;
        while (!candidateDatabase.getCandidateQueue().isEmpty()) {
            try {
                System.out.println("Call Candiate   Press 1");
                System.out.println("Exit            Press 2");
                System.out.println("Enter the option");
                option = scanner.nextByte();
                if (option == 2) return;
                switch (option) {
                    case 1:
                        callCandidate();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.next();
            }
        }
        System.out.println("Completed");
    }
    private void callCandidate() {
        candidate = candidateDatabase.getCandidateQueue().poll();
        System.out.println("\nCandidate Name:          " + candidate.getCandidateName());
        System.out.println("Candidate DOB:           " + candidate.getCandidateDOB());
        System.out.println("Candidate Gender:        " + candidate.getCandidateGender());
        System.out.println("Candidate Qualification: " + candidate.getCandidateQualification());
        if(!candidateDatabase.getCandidateWaitingQueue().isEmpty())
            candidateDatabase.setCandidateQueue(candidateDatabase.getCandidateWaitingQueue().poll());
    }
    private InterviewControl() {
        candidateDatabase = CandidateDatabase.getInstance();
    }
}
