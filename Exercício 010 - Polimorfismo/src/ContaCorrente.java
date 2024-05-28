public class ContaCorrente extends Conta  {

      // o termo "override" é um Polimorfismo que se refere à prática de substituir ou redefinir um método
      // de uma superclasse (classe pai) em uma subclasse (classe filha). Isso significa que
      // a subclasse fornece uma implementação específica para o método que está sendo substituído,
      // em vez de usar a implementação herdada da superclasse.



    @Override
    public void saldo() {
       System.out.println("Corrente: " + (this.total + 100));
    }
}
