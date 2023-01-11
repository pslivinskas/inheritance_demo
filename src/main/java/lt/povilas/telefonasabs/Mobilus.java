package lt.povilas.telefonasabs;

public class Mobilus extends Telefonas {

    private String simNr;
    private int nuotraukuSkaicius = 0;

    public Mobilus(String numeris, String simNr) {
        super(numeris);
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

    @Override
    public void paskambink(String telefonoNumeris) {
        System.out.println(
                String.format(
                        "Abonimentas %s skambina i %s",
                        super.getNumeris(),
                        telefonoNumeris
                )
        );
    }

    @Override
    public String toString() {
        return String.format(
                "Mobilus[numeris: %s, simNr: %s, melodija: %s, nuotraukos: %s]",
                super.getNumeris(),
                this.simNr,
                super.getMelodija(),
                this.nuotraukuSkaicius
        );
    }
}
