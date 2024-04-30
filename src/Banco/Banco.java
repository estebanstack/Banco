package Banco;


import java.util.ArrayList;

public class Banco {
    static ArrayList<Cuenta> listaCuentas=new ArrayList<>();
    public static void main(String[] args) {
        listaCuentas.add(new Corriente(123, 1200000,120000));
        listaCuentas.add(new Ahorro(124, 2000000,20000));
            int i=0;
        for(Cuenta cuenta: listaCuentas){
            System.out.println("***CUENTA#"+ (i++)+ "***");
            cuenta.depositar(12000);
            cuenta.retirar(120000);
            System.out.println(cuenta);

        }
    }
}
