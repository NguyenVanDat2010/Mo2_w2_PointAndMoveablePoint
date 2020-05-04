package point;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point);

        point=new Point(5,5);
        System.out.println(point);

        MoveablePoint moveablePoint =new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint=new MoveablePoint(4,4,2,2);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);

    }
}
