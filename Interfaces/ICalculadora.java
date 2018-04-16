package Interfaces;
import BusinessEntity.*;
public interface ICalculadora{
    Binary CreateBinary(String s);
    Binary Soma(Binary b1, Binary B2);
    Binary Subtracao(Binary b1, Binary B2);
}