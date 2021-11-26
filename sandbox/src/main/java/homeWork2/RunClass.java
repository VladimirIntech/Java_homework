package homeWork2;

public class RunClass {
  public static void main(String[] args) {
    Point p = new Point(2, 2, 10, 8);
    System.out.println("Расстояние между точками (" + p.x1 + "," + p.y1 + ") и (" + p.x2 + "," + p.y2 + ") = " + p.distance());
  }
}


