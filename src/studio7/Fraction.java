package studio7;

public class Fraction {

    private int numer;
    private int denom;

    public Fraction(int initNumer, int initDenom){
        numer = initNumer;
        denom = initDenom;
    }

    public String add(int numer2, int denom2){
        int sumNumer = (numer * denom2) + (numer2 * denom);
        int sumDenom = (denom * denom2);

        return sumNumer + "/" + sumDenom;
    }

    public String multiply(int numer2, int denom2){
        return numer*numer2 + "/" + denom*denom2;
    }

    public String recip(){
        return denom + "/" + numer;
    }

    public String simplify(){
        int[] array = new int[numer];

        for (int i = 1; i <= numer; i++){
            if(denom % i == 0){
                array[i-1] = i;
            } else {
                array[i-1] = 0;
            }
        }

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j - 1] > array[j]){
                    int val = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = val;
                }
            }
        }

        return numer/array[array.length - 1] + "/" + denom/array[array.length - 1];
    }
    public static void main(String[] args){
        Fraction fraction1 = new Fraction(4, 8);
        Fraction fraction2 = new Fraction(3, 7);

        System.out.println(fraction1.add(1, 2));
        System.out.println(fraction1.multiply(1, 2));
        System.out.println(fraction1.recip());
        System.out.println(fraction1.simplify());
        System.out.println(fraction2.simplify());
    }
}
