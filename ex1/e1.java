public class Produto {
    
    // Requisito 1 
    private int codigo, quantidade;
    private String nome;
    private double preco;

    // Requisito 2 - construtor 
    public Produto(int codigo, String nome, double preco, int quantidade) throws Exception {

        // requisitos 3 e 7 
        if (codigo <= 0) throw new Exception("Código inválido");
        this.codigo = codigo;

        // requisitos 4 e 7 
        if (nome == null || nome.isEmpty()) throw new Exception("Nome inválido");
        this.nome = nome;

        // requisitos 5 e 7 
        if (preco < 0) throw new Exception("Preço inválido");
        this.preco = preco;

        // requisitos 6 e 7 
        if (quantidade < 0) throw new Exception("Quantidade inválida");
        this.quantidade = quantidade;

    }

    // Requisito 8 - getter para todos os atributos 
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    /* Requisitos 9 e 10 - setter para todos os atributos e fazendo
    as mesmas validações do construtor */
    public void setCodigo(int codigo) {
        if (codigo <= 0) throw new Exception ("Codigo inválido");
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        if (nome == null || nome.equals("")) throw new Exception ("Nome inválido");
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) throw new Exception ("Preço inválido");
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) throw new Exception ("Quantidade inválida");
        this.quantidade = quantidade;
    }
}