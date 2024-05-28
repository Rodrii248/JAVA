
public class Main {
    public static void main(String[] args) {


        // SITUAÇÃO EM QUE O "x" É PAR

           Integer x = 12;
           Integer y = 11;
           Integer calc = 0;


        //Se o "x" for par ele vai somar os dois, se o "x" for Ímpar ele vai multiplicar os dois.

        //Para ver se é par
             if (x % 2 == 0) {

                 calc = x + y;
              System.out.println("É par");
          }
             else {

                calc = x * y;
        System.out.println("É ímpar");
            }

             System.out.println(calc);


        //SITUAÇÃO EM QUE O "x" é ÍMPAR

        x = 11;

        if (x % 2 == 0) {
            calc = x + y;
              }
              else {
            calc = x * y;
              }

              System.out.println(calc);
              System.out.println("É Ímpar");


    }
}