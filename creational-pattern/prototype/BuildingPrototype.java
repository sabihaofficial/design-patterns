package prototype;

import java.util.HashMap;
import java.util.Map;

public class BuildingPrototype {
   private static Map<String, Building> buildingPrototype= new HashMap<>();

    public static void addBuilding(String type, Building building){
        buildingPrototype.put(type, building);
    }

    public static Building getBuilding(String type){
        return buildingPrototype.get(type);
    }

    public static Building createNewBuildingOfExistingType(String type) {
        if(!buildingPrototype.containsKey("type")){
            try {
                throw new Exception("Invalid Type!!" + type);
            } catch (Exception e) {
                System.out.println("Invalid Type entered : " + type);
            }
        }
        return buildingPrototype.get(type).clone();
    }

}
