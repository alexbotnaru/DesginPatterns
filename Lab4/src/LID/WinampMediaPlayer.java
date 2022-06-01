package LID;

public class WinampMediaPlayer extends BasicAudioPlayer{
    @Override
    public void playAudio() {
        System.out.println("Winamp media player is playing audio...");
    }

    public void printVersion() {
        System.out.println("Winamp 5.0.2");
    }
}
