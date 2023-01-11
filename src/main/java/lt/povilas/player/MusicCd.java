package lt.povilas.player;

public class MusicCd implements Multimedia {
    private String artist;

    public MusicCd(String artist) {
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Music CD is playing: " + this.artist);
    }
}
