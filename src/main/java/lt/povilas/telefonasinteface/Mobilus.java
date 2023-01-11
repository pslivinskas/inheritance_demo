package lt.povilas.telefonasinteface;

public class Mobilus implements Telefonas {

    private String simNr;
    private int nuotraukuSkaicius = 0;
    private String numeris;
    private String melodija;

    public Mobilus(String numeris, String simNr) {
        this.numeris = numeris;
        this.simNr = simNr;
    }

    public void fotografuok() {
        this.nuotraukuSkaicius++;
    }

    public String getSimNr() {
        return simNr;
    }

    public int getNuotraukuSkaicius() {
        return nuotraukuSkaicius;
    }

    public String getMelodija() {
        return melodija;
    }

    public void setMelodija(String melodija) {
        this.melodija = melodija;
    }

    @Override
    public void paskambink(String telefonoNumeris) {
        System.out.println(
                String.format(
                        "Abonimentas %s skambina i %s",
                        this.numeris,
                        telefonoNumeris
                )
        );
    }

    @Override
    public String toString() {
        return String.format(
                "Mobilus[numeris: %s, simNr: %s, melodija: %s, nuotraukos: %s]",
                this.numeris,
                this.simNr,
                this.melodija,
                this.nuotraukuSkaicius
        );
    }
}
