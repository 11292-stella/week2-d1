package Esercizio3;

public class ContoOnline extends ContoCorrente{

    private int maxprelievo;

    public ContoOnline(double saldo, int contatorePrelievi, int maxprelievo) {
        super(saldo, contatorePrelievi);
        this.maxprelievo = maxprelievo;
    }

    public int getMaxprelievo() {
        return maxprelievo;
    }

    public void setMaxprelievo(int maxprelievo) {
        this.maxprelievo = maxprelievo;
    }

    @Override
    public void preleva(double importo) throws BancaException {

        if(importo > maxprelievo){
            throw new BancaException("Il prelievo non è disponibile: supera il limite massimo");

        }

        super.preleva(importo);
    }
}
