public class Car {

    private double resa;
    private double carburante;

    public Car(double resa) {
        this.resa = resa;
        this.carburante = 0;
    }

    public double getResa() {
        return this.resa;
    }

    public void setResa(double resa) {
        this.resa = resa;
    }

    public double getCarburante() {
        return this.carburante;
    }

    public void setCarburante(double carburante) {
        this.carburante = carburante;
    }

    public void drive(double km) {
        double carburanteUsato = km * this.resa;

        if (carburanteUsato <= this.carburante) {
            this.carburante = this.carburante - carburanteUsato;
        } else {
            this.carburante = 0;
        }
    }

    public double getGas() {
        return this.carburante;
    }

    public void addGas(double litri) {
        this.carburante = this.carburante + litri;
    }
}