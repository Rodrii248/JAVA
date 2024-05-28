
public class Main {
    public static void main(String[] args) {

        Integer x = 12;
        Integer y = 11;
        Integer calc = 0;

        calc = calculo(x, y);
        System.out.println(calc);

        x = 11;
        calc = calculo(x, y);
        System.out.println(calc);

    }


   //Método private:  O private só vai ser acessado por quem está na mesma classe
    //Já que quer retornar um valor do "calc" então vai ser "Integer"
    // "calculo" é o nome do método,pode colocar qualquer coisa.

    private static Integer calculo(Integer x, Integer y){

        Integer calc = 0;

        if(x % 2 == 0) {
            calc = x + y;

        }
        else{
            calc = x * y;
        }

        return calc;

    }


}