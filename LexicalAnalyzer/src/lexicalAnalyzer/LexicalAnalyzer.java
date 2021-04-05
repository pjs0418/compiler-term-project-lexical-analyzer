package lexicalAnalyzer;

import automaton.DFA;
import automaton.TransitionTable;

import java.io.*;

public class LexicalAnalyzer {

    private File file;
    private String currentState;
    private String[] tokens = {"VTYPE"};
    private char popCharacter;

    public LexicalAnalyzer(File file) {
        this.file = file;
    }

    public void ResetState() {
        this.currentState = "0";
    }

    public void Tokenize() throws IOException {
        String line;
        boolean checkInput;

        DFA dfa = new DFA();
        TransitionTable tsTable = new TransitionTable();

        BufferedReader br = new BufferedReader(new FileReader(file));

        while ((line = br.readLine()) != null) {
            line = br.readLine();

            for (int i = 0; i < line.length(); i++) {
                this.popCharacter = line.charAt(i);

                for (int j = 0; j < tokens.length; j++) {
                    if (tokens[j] == "VTYPE") {
                        checkInput = dfa.CheckInput(popCharacter, tsTable.VTypeTable(), currentState);
                    }
                }
            }
        }
    }
}