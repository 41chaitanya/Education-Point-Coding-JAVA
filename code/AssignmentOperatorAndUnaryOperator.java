public class AssignmentOperatorAndUnaryOperator {
    public static void main(String[] args) {

        int a=5;
        int b=4;
            // compound arithematic operator 
            a+=b;
            a-=b;
            a*=b;
            a/=b;
            a%=b;


            // compound BITWISE OPERATOR operator 

        a&=b;
        a|=b;
        a^=b;
        a<<=b;
        a>>=b;
        a>>>=b;


        // unary operator 

        // a=a+1;
        // a+=1;

        // a=a+1;

        // a++;

        int x=5;

        int y=x++;
        System.out.println(x);
        System.out.println(y);


    }
}
