package lt.povilas.telefonas;

import java.math.BigDecimal;

public class Taksofonas extends Telefonas {

    private BigDecimal piniguLikutis;
    private final BigDecimal SKAMBUCIO_KAINA = BigDecimal.valueOf(0.25);

    public Taksofonas(Double pinigelis) {
        super("[Taksofonas]");
        this.piniguLikutis = BigDecimal.valueOf(pinigelis);
//        this.piniguLikutis = new BigDecimal(pinigelis);

    }

    @Override
    public void paskambink(String telefonoNumeris) {
        if (piniguLikutis.compareTo(SKAMBUCIO_KAINA) > -1) {
            super.paskambink(telefonoNumeris);
            this.piniguLikutis = this.piniguLikutis.subtract(SKAMBUCIO_KAINA);
        } else {
            System.out.println("Skambuciui nepakanka pinigu");
            System.out.println("Pinigu likutis yra " + this.piniguLikutis);
        }
    }

    public BigDecimal getPiniguLikutis() {
        return piniguLikutis;
    }

    public void setPiniguLikutis(Double piniguLikutis) {
        this.piniguLikutis = BigDecimal.valueOf(piniguLikutis).add(this.piniguLikutis);
    }

    @Override
    public String toString() {
        return String.format(
                "Taksofonas[numeris: %s, pinigu likutis: %s]",
                super.getNumeris(),
                this.piniguLikutis
        );
    }
}