package Banco;

public class Ahorro extends Cuenta{
    private double interes;

    public Ahorro(int codigo, int saldo, double interes) {
        super(codigo, saldo);
        this.interes = interes;
    }

    @Override
    public void depositar(int cantidad) {
        this.saldo= (int) ((this.saldo+=cantidad)+(this.saldo*0.03));
        this.interes+=this.interes;
        System.out.println("Su nuevo saldo es: "+ this.saldo+ " Y tiene intereses de "+ this.interes);
    }

    @Override
    public void retirar(int cantidad) {
        System.out.println("Retirando...");
        this.saldo-=cantidad;
        System.out.println("Su saldo actual es de "+ this.saldo);
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Ahorro{" +
                "interes=" + interes +
                ", codigo=" + codigo +
                ", saldo=" + saldo +
                '}';
    }
}
