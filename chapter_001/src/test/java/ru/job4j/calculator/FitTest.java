package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

  @Test
  public void manWeight() {
    double in = 180,
           expected = 92,
           out = Fit.manWeight(in);

    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void womanWeight() {
    double in = 160,
           expected = 57.5,
           out = Fit.womanWeight(in);

    Assert.assertEquals(expected, out, 0.01);
  }
}
