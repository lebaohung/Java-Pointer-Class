public class Pointer2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Pointer2D() {
    }

    public Pointer2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        float[] arr = {getX(), getY()};
        return arr;
    }

    @Override
    public String toString() {
        return "{" + getXY()[0] + ", " + getXY()[1] + "}";
    }
}
