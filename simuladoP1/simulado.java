public class Complexo {

    // a) Estruturas internas necessárias
    private double a;
    private double b;

    // b) Construtor com validacao em ponto flutuante
    public Complexo(double a, double b) throws Exception {
        if (a - a != 0.0) throw new Exception("Valor inválido");
        this.a = a;

        if (b - b != 0.0) throw new Exception("Valor inválido");
        this.b = b;
    }

    // c) Método mais: soma this com novo
    public Complexo mais(Complexo novo) throws Exception {
        if (novo == null) throw new Exception("Valor inválido");

        double novoA = this.a + novo.a;
        double novoB = this.b + novo.b;

        return new Complexo(novoA, novoB);
    }

    // d) Método menos: subtracao de this por novo
    public Complexo menos(Complexo novo) throws Exception {
        if (novo == null) throw new Exception("Valor inválido");

        double novoA = this.a - novo.a;
        double novoB = this.b - novo.b;

        return new Complexo(novoA, novoB);
    }

    // e) Método vezes: multiplicacao de this por novo
    public Complexo vezes(Complexo novo) throws Exception {
        if(novo == null) throw new Exception("Valor inválido");

        double novoA = (this.a * novo.a) - (this.b * novo.b);
        double novoB = (this.a * novo.b) + (novo.a * this.b);

        return new Complexo(novoA, novoB);
    }

    // f) Método divididoPor: divisao de this por novo
    public Complexo divididoPor(Complexo novo) throws Exception {
        if (novo == null) throw new Exception("Valor inválido");

        double denominador = (novo.a * novo.a) + (novo.b * novo.b);
        if (denominador == 0.0) throw new Exception ("Divisao por zero");

        double novoA = (this.a * novo.a + this.b * novo.b) / demoninador;
        double novoB = (novo.a * this.b - this.a * novo.b) / demoninador;

        return new Complexo(novoA, novoB);
    }

    // g) Métodos obrigatórios aplicáveis (apenas toString, equals e hashCode)
    @Override
    public String toString()
    {
        if (this.b == 0.0) return "" + this.a;
        if (this.a == 0.0) return this.b + "i";
        if (this.b < 0.0)  return this.a + " - " + (-this.b) + "i";
        return this.a + " + " + this.b + "i";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;

        Complexo complexo = (Complexo)obj;
        if (Double.compare(this.a, complexo.a) != 0) return false;
        if (Double.compare(this.b, complexo.b) != 0) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int retorno = 1; /* um nº natural qualquer, menos o zero */

        retorno = retorno * 2 /* um nº primo qualquer */ + ((Double)this.a).hashCode();
        retorno = retorno * 2 /* um nº primo qualquer */ + ((Double)this.b).hashCode();

        if (retorno < 0) retorno = -retorno;
        return retorno;
    }
}