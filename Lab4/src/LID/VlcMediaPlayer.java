package LID;

public class VlcMediaPlayer extends BasicVideoPlayer {
    @Override
    public void playVideo() {
        System.out.println("VLC media player is playing video...");
    }

    @Override
    public void playAudio() {
        System.out.println("VLC media player is playing audio...");
    }
}
