package LID;

public class WindowsMediaPlayer extends BasicVideoPlayer{
    @Override
    public void playAudio() {
        System.out.println("Windows media player is playing audio...");
    }

    @Override
    public void playVideo() {
        System.out.println("Windows media player is playing video...");
    }
}
