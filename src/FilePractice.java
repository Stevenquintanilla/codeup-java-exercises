import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class FilePractice {

    public void getFile(String directory, String filename) {
        Path chosenFile = Paths.get(directory, filename);
        System.out.println(chosenFile);
    }

    public void writeFile(String directory, String filename, String userContent) {
        try {
            Path chosenFile = Paths.get(directory, filename);
            List<String> createdList = Arrays.asList(userContent);
            Files.write(chosenFile, createdList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showFileData(String directory, String filename) {
        try {
            Path chosenFile = Paths.get(directory, filename);
            List<String> fileData = Files.readAllLines(chosenFile);

            for (int i = 0; i < fileData.size(); i += 1) {
                System.out.println(fileData.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
