public class RealNumber extends Number{
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
  // 
  // public boolean equals (RealNumber other) {
  //   if (value == 0 || other.getValue() == 0) {
  //     if (value == other.getValue()) {
  //       return true;
  //     } else {
  //       return false;
  //     }
  //   }
  //   if (Math.round(value * 100000) == Math.round(other.getValue() * 100000)) {
  //     return true;
  //   }
  //   return false;
  // }

  public RealNumber add (RealNumber other) {
    RealNumber sum = new RealNumber (value + other.getValue());
    return sum;
  }

  public RealNumber multiply (RealNumber other) {
    RealNumber product = new RealNumber (value * other.getValue());
    return product;
  }

  public RealNumber divide (RealNumber other) {
    RealNumber quotient = new RealNumber (value / other.getValue());
    return quotient;
  }

  public RealNumber subtract (RealNumber other) {
    RealNumber difference = new RealNumber (value - other.getValue());
    return difference;
  }
}
