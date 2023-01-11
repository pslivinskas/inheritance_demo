package lt.povilas.player;

public class VideoDVD implements Multimedia {
    private String name;

    public VideoDVD(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Video DVD is playing: " + this.name);
    }
}
