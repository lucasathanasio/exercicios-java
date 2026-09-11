                         // Item extra (Comparable) 
public class Funcionario implements Comparable<Funcionario> {
    
    // Requisito 1
    private int id;
    private String nome;
    private double salario;
    private String cargo;

    // Requisito 2
    public Funcionario(int id, String nome, double salario, String cargo) throws Exception {
        
        // Requisitos 3 e 7
        if(id <= 0) throw new Exception("Id inválido");
        this.id = id;

        // Requisitos 4 e 7
        if(nome == null || nome.equals("")) throw new Exception("Nome inválido");
        this.nome = nome;

        // Requisitos 5 e 7
        if(salario <= 0) throw new Exception("Salário inválido");
        this.salario = salario;

        // Requisitos 6 e 7
        if(cargo == null || cargo.equals("")) throw new Exception("Cargo inválido");
        this.cargo = cargo;
    }

    // Requisito 8
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    // Requisitos 9 e 10
    public void setId(int id) throws Exception {
        if(id <= 0) throw new Exception("Id inválido");
        this.id = id;
    }

    public void setNome(String nome) throws Exception {
        if(nome == null || nome.equals("")) throw new Exception("Nome inválido");
        this.nome = nome;
    }

    public void setSalario(double salario) throws Exception {
        if(salario <= 0) throw new Exception("Salário inválido");
        this.salario = salario;
    }

    public void setCargo(String cargo) throws Exception {
        if(cargo == null || cargo.equals("")) throw new Exception("Cargo inválido");
        this.cargo = cargo;
    }

    // Item extra
    @Override
    public int compareTo(Funcionario outro) {
        return Double.compare(this.salario, outro.salario);
    }
}