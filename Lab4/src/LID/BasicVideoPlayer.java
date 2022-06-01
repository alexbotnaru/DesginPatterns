package LID;

public class BasicVideoPlayer implements VideoPlayer{
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video");
    }
}
