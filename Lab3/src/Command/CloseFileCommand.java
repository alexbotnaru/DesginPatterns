package Command;

public class CloseFileCommand implements FileCommand{

    private File file;

    public CloseFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.close();
    }
}
