package TestPoint;

import homeWork2.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPoint {
  @Test
  public void testP() {
    Point p = new Point(1,3);
    Point p2 = new Point(22,11);
    Assert.assertEquals(p.distance(p2), 		22.47220505424423);


  }
  @Test
  public void testP2() {
    Point p = new Point(1,3);
    Point p2 = new Point(22,11);
    Assert.assertNotEquals(p.distance(p2), 25);

  }
  @Test
  public void testP3() {
    Point p = new Point(10,333);
    Point p2 = new Point(22,11);
    Assert.assertEquals(p.distance(p2), 322.2235249015813);

  }
  @Test
  public void testP4() {
    Point p = new Point(10,333);
    Point p2 = new Point(22,111);
    Assert.assertNotEquals(p.distance(p2), 322.2235249015813);

  }
}
