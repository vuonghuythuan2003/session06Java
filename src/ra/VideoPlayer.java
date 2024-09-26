package ra;

public class VideoPlayer implements Playeble{
    private String videoPlayerFile;

    public VideoPlayer(String videoPlayerFile){
        this.videoPlayerFile = videoPlayerFile;
    }

    public VideoPlayer() {

    }

    @Override
    public void Play() {
        System.out.println("Đang phát video: " + videoPlayerFile);
    }
}
