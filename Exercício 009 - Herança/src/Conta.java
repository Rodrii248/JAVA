public class Conta {


    private Integer valor;


    //construtor
    public Conta(Integer valor){
         this.valor = valor;

    }

    public void view () {

        System.out.println(this.valor);
    }
}
