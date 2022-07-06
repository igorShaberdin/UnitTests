public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    @Override
    public String toString() {
        return "Rectangle{" +
                "top=" + top +
                ", left=" + left +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public void rectangle1 (int top, int left, int width, int height) {
        this.height = height;
        this.width = width;
        this.left = left;
        this.top = top;
    }
    public void rectangle2 (int left, int top) {
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }
    public void rectangle3 (int left, int top) {
        this.top = top;
        this.left = left;
        width = 0;
        height = width;
    }

}
