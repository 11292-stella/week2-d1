package Esercizio3;

public class ContoCorrente {

    private double saldo;
    private int contatorePrelievi;

    public ContoCorrente(double saldo, int contatorePrelievi) {
        this.saldo = saldo;
        this.contatorePrelievi = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getContatorePrelievi() {
        return contatorePrelievi;
    }

    public void setContatorePrelievi(int contatorePrelievi) {
        this.contatorePrelievi = contatorePrelievi;
    }

    public void preleva(double importo) throws BancaException{
        if(saldo - importo < 0){
            contatorePrelievi ++;
            throw new BancaException("il conto è in rosso");

        }
        saldo -= importo;
        contatorePrelievi ++;
    }


}
