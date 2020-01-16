package ru.job4j.condition;

public class SqArea {

  public static double square(int p, int k) {
//    Фомула периметра треугольника: P = 2 * (L + h)
//    Фомула площади треугольника: S = L * h
//    L = h * k => P = 2 * (h * k + h) => P = 2h * (k + 1) => h = (P / (k + 1)) / 2
    int h = p / (k + 1) / 2,
        s = h * h * k;

    return s;
  }

  public static void main(String[] args) {
    double result1 = square(4, 1),
           result2 = square(6, 2);

    System.out.println("p = 4, k = 1, s = 1, real = " + result1);
    System.out.println("p = 6, k = 2, s = 2, real = " + result2);
  }
}
