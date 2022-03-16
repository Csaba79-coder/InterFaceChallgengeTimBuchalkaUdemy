package model;

import java.util.ArrayList;
import java.util.List;

public class ISavableOtherWayImpl implements ISavableOtherWay {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public ISavableOtherWayImpl(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, String.valueOf(strength));
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public void read(List savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = String.valueOf(savedValues.get(0));
            this.hitPoints = Integer.parseInt(String.valueOf(savedValues.get(1)));
            this.strength = Integer.parseInt(String.valueOf(savedValues.get(2)));
            this.weapon = String.valueOf(savedValues.get(3));
        }
    }

    @Override
    public String toString() {
        return "ISavableOtherWayImpl{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
