package micromath;

public class MathResult {
    private final int x;
    private final int y;

    public MathResult(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getProduct() {
        return x * y;
    }

    public int getSum() {
        return x + y;
    }
}
