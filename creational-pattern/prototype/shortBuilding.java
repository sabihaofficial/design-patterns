package prototype;

public class shortBuilding implements Building {
    int height = 3;
    int totalFloors;
    int flatsPerFloor;
    String color;

    shortBuilding(){

    }
    shortBuilding(int height, int totalFloors, int flatsPerFloor, String color) {
        this.height = height;
        this.totalFloors = totalFloors;
        this.flatsPerFloor = flatsPerFloor;
        this.color = color;

    }

    @Override
    public Building clone() {
        return new prototype.shortBuilding(height, totalFloors, flatsPerFloor, color);
    }

    public void createBuilding() {
        try {
            if (height > 10) {

                throw new Exception("height cannot be more than 10 and given height is : ");
            }

            System.out.println("Tall Building created with specs as - height : "
                    + height + " totalFloors : "
                    + totalFloors + " flatsPerFloor "
                    + flatsPerFloor);
        } catch (Exception e) {
            System.out.println("height cannot be more than 10 and given height is : " + this.height);
        }

    }


    @Override
    public void paintBuilding() {
        System.out.println("short building colored in : " + color);

    }
}
