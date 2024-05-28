
//Exercício 04 Condição Switch Case

public class Main {
    public static void main(String[] args) {

// Parecido com o IF ELSE É para tomar decisões com base no valor de uma variável específica.
// Ele é geralmente utilizado quando se tem múltiplas condições para serem avaliadas e cada condição
// leva a um resultado diferente.

    String valor = "sdgdfsa";

    switch (valor){

        case "homem":     //"case" é pra tomar uma decisão, pode colocar vários cases juntos
        case "mulher":
        case "criança":
        case "bebê":
        System.out.println("é um ser humano");

        break;             //"break" é pra finalisar esse espaço

        case "Mamífero":
        case "pato":
        case "cachorro":
        case "gato":
       System.out.println("é um animal");

       break;

        default:            //"default" é pra quando não for nenhum dos dois"
        System.out.println("valor incorreto");

        break;
    }
    //------------------------------------------------------------x--------------------------------------------

                  //Também é possível fazer com número, basta colocar o "Integer" antes de "valor"
                  //Lembre-se de tirar as aspas do número

        Integer quantovale = 4554;

        switch (quantovale) {

            case 0:
                System.out.println("é o número 0");

                break;             //"break" é pra finalisar esse espaço

            case 1:

                System.out.println("é o número 1");

                break;

            default:            //"default" é pra quando não for nenhum dos dois"
                System.out.println("Sem valor nenhum");

                break;
        }


    }
}
