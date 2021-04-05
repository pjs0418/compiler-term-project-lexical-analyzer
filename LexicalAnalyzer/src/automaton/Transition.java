package automaton;

public class Transition {

    private String currentState;
    private char transition;
    private String nextState;

    public Transition(String currentState, char transition, String nextState) {
        this.currentState = currentState;
        this.transition = transition;
        this.nextState = nextState;
    }

    public String getCurrentState() {
        return currentState;
    }

    public char getTransition() {
        return transition;
    }

    public String getNextState() {
        return nextState;
    }
}
