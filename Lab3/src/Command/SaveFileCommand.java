package Command;

public class SaveFileCommand implements FileCommand{

    private File file;

    public SaveFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.save();
    }
}
