package Command;

import java.util.ArrayList;
import java.util.List;

public class FileCommandExecutor {

    private final List<FileCommand> fileCommandList = new ArrayList<>();

    public void executeCommand(FileCommand fileCommand){
        fileCommandList.add(fileCommand);
        fileCommand.execute();
    }

    public void print() {
        System.out.println("Command list: ");fileCommandList.forEach(System.out::println);
    }
}
