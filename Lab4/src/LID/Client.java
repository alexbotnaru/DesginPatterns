package LID;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        //Interface Segregation demonstration
        System.out.println("Video players");
        List<VideoPlayer> videoPlayers = List.of(new VlcMediaPlayer(), new WindowsMediaPlayer());
        videoPlayers.forEach((VideoPlayer::playVideo));

        System.out.println("\nAudio players");
        List<AudioPlayer> audioPlayers = List.of(new VlcMediaPlayer(), new WindowsMediaPlayer(), new WinampMediaPlayer());
        audioPlayers.forEach(AudioPlayer::playAudio);

        //Liskov substitution demonstration
        System.out.println("\nLiskov substitution demo");
        BasicVideoPlayer basicVideoPlayer = new VlcMediaPlayer();
        basicVideoPlayer.playVideo();

        BasicAudioPlayer basicAudioPlayer = new WinampMediaPlayer();
        basicAudioPlayer.playAudio();


        //Dependency Inversion demo
        AudioPlayer audioPlayer = new WinampMediaPlayer();

    }
}
