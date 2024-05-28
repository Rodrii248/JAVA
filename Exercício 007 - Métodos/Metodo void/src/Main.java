
public class Main {
    public static void main(String[] args) {

        Integer x = 12;
        Integer y = 11;


        calculo(x, y);
        x = 11;
        calculo(x, y);


    }


    //Método void: Ao invés de devolver os valores você pode escolher não devolver nada

                                 //pode colocar inteiro ou double
    private static Void calculo(Integer x, Integer y) {

        Integer calc = 0;

        if (x % 2 == 0) {
            calc = x + y;
        }
        else {
            calc = x * y;
        }

        System.out.println(calc);
                                    // Quando um método tem na sua assinatura Void como tipo de retorno,
                                     //não podendo Void ser instanciado, o método tem de retornar null
                                      //(o que de alguma forma indica ausência de retorno/valor).
        return null;
    }

}