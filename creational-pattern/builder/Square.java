package builder;

public class Square {
    int height;
    int width;

    public Square(){}

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
        System.out.println("Generated square with height : " + height + " width : " + width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    static class SquareBuilder {
        int height;
        int width;

        public SquareBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public SquareBuilder setWidth(int width) {
            this.width = width;
            return this;
        }

        public Square buildSquare(){
            return new Square(height,width);
        }
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
