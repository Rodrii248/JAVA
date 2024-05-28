public class Carro {
      private int rodas = 4;    //quantidade de rodas
      private int portas = 3;   //quantidade de portas

   //Já que as variáveis acima são "private" é preciso chamar elas e criar algum método publico que retorne o valor delas.
   //logo abaixo:

    public int getRodas() {

        return rodas;   //Vai retornar as rodas para a classe main
    }
    public int getPortas() {

        return portas;   //Vai retornar as portas para a classe main
    }

    //Construtor: Mesmo nome da clase e podemos passar qualquer inforamção que quisermos
    public Carro(int rodas, int portas){

          //como atribuir as informações dentro do parântese para os dois "privates" lá em cima
         //logo abaixo:

        this.rodas = rodas;      //O "This" é o escopo atual que está ou seja na classe "Carro" e
        this.portas = portas;    // serve pra diferenciar do outro rodas e portas.

    }
    public Carro(int rodas) {
        this.rodas = rodas;
        this.portas = 5;
    }
}
