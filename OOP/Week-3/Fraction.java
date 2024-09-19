public class Fraction {
  private int numerator;
  private int denominator;

  /**
   * Constructs a new Solution with the default numerator and denominator.
   */
  public Fraction() {
    this.denominator = 1;
  }

  /**
   * Constructs a new Solution with the given numerator and denominator.
   */
  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    if (denominator == 0) {
      denominator = 1;
    }
    this.denominator = denominator;
  }

  /**
   * Sets the numerator of the Solution.
   * 
   * @param numerator 111
   */
  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  /**
   * Sets the denominator of the Solution.
   * 
   * @param denominator 111
   */
  public void setDenominator(int denominator) {
    if (denominator == 0) {
      denominator = 1;
    }
    this.denominator = denominator;
  }

  /**
   * Gets the numerator of the Solution.
   * 
   * @return
   */
  public int getNumerator() {
    return this.numerator;
  }

  /**
   * Gets the denominator of the Solution.
   * 
   * @return
   */
  public int getDenominator() {
    return this.denominator;
  }

  /**
   * Calculates the greatest common divisor (GCD) of two integers.
   *
   * @param a the first integer
   * @param b the second integer
   * @return the GCD of a and b
   */
  public int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  /**
   * Reduces the Solution to its simplest form.
   * 
   * @return
   */
  public Fraction reduce() {
    int gcd = gcd(this.numerator, this.denominator);
    this.numerator /= gcd;
    this.denominator /= gcd;
    return this;
  }

  /**
   * Adds two Solutions together.
   * 
   * @param a the Solution to add
   * @return the sum of this and a
   */
  public Fraction add(Fraction a) {
    this.numerator = this.numerator * a.denominator + this.denominator * a.numerator;
    this.denominator = this.denominator * a.denominator;
    return this.reduce();
  }

  /**
   * Subtracts a Solution from this Solution.
   * 
   * @param a the Solution to subtract
   * @return the difference of this and a
   */
  public Fraction subtract(Fraction a) {
    this.numerator = this.numerator * a.denominator - this.denominator * a.numerator;
    this.denominator = this.denominator * a.denominator;
    return this.reduce();
  }

  /**
   * Multiplies two Solutions together.
   * 
   * @param a the Solution to multiply
   * @return the product of this and a
   */
  public Fraction divide(Fraction a) {
    if (a.numerator == 0) {
      return this.reduce();
    }
    this.numerator = this.numerator * a.denominator;
    this.denominator = this.denominator * a.numerator;
    return this.reduce();
  }

  /**
   * Multiplies two Solutions together.
   * 
   * @param a the Solution to multiply
   * @return the product of this and a
   */
  public Fraction multiply(Fraction a) {
    this.numerator = this.numerator * a.numerator;
    this.denominator = this.denominator * a.denominator;
    return this.reduce();
  }

  /**
   * Returns a string representation of the Solution.
   * 
   * @return
   */
  public boolean equals(Object obj) {
    if (obj instanceof Fraction) {
      Fraction a = (Fraction) obj;
      a.reduce();
      return this.numerator == a.numerator && this.denominator == a.denominator;
    }
    return false;
  }

  /**
   * Returns a string representation of the Solution.
   * 
   * @return
   */
  public static void main(String[] args) {}
}
