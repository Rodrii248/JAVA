

public class Main {
    public static void main(String[] args) {

        //A herança permite que uma classe (subclasse) herde características e
        // comportamentos de outra classe (superclasse) e Isso significa que a
        // subclasse pode acessar os métodos e atributos da superclasse e também
        // pode adicionar novos métodos e atributos específicos.

        //Para estabelecer uma relação de herança entre classes em Java,
        // utiliza-se a palavra-chave "extends"

        ContaPoupanca ContaPoupanca = new ContaPoupanca(100);
        ContaCorrente ContaCorrente = new ContaCorrente(300);

        ContaPoupanca.view();
        ContaCorrente.view();

    }
}