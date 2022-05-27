package Command;

public class Client {
    public static void main(String[] args) {
        File file = new File("tmps.txt");
        FileCommandExecutor fileCommandExecutor = new FileCommandExecutor();
        fileCommandExecutor.executeCommand(new OpenFileCommand(file));
        fileCommandExecutor.executeCommand(new SaveFileCommand(file));
        fileCommandExecutor.executeCommand(new CloseFileCommand(file));

//        fileCommandExecutor.executeCommand(file::close);
    }

}
