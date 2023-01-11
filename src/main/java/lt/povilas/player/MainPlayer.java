package lt.povilas.player;

public class MainPlayer {
    public static void main(String[] args) {

        Player player = new Player();

        MusicCd musicCd01 = new MusicCd("Sting");
        MusicCd musicCd02 = new MusicCd("Radzis");
        MusicCd musicCd03 = new MusicCd("Cicinas");

        player.run(musicCd01);
        player.run(musicCd02);
        player.run(musicCd03);

        VideoDVD videoDVD01 = new VideoDVD("Terminator");
        VideoDVD videoDVD02 = new VideoDVD("Radzio atsisveikinimo koncertas");
        VideoDVD videoDVD03 = new VideoDVD("Cicino pasisveikinimo koncertas");

        player.run(videoDVD01);
        player.run(videoDVD02);
        player.run(videoDVD03);

        VideoBluRay videoBluRay01 = new VideoBluRay("videoBluRay01");
        VideoBluRay videoBluRay02 = new VideoBluRay("videoBluRay02");
        VideoBluRay videoBluRay03 = new VideoBluRay("videoBluRay03");

        player.run(videoBluRay01);
        player.run(videoBluRay02);
        player.run(videoBluRay03);

    }
}
