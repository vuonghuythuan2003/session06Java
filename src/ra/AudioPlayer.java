package ra;

public class AudioPlayer implements Playeble{
    private String audioPlayer;

    public AudioPlayer(String audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void Play() {
        System.out.println("Đang phát bài hát: " + audioPlayer);
    }
}
