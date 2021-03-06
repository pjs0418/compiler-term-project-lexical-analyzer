package lexicalAnalyzer;

import automaton.DFA;
import automaton.Transition;
import automaton.TransitionTable;

import java.io.*;

public class LexicalAnalyzer {

    private File file;
    private String currentState;
    private String[] tokens = {"VTYPE"};
    private char popCharacter;
    private int currentCharIdx;

    public LexicalAnalyzer(File file) {
        this.file = file;
    }

    public void ResetState() {
        this.currentState = "0";
    }

    public void Tokenize() throws IOException {
        String line;
        Transition transitionInput;
        String validInput = "";

        DFA dfa = new DFA();
        TransitionTable tsTable = new TransitionTable();

        BufferedReader br = new BufferedReader(new FileReader(file));

        while ((line = br.readLine()) != null) {
            line = br.readLine();
            this.currentCharIdx = 0;

            for (int i = 0; i < tokens.length; i++) {

                if (tokens[i] == "VTYPE") {

                    ResetState();

                    for (int j = currentCharIdx; j < line.length(); j++) {

                        this.popCharacter = line.charAt(j);

                        transitionInput = dfa.CheckInput(popCharacter, tsTable.VTypeTable(), currentState);

                        if(transitionInput.GetCurrentState() == "trash") {



                        }
                        else {
                            currentState = transitionInput.GetNextState();
                            validInput.concat(Character.toString(popCharacter));
                            continue;
                        }

                    }
                }
            }


        }
    }
}