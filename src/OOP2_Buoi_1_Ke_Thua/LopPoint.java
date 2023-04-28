package OOP2_Buoi_1_Ke_Thua;

public class LopPoint {
    private float x;
    private float y;

    public LopPoint(){
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public LopPoint(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] array = new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }

    @Override
    public String toString() {
        return "vị trí của x:"
                + getX()
                + ", vị trí của y:"
                + getY();
    }
}
class PointTest{
    public static void main(String[] args) {
        LopPoint point = new LopPoint();
        System.out.println(point);
        point = new LopPoint(15.0f,15.0f);
        System.out.println(point);
    }
}
class MoveablePoint extends LopPoint{
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(){
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
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
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] array = new float[2];
        array[0] = this.xSpeed;
        array[1] = this.ySpeed;
        return array;
    }

    @Override
    public String toString() {
        return "vị trí của x: "
                + getX()
                + ", vị trí của y: "
                + getY()
                + ", tộc độ của x: "
                + getxSpeed()
                + ", tốc độ của y: "
                + getySpeed()
                + super.toString();
    }
    public MoveablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint diemdichuyen = new MoveablePoint();
        System.out.println(diemdichuyen);
        diemdichuyen = new MoveablePoint(5.0f, 5.0f, 1.0f, 1.0f);
        System.out.println(diemdichuyen);
    }
}
