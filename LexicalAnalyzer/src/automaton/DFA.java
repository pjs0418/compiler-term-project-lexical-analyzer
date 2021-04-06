package automaton;

import java.util.ArrayList;

public class DFA {

    public Transition CheckInput(char input, ArrayList<Transition> table, String currentState) {

        for (int i = 0; i < table.size(); i++) {
            if (table.get(i).GetCurrentState() == currentState && table.get(i).GetTransition() == input) {
                return table.get(i);
            }
        }

        return new Transition("df", 'd', "Df");
    }

}
