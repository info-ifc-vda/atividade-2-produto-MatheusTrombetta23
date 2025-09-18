public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);

        p1.escreverDados();
        System.out.println("--------------------");

        p1.alterarQuantidade(-3); 
        p1.escreverDados();
        System.out.println("--------------------");

        p1.alterarQuantidade(5); 
        p1.escreverDados();
    }
}
