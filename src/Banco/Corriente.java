package Banco;

public class Corriente extends Cuenta{
    private int sobregiro;

    public Corriente(int codigo, int saldo, int sobregiro) {
        super(codigo, saldo);
        this.sobregiro = sobregiro;
    }

    @Override
    public void depositar(int cantidad) {
        System.out.println("Ingresando...");
        this.saldo+=cantidad;
        System.out.println("Su saldo actual es de " + this.saldo);
    }

    @Override
    public void retirar(int cantidad) {
        int excedente=this.saldo-cantidad;
        if(excedente<0){
            if(this.sobregiro>=excedente) {
                this.saldo=0;
                System.out.println("Saldo insuficiente, descontando del sobregiro");
                this.sobregiro -= excedente;
                System.out.println("Saldo del sobregiro "+ this.sobregiro);
            }else{
                System.out.println("No hay saldo disponible en el sobregiro");
            }
        }else{
            System.out.println("Retirando... ");
            this.saldo-=cantidad;
            System.out.println("Su saldo actual es de: "+ this.saldo);
        }
    }

    public int getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(int sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public String toString() {
        return "Corriente{" +
                "sobregiro=" + sobregiro +
                ", codigo=" + codigo +
                ", saldo=" + saldo +
                '}';
    }
}
