package LLD.VehicleRental.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class InventoryFactory {
    List<String> listOfAllBrandName;
    Map<String, List<String>> listOfAllModelName;

    public void addToBrandName(String brandName){
        listOfAllBrandName.add(brandName);
    }
    public void addCarNameToBrandName(String modelName, String brandName){
        List<String> modelNamesList = listOfAllModelName.get(modelName);
    }
}
