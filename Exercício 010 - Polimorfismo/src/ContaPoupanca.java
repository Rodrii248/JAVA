public class ContaPoupanca extends Conta{

    @Override
    public void saldo() {
        System.out.println("Poupança: " + (this.total + 300));
    }
}
