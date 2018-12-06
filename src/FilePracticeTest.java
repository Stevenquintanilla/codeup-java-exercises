public class FilePracticeTest {

    public static void main(String[] args) {
        FilePractice filePractice = new FilePractice();

        filePractice.getFile("src/data", "test.txt");
        filePractice.showFileData("src/data", "test.txt");
        filePractice.writeFile("src/data", "test.txt", "I EDITED THIS FILE");
        filePractice.showFileData("src/data", "test.txt");
    }
}
