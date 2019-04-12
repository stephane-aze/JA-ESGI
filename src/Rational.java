public class Rational {
    public static void main(String[] args) {
        String [] nombre1 = args[0].split("/");
        String [] nombre2 = args[2].split("/");
        int n1=Integer.parseInt(nombre1[0]);
        int d1=Integer.parseInt(nombre1[1]);
        int n2=Integer.parseInt(nombre2[0]);
        int d2=Integer.parseInt(nombre2[1]);
        Rational sum =add(new Rational(n1,d1), new Rational(n2,d2));
        System.out.println(sum.toString());

    }
    int numerator;
    int denominator;
    private static Rational add(Rational r1, Rational r2){
        int n1=r1.numerator;
        int n2=r2.numerator;
        int d1=r1.denominator;
        int d2=r2.denominator;
        int sum_n=(n1*d2)+(n2*d1);
        int sum_d=(d1*d2);
        Rational sum=new Rational(sum_n,sum_d);
        return sum;

    }
    @Override
    public String toString(){

        return Integer.toString(numerator)+"/"+Integer.toString(denominator);

    }

    public Rational(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
}
