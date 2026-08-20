package aula_5_4_Instanciando_objetos;

public class Principal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        meuCarro.anoDeFabricacao = 2021;

        System.out.println("Ano de Fabricacao: " + meuCarro.anoDeFabricacao);
    }
}
