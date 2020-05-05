package point;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] Speed = new float[2];
        Speed[0] = xSpeed;
        Speed[1] = ySpeed;
        return Speed;
    }

    public String toString() {
        return super.toString() + " and Speed = (" + xSpeed + " , " + ySpeed + ")";
    }

    public MoveablePoint move() {
        super.setXY(super.getX() + xSpeed, super.getY() + ySpeed);
//        super.setX(super.getX()+xSpeed);
//        super.setY(super.getY()+ySpeed);
        return this;
    }
}
