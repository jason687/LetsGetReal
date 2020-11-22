public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber (int nume, int deno) {
    super((nume + 0.0) / deno);
    numerator = nume;
    denominator = deno;
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
    return (numerator + "/" + denominator);
  }
}
