import Interfaces.*;
import BusinessEntity.*;

public class CalculadoraInteiro implements ICalculadora{

    private int sizeOfNumber = 8;

    public CalculadoraInteiro(int _size){
       sizeOfNumber = _size;
    }

    public Binary Subtracao(Binary b1, Binary b2){
        return Soma(b1, toComplemento2(b2));
    }

    public Binary Soma(Binary b1, Binary b2){
        Binary resposta = new Binary(sizeOfNumber);
        resposta.setCurrentBitToMax();
        Bit resto = new Bit('0');

        for(int i = sizeOfNumber - 1; i >= 0 ; i--){
            RespostaSomaBit r1 = _soma(b1.getBit(i), b2.getBit(i));
            RespostaSomaBit r2 = _soma(r1.getResultado(), resto);
                        
            resto = r2.getResto();
            if(r1.getResto().getValue())
                resto = r1.getResto();
            resposta.adcBit(r2.getResultado());
            
        }
        return resposta;
    }

    private RespostaSomaBit _soma(Bit b1, Bit b2){
        RespostaSomaBit r = new RespostaSomaBit();

        if(b1.getValue() && b2.getValue()){
            r.setResultado(new Bit('0'));  
            r.setResto(new Bit('1'));
        } else if(!b1.getValue() && !b2.getValue()){
            r.setResultado(new Bit('0'));  
            r.setResto(new Bit('0'));
        } else {
            r.setResultado(new Bit('1'));  
            r.setResto(new Bit('0'));
        }
        return r;
    }

    public Binary toComplemento2(Binary b){
        
        Binary aux = CreateBinary("1");
        Binary inv = b.binaryInverso();
        return Soma(aux, inv);

    }

    public Binary CreateBinary(String s){
        return new Binary(s,sizeOfNumber);
    }
}