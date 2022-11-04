package interviewpanal.controler;

import interviewpanal.model.Candidate;
import interviewpanal.model.CandidateDatabase;
import interviewpanal.util.Validation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReceptionControl {
    private int control = 0;
    private CandidateDatabase candidateDatabase;
    private static ReceptionControl receptionControl;
    private Scanner scanner = new Scanner(System.in);
    private Validation validation;
    public static ReceptionControl getInstance() {
        if (receptionControl == null) receptionControl = new ReceptionControl();
        return receptionControl;
    }
    public void receptionHall() {
        System.out.println("-->Welcome<--");
        byte option = 0;
        while (true) {
            Candidate candidate = new Candidate();
            if (control != 0) scanner.nextLine();
            control++;
            System.out.println("Enter the name");
            String name = scanner.nextLine();
            if (!validation.nameValidation(name)) continue;
            System.out.println("Candidate DOB");
            String DOB = scanner.next();
            System.out.println("Candidate gender  Male Press 1 Female Press 2");
            String gender = "-";
            option = scanner.nextByte();
            try {
                if (option == 1)
                    gender = "Male";
                else gender = "Female";

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Candidate Qualification");
            String qualification = scanner.next();
            candidate.setCandidateName(name);
            candidate.setCandidateDOB(DOB);
            candidate.setCandidateGender(gender);
            candidate.setCandidateQualification(qualification);
            if (candidateDatabase.getCandidateQueue().size() <= 10)
                candidateDatabase.setCandidateQueue(candidate);
            else candidateDatabase.setCandidateWaitingQueue(candidate);
            System.out.println("-->Thank You <--");
            break;
        }
    }
    private ReceptionControl() {
        candidateDatabase = CandidateDatabase.getInstance();
        validation = Validation.getInstance();
    }
}
