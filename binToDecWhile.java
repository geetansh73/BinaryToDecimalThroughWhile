class BinaryToDecimalThroughWhile
{
    static int binToDec(int n)
    {
    int num=n;
    int decimal=0;
    int base=1;
    int temp=num;
    while(temp>0)
    {
    int lastDigit=temp%10;
    temp=temp/10;
    decimal=decimal+lastDigit*base;
    base=base*2;
    }
    return decimal;
    }
public static void main(String args[])
{
int num=110;
int dec_value=binToDec(num);
System.out.println(dec_value);
}
}
