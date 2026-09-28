public class Car{
    private double resa; double carburante;
    public Car(double resa){
        this.resa = resa;
        this.carburante = 0;
    }
    public void drive(double km){
        double carburanteUsato = km *this.resa;
        if
        (carburanteUsato <= this.carburante)
        {this.carburante = this.carburante - carburanteUsato;}
        else
        {this.carburante = 0;}
    }
    public double getGas(){
        System.out.println(carburante);
    }
    public void addGas(double litri){
        this.carburante = this.carburante + litri;
    }
}