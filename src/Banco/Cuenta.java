package Banco;

public abstract class Cuenta {
    protected int codigo;
    protected int saldo;

    public Cuenta(int codigo, int saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }
    abstract void depositar(int cantidad);
    abstract void retirar(int cantidad);

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo=" + codigo +
                ", saldo=" + saldo +
                '}';
    }
}
