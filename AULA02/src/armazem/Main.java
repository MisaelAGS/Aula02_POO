package armazem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* // como chamar um objeto:
        Estoque e1 = new Estoque(1, "Arroz", 10, 25); // Cria um objeto e1 do tipo Estoque
        Estoque e2 = new Estoque(2, "Feijão", 10, 5.65
        );
        Estoque e3 = new Estoque(3, "Açúcar", 10, 16);
        // Como utilizar os métodos:
        e1.Acrescimo(100);
        System.out.println(e1.ConsultaEstoque());
        e2.Baixa(7);
        System.out.println(e2.ConsultaEstoque());
        System.out.println(e3.ConsultaEstoque());
        System.out.println(e3.TotalEstoque());*/
        Scanner ler = new Scanner(System.in);
        int id, estoque;
        String produto;
        double preco;
        System.out.println("Digite o id: ");
        id = ler.nextInt();
        System.out.println("Digite o nome do produto: ");
        produto = ler.next();
        System.out.println("Digite a quantidade do produto no estoque: ");
        estoque = ler.nextInt();
        System.out.println("Digite o valor do produto: R$");
        preco = ler.nextDouble();
        Estoque e1 = new Estoque(id, produto, estoque, preco);

        System.out.println("Digite a qtde para acrescentar:");
        int qtde;
        qtde = ler.nextInt();
        e1.Acrescimo(qtde);

        System.out.println("Digite a qtde para baixar:");
        qtde = ler.nextInt();
        e1.Baixa(qtde);

        System.out.println(e1.ConsultaEstoque());
    }
}