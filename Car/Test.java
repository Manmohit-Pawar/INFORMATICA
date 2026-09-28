import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci la resa della prima automobile:");
        double resa1 = input.nextDouble();
        Car car1 = new Car(resa1);

        System.out.println("Inserisci la resa della seconda automobile:");
        double resa2 = input.nextDouble();
        Car car2 = new Car(resa2);

        System.out.println("Inserisci il prezzo della benzina per litro:");
        double prezzo = input.nextDouble();
        DistributoreBenzina distributore =
                new DistributoreBenzina(prezzo);

        System.out.println("Quanti litri vuoi mettere nel distributore?");
        double quantita = input.nextDouble();
        distributore.rifornisci(quantita);

        System.out.println("Quanti euro vuoi spendere per la prima automobile?");
        double euro1 = input.nextDouble();
        distributore.vendi(euro1, car1);

        System.out.println("Quanti euro vuoi spendere per la seconda automobile?");
        double euro2 = input.nextDouble();
        distributore.vendi(euro2, car2);

        System.out.println("Carburante car1: " + car1.getGas());
        System.out.println("Carburante car2: " + car2.getGas());

        System.out.println("Quanti km deve percorrere la prima automobile?");
        double km1 = input.nextDouble();
        car1.drive(km1);

        System.out.println("Quanti km deve percorrere la seconda automobile?");
        double km2 = input.nextDouble();
        car2.drive(km2);

        System.out.println("Carburante car1 dopo il viaggio: "
                + car1.getGas());

        System.out.println("Carburante car2 dopo il viaggio: "
                + car2.getGas());

        System.out.println("Inserisci il nuovo prezzo della benzina:");
        double nuovoPrezzo = input.nextDouble();
        distributore.aggiorna(nuovoPrezzo);

        System.out.println("Prezzo aggiornato: "
                + distributore.getEuroPerLitro());

        System.out.println("Quanti litri vuoi aggiungere al distributore?");
        double nuovoRifornimento = input.nextDouble();
        distributore.rifornisci(nuovoRifornimento);

        System.out.println("Deposito del distributore: "
                + distributore.getDeposito());

        input.close();
    }
}