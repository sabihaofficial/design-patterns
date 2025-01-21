package prototype;

public class BuildingClient {
    public static void main(String[] args) {
        //core logic classes
        Building tallBuilding = new tallBuilding(50,21,4,"blue");
        Building shortBuilding = new shortBuilding(10,5,2,"green");

        tallBuilding.createBuilding();
        tallBuilding.paintBuilding();

        shortBuilding.createBuilding();
        shortBuilding.paintBuilding();

        //added to protype above clasess
        BuildingPrototype.addBuilding("tallBuilding",tallBuilding);
        BuildingPrototype.addBuilding("shortBuilding",shortBuilding);

        // added method to prtotype so user can directly create isntead of again creating objects with same logic
        Building tallBuilding1 = BuildingPrototype.createNewBuildingOfExistingType("tallBuilding");
        Building shortBuilding1 = BuildingPrototype.createNewBuildingOfExistingType("shortBuilding");

        //post cloning we get different instances of same object(same properties)
        boolean isSameInstanceOfTallBuilding = tallBuilding1 != tallBuilding;
        boolean isSameInstanceOfShortBuilding = shortBuilding1 != shortBuilding;

        System.out.println("tall building 2 separate instances : " + isSameInstanceOfTallBuilding);
        System.out.println("short building 2 separate instances : " + isSameInstanceOfShortBuilding);
    }
}
