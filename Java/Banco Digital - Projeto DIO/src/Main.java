public class Main {
    public static void main(String[] args) {
        Cliente filipe = new Cliente();
        filipe.setNome("Filipe Azevedo");


        Conta cc = new ContaCorrente(filipe);
        cc.depositar(300);
        Conta cp = new ContaPoupanca(filipe);

        cc.tranferir(100, cp);


        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }

}
