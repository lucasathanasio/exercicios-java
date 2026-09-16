public class Complexo {
    private double a;
    private double b;

    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complexo mais(Complexo outro) throws Exception {
        return new Complexo(, )
    }

    public Complexo menos(Complexo outro) throws Exception {
        outro = 0;
        outro = this.a - this.b;
        return new Complexo(, )
    }
    
    public Complexo vezes(Complexo outro) throws Exception {
        outro = 0;
        outro = this.a * this.b;
        return new Complexo(, )
    }

    public Complexo divididoPor(Complexo outro) throws Exception {
        if (b > a) throw new Exception("o valor de b não pode ser maior que o valor de a");
        outro = 0;
        outro = this.a / this.b;
        return new Complexo(, )
    }

}