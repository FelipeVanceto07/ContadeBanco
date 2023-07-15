public class Main {
    public static void main(String[] args) {

        System.out.println("------------------criando Clientes-------------------");

        Cliente cliente1 = new Cliente ("felipe",3);
        Cliente cliente2 = new Cliente("lucas",200);
        Cliente cliente3 = new Cliente("rafael",30);


System.out.println("----------------------------Consultando Saldo------------------------");
         cliente1.consultarSaldo();
         cliente2.consultarSaldo();
         cliente3.consultarSaldo();

        System.out.println("-----------------depositando valores------------------");

        cliente1.depositar(200);

        cliente2.depositar(500);


        System.out.println("-----------------consultando Saldo------------------");
        cliente1.consultarSaldo();
        cliente2.consultarSaldo();
        cliente3.consultarSaldo();




        System.out.println("-----------------transferindo valores------------------");


         cliente1.transferir(50,cliente3);


        System.out.println("-----------------consultando Saldo------------------");
        cliente1.consultarSaldo();
        cliente2.consultarSaldo();
        cliente3.consultarSaldo();

    }
}

