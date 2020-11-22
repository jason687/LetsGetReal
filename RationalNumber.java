public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber (int nume, int deno) {
    super((nume + 0.0) / deno);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else {
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue () {
    return ((numerator + 0.0) / denominator);
  }

  public int getNumerator () {
    return numerator;
  }

  public int getDenominator () {
    return denominator;
  }

  public RationalNumber reciprocal () {
    RationalNumber a = new RationalNumber (denominator, numerator);
    return a;
  }

  public boolean equals (RationalNumber other) {
    return (numerator == other.getNumerator() && denominator == other.getDenominator());
  }

  public String toString () {
    if (denominator < 0) {
      denominator = denominator * -1;
      numerator = numerator * -1;
    }
    return (numerator + "/" + denominator);
  }

  private static int gcd (int a, int b) {
    int y = Math.max(a, b);
    int z = Math.min(a, b);
    int factor = 0;
    int rem = -1;
    while (rem != 0) {
      factor = y / z;
      rem = y - factor * z;
      y = z;
      z = rem;
    }
    return y;
  }

  private void reduce () {
    int gcd = gcd(numerator, denominator);
    numerator = numerator / gcd;
    denominator = denominator / gcd;
  }

  public RationalNumber multiply (RationalNumber other) {
    RationalNumber product = new RationalNumber (numerator * other.getNumerator(), denominator * other.getDenominator());
    return product;
  }

  public RationalNumber divide (RationalNumber other) {
    other = other.reciprocal();
    RationalNumber quotient = new RationalNumber (numerator * other.getNumerator(), denominator * other.getDenominator());
    return quotient;
  }

  public RationalNumber add (RationalNumber other) {
    RationalNumber sum = new RationalNumber ((numerator * other.getDenominator() + other.getNumerator() * denominator), denominator * other.getDenominator());
    return sum;
  }

  public RationalNumber subtract (RationalNumber other) {
    RationalNumber difference = new RationalNumber ((numerator * other.getDenominator() - other.getNumerator() * denominator), denominator * other.getDenominator());
    return difference;
  }
}
