package BusinessEntity;

public class Bit{

    private boolean value = false;;
    
    public Bit(char c){
        if(c == '1')
            setValueOn();
        else 
            setValueOff();
    }

    public boolean getValue(){
        return value;
    }

    public void setValueOn(){
        value = true;
    }

    public void setValueOff(){
        value = false;
    }

    public Bit bitInverso(){
        return new Bit(value ? '0' : '1');
    }

}