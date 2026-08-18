package aula_5_4_Instanciando_objetos;

public class Principal_1 {
    public static void main(String[] args) {

        Carro_1 meuCarro = new Carro_1();

        meuCarro.anoDeFabricacao = 2021;

        System.out.println("Ano de Fabricacao: " + meuCarro.anoDeFabricacao);
    }
}
