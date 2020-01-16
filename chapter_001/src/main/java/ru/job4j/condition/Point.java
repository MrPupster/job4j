package ru.job4j.condition;

public class Point {

  public static double distance(int x1, int y1, int x2, int y2) {
    return Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
  }

  public static void main(String[] args) {
    double result1 = distance(0, 0, 2, 0),
            result2 = distance(2, 1, 3, 0),
            result3 = distance(0, 3, 2, 1);

    System.out.println("Result (0, 0) to (2, 0) " + result1);
    System.out.println("Result (2, 1) to (3, 0) " + result2);
    System.out.println("Result (0, 3) to (2, 1) " + result3);
  }
}
