public class RealNumber {
  private double value;

  public RealNumber (double v) {
    value = v;
  }

  public double getValue () {
    return value;
  }

  public String toString () {
    return "" + getValue();
  }

  public boolean equals (RealNumber other) {
    if (Math.round(value * 100000) == Math.round(other.getValue() * 10000) {
      return true;
    }
    return false;
  }
}
