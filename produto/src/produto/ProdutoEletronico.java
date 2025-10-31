package produto;
public class ProdutoEletronico extends Produto{
    private int garantiaMeses;
    public ProdutoEletronico(String nome, double preco, int garantiaMeses){
        super(nome,preco);
        this.garantiaMeses = garantiaMeses;
    }
    public int getGarantiaMeses(){
        return garantiaMeses;
    }
    public void setGarantiaMeses(int garantiaMeses){
        this.garantiaMeses=garantiaMeses;
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome());
        System.out.printf("Preço: R$ %.2f\n", getPreco());
        System.out.println("Garantia: " + getGarantiaMeses() + " meses\n");

    }

}
