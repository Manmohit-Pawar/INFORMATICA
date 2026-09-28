public class DistributoreBenzina {

    private double deposito;
    private double euroPerLitro;

    public DistributoreBenzina(double euroPerLitro) {
        this.euroPerLitro = euroPerLitro;
        this.deposito = 0;
    }

    public double getDeposito() {
        return this.deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getEuroPerLitro() {
        return this.euroPerLitro;
    }

    public void setEuroPerLitro(double euroPerLitro) {
        this.euroPerLitro = euroPerLitro;
    }

    public void rifornisci(double quantita) {
        this.deposito = this.deposito + quantita;
    }

    public void vendi(double euro, Car automobile) {
        double litri = euro / this.euroPerLitro;

        if (litri <= this.deposito) {
            this.deposito = this.deposito - litri;
            automobile.addGas(litri);
        }
    }

    public void aggiorna(double euroPerLitro) {
        this.euroPerLitro = euroPerLitro;
    }
}