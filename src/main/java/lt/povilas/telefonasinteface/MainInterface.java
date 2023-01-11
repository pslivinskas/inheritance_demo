package lt.povilas.telefonasinteface;

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


    }
}
