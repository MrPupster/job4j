package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

  @Test
  public void distance() {
    double expected1 = 2,
           out1 = Point.distance(0, 0, 2, 0),
           expected2 = 1.41,
           out2 = Point.distance(2, 1, 3, 0),
           expected3 = 2.83,
           out3 = Point.distance(0, 3, 2, 1);

    Assert.assertEquals(expected1, out1, 0.01);
    Assert.assertEquals(expected2, out2, 0.01);
    Assert.assertEquals(expected3, out3, 0.01);
  }
}
