package protudo.Produto;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoEletronico [] produto = new ProdutoEletronico[3];
        System.out.println("=== CADASTRO DE PRODUTOS ELETRÔNICOS ===\n");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            double preco;
            do {
                System.out.print("Preço: ");
                preco = sc.nextDouble();
                if (preco <= 0) {
                    System.out.println("Valor inválido! O preço deve ser positivo.");
                }
            } while (preco <= 0);

            int garantia;
            do {
                System.out.print("Garantia (em meses): ");
                garantia = sc.nextInt();
                if (garantia <= 0) {
                    System.out.println("Valor inválido! A garantia deve ser positiva.");
                }
            } while (garantia <= 0);

            sc.nextLine(); 

            produtos[i] = new ProdutoEletronico(nome, preco, garantia);
            System.out.println();
        }

        System.out.println("=== PRODUTOS CADASTRADOS ===\n");

        for (ProdutoEletronico p : produtos) {
            p.exibirDetalhes();
        }

        sc.close();
    }
}
