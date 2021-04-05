package lexicalAnalyzer;

import java.io.*;

public class LexicalAnalyzer {

    private File file;
    private String currentState;

    public LexicalAnalyzer(File file) {
        this.file = file;
    }

    public void StateReset() {
        this.currentState = "T0";
    }

    public void Tokenize(File file) {

    }
}