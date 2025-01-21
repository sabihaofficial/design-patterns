package prototype;

public class tallBuilding implements Building {
     int height = 20;
     int totalFloors;
     int flatsPerFloor;
     String color;

    tallBuilding() {

    }

    tallBuilding(int height, int totalFloors, int flatsPerFloor, String color) {
          this.height = height;
          this.totalFloors = totalFloors;
          this.flatsPerFloor = flatsPerFloor;
          this.color = color;

     }

     @Override
     public Building clone() {
          return new tallBuilding(height, totalFloors, flatsPerFloor, color);
     }

     public void createBuilding() {
          try {
               if (height < 15) {

                    throw new Exception("height cannot be less than 15  and given height is : ");
               }

               System.out.println("Tall Building created with specs as - height : "
                       + height + " totalFloors : "
                       + totalFloors + " flatsPerFloor "
                       + flatsPerFloor);

          } catch (Exception e) {
               System.out.println("height cannot be less than 15 and given height is : " + this.height);
          }
     }

     @Override
     public void paintBuilding() {
          System.out.println("Tall building colored in : " + color);

     }
}
