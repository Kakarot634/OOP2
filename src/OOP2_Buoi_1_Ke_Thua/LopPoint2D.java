package OOP2_Buoi_1_Ke_Thua;

public class LopPoint2D {
    private float x;
    private float y;

    public LopPoint2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public LopPoint2D(float x, float y){
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
        array[0] = getX();
        array[1] = getY();
        return array;
    }

    @Override
    public String toString() {
        return " vị trí của x: "
                + getX()
                + ", vị trí của y: "
                + getY()
                + ", vị trí của XY: "
                + getXY();
    }
}
class Point2DTest {
    public static void main(String[] args) {
        LopPoint2D point2D = new LopPoint2D();
        System.out.println(point2D);
        point2D = new LopPoint2D(5.0f,5.0f);
        System.out.println(point2D);
    }
}
class LopPoint3D extends LopPoint2D{
    private float z;
    public LopPoint3D(){
        this.z = z;
    }
    public LopPoint3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = getZ();
        return array;
    }

    @Override
    public String toString() {
        return " vị trí của x:"
                + getX()
                + ", vị trí của y: "
                + getY()
                + ", vị trí của z: "
                + getZ()
                + ", vị trí của XYZ: "
                + getXYZ()
                + super.toString();
    }
}
class Point3DTest {
    public static void main(String[] args) {
        LopPoint3D point3D = new LopPoint3D();
        System.out.println(point3D);
        point3D = new LopPoint3D(10.0f, 10.0f, 10.0f);
        System.out.println(point3D);
    }
}
