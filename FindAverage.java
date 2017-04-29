public class FindAverage {
  private double[] numbers;

  public FindAverage(double[] n) {
    this.numbers = n;
  }

  public double getAverage() {
    double average = 0;
    double calc = 0;
    for(double i : this.numbers) {
      calc += i;
    }
    average = calc / numbers.length;
    return average;
  }
}
