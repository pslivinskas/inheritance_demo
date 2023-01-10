package lt.povilas.telefonas;

public class Telefonas {
    private String numeris;
    private String melodija;

    public Telefonas(String numeris) {
        this.numeris = numeris;
    }

    public void paskambink(String telefonoNumeris) {
        System.out.println(
                String.format(
                        "Abonimentas %s skambina i %s",
                        this.numeris,
                        telefonoNumeris
                )
        );
    }

    public String getNumeris() {
        return numeris;
    }

    public String getMelodija() {
        return melodija;
    }

    public void setMelodija(String melodija) {
        this.melodija = melodija;
    }

    @Override
    public String toString() {
        return String.format(
                "Telefonas[numeris: %s, melodija: %s]",
                this.numeris,
                this.melodija
        );
    }
}
