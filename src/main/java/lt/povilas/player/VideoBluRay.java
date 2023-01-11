package lt.povilas.player;

public class VideoBluRay implements Multimedia {
    private String name;

    public VideoBluRay(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("VideoBluRay is playing: " + this.name);
    }
}
