package automaton;

import java.util.ArrayList;

public class DFA {

    public boolean CheckInput(char input, ArrayList<Transition> table, String currentState) {

        for (int i = 0; i < table.size(); i++) {
            if (table.get(i).getCurrentState() == currentState && table.get(i).getTransition() == input) {
                return true;
            }
        }

        return false;
    }
}
