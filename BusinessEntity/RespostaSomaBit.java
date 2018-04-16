package BusinessEntity;

public class RespostaSomaBit{
    private Bit resultado = new Bit('0');
    private Bit resto = new Bit('0');

    public Bit getResultado(){
        return resultado;
    }

    public void setResultado(Bit r){
        resultado = r;
    }

    public Bit getResto(){
        return resto;
    }

    public void setResto(Bit r){
        resto = r;
    }
}