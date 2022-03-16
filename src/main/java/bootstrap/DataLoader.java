package bootstrap;

import controller.PlayerController;
import model.ISavable;
import model.Monster;
import model.Player;

public class DataLoader {

    PlayerController controller = new PlayerController();

    public void load() {

        Player tim = new Player("Tim", 10,15);

        System.out.println(tim.toString()); // the toString() at the end is unnecessary because of overriding the method in the Player Class!

        controller.saveObject(tim);
        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        System.out.println(tim);

        controller.saveObject(tim);
        // controller.loadObject(tim);
        System.out.println(tim);


        // if we have no strong need to use the class itself, we generally use the interface when creating the new object!
        // if for the declaration or initialization we use the interface, the code is more generic! --> this is ideal! (and getting the best out of using the interface!)
        ISavable werewolf = new Monster("Werewolf", 20, 40);

        System.out.println(werewolf);
        // here I have to cast ISavable to Monster first, to reach the getter method!
        System.out.println("Strength of Werewolf: " + ((Monster) werewolf).getStrength()); // this works if I use when creating werewolf the ISavable class!!!
        controller.saveObject(werewolf);

        // if ...
        Monster monster = new Monster("Monster", 10, 30);
        System.out.println("Strength of Monster: " + monster.getStrength()); // this case the getter works, functions!
    }
}
