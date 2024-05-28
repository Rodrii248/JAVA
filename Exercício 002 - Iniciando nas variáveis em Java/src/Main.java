public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        String numero = "50";
        String numerooutro = "10";

        Integer x = Integer.parseInt(numero);
        Integer y = Integer.parseInt(numerooutro);

        Integer soma = x + y;

        System.out.println(soma);
        //---------------------------------------------x------------------------------------
        Double price = 5.3;
        Double pricevalor = 4.4;

        Double sum1 = price + pricevalor;
        System.out.println(sum1);

        //----------------------------------------------x------------------------------------
        Float valor = 3.3F;
        Float seilaprovalor = 2.4F;
        seilaprovalor = 2.1F;

        Float sum2 = valor + seilaprovalor;
        System.out.println(sum2);
        
        char caracter = 'b';
        System.out.println(caracter);
    }
}