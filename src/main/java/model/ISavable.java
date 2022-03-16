package model;

import java.util.ArrayList;
import java.util.List;

public interface ISavable {

    // ArrayList<String> write(); // <- refactor to any kind of list for the future!!! more flexible!
    List<String> write();

    // void read(ArrayList<String> savedValues); // <- refactor to any kind of list for the future!!! more flexible!
    void read(List<String> savedValues);

}
