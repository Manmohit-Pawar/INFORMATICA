public class DistributoreBenzina{
    private double deposito; double euroPerLitro;
    public DistributoreBenzina(double euroPerLitro){
        this.euroPerLitro = euroPerLitro;
        this.deposito = 0;
    }
    public void rifornisci(double quantita){
        this.deposito = this.deposito + quantita;
    }
    public void vendi(double euro, Car automobile){
        double litri = euro/this.euroPerLitro;
        if
        (litri<=this.deposito)
        {this.deposito = this.deposito - litri;
        automobile.getGas(litri);}
    }
    public void aggiorna(double euroPerLitro){
        this.euroPerLitro = euroPerLitro;
    }
}