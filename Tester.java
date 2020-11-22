public class Tester {
  public static void main (String [] args) {
    RealNumber a = new RealNumber(1.0);
    RealNumber b = new RealNumber(1.0000000000000000000000000000000001);
    System.out.println(a.equals(b));
    System.out.println();

    a = new RealNumber(0);
    b = new RealNumber(0.0000000000000000000000000000000001);
    System.out.println(a.equals(b));
    System.out.println();

    a = new RealNumber(5);
    b = new RealNumber(15);
    System.out.println(a.add(b));
    System.out.println();

    System.out.println(a.multiply(b));
    System.out.println();

    System.out.println(a.divide(b));
    System.out.println();

    System.out.println(a.subtract(b));
    System.out.println();

    RationalNumber fraction = new RationalNumber(3, 4);
    System.out.println(fraction.getValue());
    System.out.println(fraction.getNumerator());
    System.out.println(fraction.getDenominator());
    System.out.println(fraction.reciprocal());
    System.out.println();

    RationalNumber fractionA = new RationalNumber(3, 4);
    RationalNumber fractionB = new RationalNumber(6, 8);
    System.out.println(fraction.equals(fractionA));
    System.out.println(fraction.equals(fractionB));
    System.out.println();

    System.out.println(fraction.toString());
    System.out.println();

    RationalNumber fractionC = new RationalNumber(4, 8);
    System.out.println(fraction.multiply(fractionC));
  }
}
