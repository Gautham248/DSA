package Functions;

public class Binary_to_decimal {
    public static void main(String[] args) {
        BinaryToDecimal(101);
    }

    public static void BinaryToDecimal(int binNum)
    {
        int pow=0;
        int decNum=0;
        while(binNum>0)
        {
            int lastDigit = binNum%10;
            decNum= decNum +(lastDigit * (int)Math.pow(2, pow++)); 
            binNum/=10;
        }
        System.out.println(decNum);

    }
}
