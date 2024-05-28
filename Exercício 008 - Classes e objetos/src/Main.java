
public class Main {
    public static void main(String[] args) {

        //Objeto: É tudo que possui características ou atributos
        // em um estado. Exemplo: Um carro possui janelas, rodas, volante.

           //Criou uma nova instância desse carro e transforma
        // em objeto aqui
           Carro carro = new Carro(4,5);
           Carro carro2 = new Carro(3);
           System.out.println(carro.getPortas());
           System.out.println(carro.getRodas());      //Essa é a conexão que vai printar os valores que colocamos na classe carro.

        System.out.println(carro2.getPortas());
        System.out.println(carro2.getRodas());
              //Como podemos passar uma informação pra nossa classe para criarmos do jeito
              //que quisermos, pra isso usamos o método "Construtor"

      //Como chamar a classe calculo

        Calculo c = new Calculo(); //-> esse é o construtor dafoe
        System.out.println(c.soma(5,4));

        //Como na classe "Calculo" é static não precisa estanciar ela é só fazer assim:

        System.out.println(Calculo.soma(5,4));
    }
}