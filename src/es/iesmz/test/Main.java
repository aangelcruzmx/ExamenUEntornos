package es.iesmz.test;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello world!");

        Money money = new Money();

        double resultado = money.changue(TipoMoneda.EUR, TipoMoneda.USD, 23.88F);

        System.out.println(resultado);


    }
}