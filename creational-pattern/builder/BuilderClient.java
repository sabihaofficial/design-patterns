package builder;

public class BuilderClient {
    public static void main(String[] args) {
        //Builder gives you the flexibility to build an object with limited params
        Square square = new Square.SquareBuilder()
                .setHeight(50)
                .setWidth(60)
                .buildSquare();

        Square square1 = new Square.SquareBuilder()
                .setHeight(50)
                .buildSquare();

    }
}
