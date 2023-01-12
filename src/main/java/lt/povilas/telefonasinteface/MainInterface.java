package lt.povilas.telefonasinteface;

import java.util.ArrayList;
import java.util.List;

public class MainInterface {
    public static void main(String[] args) {
//        Telefonas telefonas01 = new Telefonas("8-5-123 4561");
        Mobilus mobilus01 = new Mobilus("8-687-12311", "1234 1234 1234");
        Taksofonas taksofonas01 = new Taksofonas(0.65);

//        telefonas01.setMelodija("lia-lia-lia");
//        System.out.println(telefonas01);
//        telefonas01.paskambink("8-46-12345");
//        telefonas01.paskambink("8-650-45645");

        System.out.println();

        mobilus01.fotografuok();
        mobilus01.fotografuok();
        mobilus01.fotografuok();
        mobilus01.setMelodija("Jazz melodija");
        System.out.println(mobilus01);
        mobilus01.paskambink("+1-54849849984");
        mobilus01.paskambink("8-5-1234561");

        System.out.println();

        System.out.println(taksofonas01);
        taksofonas01.paskambink("8-5-1234-456");
        taksofonas01.paskambink("8-650-45645");
        taksofonas01.paskambink("8-650-45645");
        System.out.println(taksofonas01);
        taksofonas01.setPiniguLikutis(0.35);
        taksofonas01.paskambink("8-650-45645");
        System.out.println(taksofonas01);

        System.out.println("-------------");
        System.out.println("--- Lists ---");
        System.out.println("-------------");

        Mobilus mobilus02 = new Mobilus("8-687-12381", "1234 1234 1234");
        Mobilus mobilus03 = new Mobilus("8-687-12381", "1234 1234 1234");
        Taksofonas taksofonas02 = new Taksofonas(0.85);
        Taksofonas taksofonas03 = new Taksofonas(1.55);

        String kintString01;
        kintString01 = "wioefnoiwe";
        String kintString02 = new String("iefnjoie");

        List<Object> telefonai = new ArrayList<>();

        telefonai.add(mobilus01);
        telefonai.add(mobilus02);
        telefonai.add(mobilus03);
        System.out.println(telefonai);

        telefonai.add(taksofonas01);
        telefonai.add(taksofonas02);
        telefonai.add(taksofonas03);
        System.out.println(telefonai);

        telefonai.add(kintString01);
        telefonai.add(kintString02);
        System.out.println(telefonai);

    }
}
