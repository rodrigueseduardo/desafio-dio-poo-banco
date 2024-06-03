public class Main {
    public static void main(String[] args) {

        Cliente eduardo = new Cliente();
        eduardo.setNome("Eduardo");

        Conta cc = new ContaCorrente(eduardo);

        cc.depositar(100);

        Conta cp = new ContaPoupanca(eduardo);

        cc.transferir(30, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}