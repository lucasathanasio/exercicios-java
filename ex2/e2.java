                   // Item extra (Comparable) 
public class Aluno implements Comparable<Aluno> {

    // Requisito 1 
    private int matricula;
    private String nome;
    private int idade;
    private double nota;

    // Requisito 2 - Construtor 
    public Aluno(int matricula, String nome, int idade, double nota) throws Exception {

        // Requisitos 3 e 7 
        if (matricula <= 0) throw new Exception("Matrícula inválida");
        this.matricula = matricula;

        // Requisitos 4 e 7 
        if (nome == null || nome.equals("")) throw new Exception("Nome inválido");
        this.nome = nome;

        // Requisitos 5 e 7 
        if (idade < 16 || idade > 100) throw new Exception("Idade inválida");
        this.idade = idade;

        // Requisitos 6 e 7 
        if(nota < 0 || nota > 10) throw new Exception("Nota inválida");
        this.nota = nota;
    }

    // Requisito 8 
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }

    // Requisito 9 
    public void setMatricula(int matricula) throws Exception {
        if (matricula <= 0) throw new Exception("Matrícula inválida");
        this.matricula = matricula;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.equals("")) throw new Exception("Nome inválido");
        this.nome = nome;
    }

    public void setIdade(int idade) throws Exception {
        if (idade < 16 || idade > 100) throw new Exception("Idade inválida");
        this.idade = idade;
    }

    public void setNota(double nota) throws Exception {
        if(nota < 0 || nota > 10) throw new Exception("Nota inválida");
        this.nota = nota;
    }

    // Item extra - compareTo 
    @Override
    public int compareTo(Aluno outro) {

        return Double.compare(this.nota, outro.nota);

    }
}