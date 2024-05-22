public class FileDemo {
    public static void main(String[] args) {
        String path = "E:/abc.txt";

        boolean createNewFile = FileManager.createFile(path);
        System.out.printf("createNewFile = " + createNewFile);
    }
}
