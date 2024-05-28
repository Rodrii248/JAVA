public class Conta {

    // Polimorfismo é um conceito permite que objetos de diferentes
    // classes respondam ao mesmo método de maneira diferente. Isso significa
    // que é possível ter várias classes com métodos de mesmo nome, mas com comportamentos distintos,
    // possibilitando a flexibilidade e reutilização de código.

        protected int total = 100;

        public void saldo() {
            System.out.println(this.total);
        }

        //Formas de polimorfismo Overload logo abaixo:
        // São vários métodos, cada um com uma assinatura diferente

       // public void saldo() {
       //     System.out.println(this.total);
       // }

       // public void saldo(Integer x){

       //     System.out.println(x);
       // }
       // public void saldo(Integer x, String y) {

       // System.out.println(x);

       // }
       // public void saldo(String x, Integer y) {

      //  System.out.println(x);
      // }
}