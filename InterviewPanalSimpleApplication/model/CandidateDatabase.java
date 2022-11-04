package interviewpanal.model;

import java.util.LinkedList;
import java.util.Queue;

public class CandidateDatabase {
    private static CandidateDatabase candidateDatabase;
    private Queue<Candidate> candidateQueue;
    private Queue<Candidate> candidateWaitingQueue;
    public Queue<Candidate> getCandidateQueue() {
        return candidateQueue;
    }
    public void setCandidateQueue(Candidate candidate) {
        this.candidateQueue.offer(candidate);
    }
    public Queue<Candidate> getCandidateWaitingQueue() {
        return candidateWaitingQueue;
    }
    public void setCandidateWaitingQueue(Candidate candidateWaitingQueue) {
        this.candidateWaitingQueue.offer(candidateWaitingQueue);
    }
    public static CandidateDatabase getInstance() {
        if (candidateDatabase == null) candidateDatabase = new CandidateDatabase();
        return candidateDatabase;
    }
    private CandidateDatabase() {
        candidateQueue = new LinkedList<>();
        candidateWaitingQueue = new LinkedList<>();
    }
}
