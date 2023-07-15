public class Cliente {
    String nome;

    int numeroDaconta;
    float saldo;

    Cliente(String nome, int numeroDaconta){
        this.nome=nome;
        this.numeroDaconta =numeroDaconta;
    }


    public void depositar(float valorDepositado) {
        this.saldo =valorDepositado;

    }
    public boolean sacar (float valorqueSeraSacado) {

     if (valorqueSeraSacado < this.saldo) {
         this.saldo -= valorqueSeraSacado;
         return true;
     }else{
         System.out.println("Saldo insuficiente para fazer essa transação");
         System.out.println("Seu saldo é de " + this.saldo);
         return false;
     }

         }
    public  void  transferir(float valorqueSeraTransferido,Cliente cliente) {
        if(sacar(valorqueSeraTransferido)) {

            cliente.depositar(valorqueSeraTransferido);
        }
    }

        public void consultarSaldo () {
      System.out.println("O cliente " + this.nome + "tem saldo de R$ "+this.saldo);
        }
    }

