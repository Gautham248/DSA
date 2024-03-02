package Functions;

public class Decimal_to_binary {
    public static void main(String[] args) {
        DecimaToBinary(5);
    }
    public static void DecimaToBinary(int decNum)
    {
        int binNum=0;
        int pow=0;
        while(decNum>0)
        {
            int lastDigit=decNum % 2;
            binNum=binNum +(lastDigit* (int)Math.pow(10,pow++));
            decNum/=2;
        }
        System.out.println(binNum);
    }
    
}
