package BusinessEntity;
public class Binary{
    
    private Bit[] value;
    private int currentBit = 0 ;
    private int size = 0; 
    public Binary(int _size){
        size = _size;
        value = new Bit[size];;
    }

    public Binary(Bit[] bits, int _size){
        size = _size;
        value = new Bit[size];
        zeraBinary();
        int count = 0 ; 

        for(Bit b : bits){
            value[count] = b;
            count++;
        }
        currentBit = size - 1;
    }
    public Binary(String s, int _size){
        size = _size;
        value = new Bit[size];
        zeraBinary();
        int count = size -1 ; 
        String reverseString  = new StringBuilder(s).reverse().toString();

        for(char ch : reverseString.toCharArray()){
            Bit b = new Bit(ch);
            value[count] = b;
            count--;
        }
        currentBit = size - 1;
    }

    public Binary binaryInverso(){
        Bit[] r = new Bit[size];
        for(int i = 0 ; i < size; i++){
            r[i] = getBit(i).bitInverso();
        }

        return new Binary(r, size);
    }

    public void zeraBinary(){
        for(int i = 0; i < size; i++)
            value[i] = new Bit('0');
    }

    public Bit getBit(int i){
        return value[i];
    }

    public Bit[] getValue(){
        return value;
    }

    public void setCurrentBitToMax(){
        currentBit = size - 1;
    }

    public String toString(){
        StringBuilder r = new StringBuilder();
        for(Bit i : getValue()){
            if(i.getValue())
                r.append("1");
            else
                r.append("0");
        }
        return r.toString();
    }

    public void adcBit(Bit b){
        if(currentBit < 0) currentBit = size -1;
        
        value[currentBit] = b;
        currentBit--;
    }
    

}