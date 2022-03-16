package controller;

import model.ISavable;
import model.Menu;

import java.util.ArrayList;

public class PlayerController {

    public void saveObject(ISavable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " storage device");
        }
    }

    public void loadObject(ISavable objectToLoad) {
        ArrayList<String> values = new Menu().readValues();
        objectToLoad.read(values);
    }
}
