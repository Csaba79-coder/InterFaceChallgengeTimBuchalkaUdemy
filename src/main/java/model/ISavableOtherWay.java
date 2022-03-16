package model;

import java.util.List;

public interface ISavableOtherWay {

    // to be more generic!

    List write();
    void read(List savedValues);
}
