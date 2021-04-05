package automaton;

import java.util.ArrayList;

public class TransitionTable {

    public ArrayList<Transition> VTypeTable() {
        ArrayList<Transition> vTypeTransition = new ArrayList<Transition>();

        vTypeTransition.add(new Transition("0", 'i', "1"));
        vTypeTransition.add(new Transition("1", 'n', "2"));
        vTypeTransition.add(new Transition("2", 't', "17"));
        vTypeTransition.add(new Transition("0", 'c', "3"));
        vTypeTransition.add(new Transition("3", 'h', "4"));
        vTypeTransition.add(new Transition("4", 'a', "5"));
        vTypeTransition.add(new Transition("5", 'r', "17"));
        vTypeTransition.add(new Transition("0", 'b', "6"));
        vTypeTransition.add(new Transition("6", 'o', "7"));
        vTypeTransition.add(new Transition("7", 'o', "8"));
        vTypeTransition.add(new Transition("8", 'l', "9"));
        vTypeTransition.add(new Transition("9", 'e', "10"));
        vTypeTransition.add(new Transition("10", 'a', "11"));
        vTypeTransition.add(new Transition("11", 'n', "17"));
        vTypeTransition.add(new Transition("0", 'S', "12"));
        vTypeTransition.add(new Transition("12", 't', "13"));
        vTypeTransition.add(new Transition("13", 'r', "14"));
        vTypeTransition.add(new Transition("14", 'i', "15"));
        vTypeTransition.add(new Transition("15", 'n', "16"));
        vTypeTransition.add(new Transition("16", 'g', "17"));

        return vTypeTransition;
    }
}