public class Produto {
    
    private String nome;
    private double valor;              
    private int quantidadeEstoque;     

    
    public Produto(String nome, double valor, int quantidadeEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        }
    }



    
    public void escreverDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço unitário: R$ " + valor);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
    }

    
    public double calcularValorTotal() {
        return valor * quantidadeEstoque;
    }

    
    public void alterarQuantidade(int quantidade) {
        int novaQuantidade = quantidadeEstoque + quantidade;
        if (novaQuantidade >= 0) {
            quantidadeEstoque = novaQuantidade;
        } else {
            System.out.println("Erro: estoque não pode ficar negativo!");
        }
    }
}
