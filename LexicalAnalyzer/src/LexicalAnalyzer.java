import java.io.*;

public class LexicalAnalyzer {

    private File file;

    public LexicalAnalyzer(File file) {
        this.file = file;
    }

    @Override
    public String toString() {

        String str = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            str = br.readLine();

            br.close();

        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

        return "LexicalAnalyzer{" +
                "file=" + str +
                '}';
    }
}