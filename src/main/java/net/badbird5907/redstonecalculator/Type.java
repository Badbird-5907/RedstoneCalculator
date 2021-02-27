package net.badbird5907.redstonecalculator;

import java.util.ArrayList;
import java.util.HashMap;

public class Type {
    public static ArrayList<HashMap<Integer, String>> REPEATER = new ArrayList<>();
    public static ArrayList<HashMap<Integer, String>> OBSERVER = new ArrayList<>();
    public static ArrayList<HashMap<Integer, String>> HOPPER = new ArrayList<>();
    public static ArrayList<HashMap<Integer, String>> MINECART = new ArrayList<>();
    public static ArrayList<HashMap<Integer, String>> STICKS = new ArrayList<>();
    public static ArrayList<HashMap<Integer, String>> RAILS = new ArrayList<>();

    public static void init(){
        //repeater
        HashMap<Integer, String> repeaterstone = new HashMap();
        repeaterstone.put(3, "Stone");
        HashMap<Integer, String> repeatertorch = new HashMap();
        repeatertorch.put(2, "Redstone Torch");
        HashMap<Integer, String> repeaterredstone = new HashMap();
        repeaterstone.put(1, "Redstone");
        REPEATER.add(repeaterredstone);
        REPEATER.add(repeaterstone);
        REPEATER.add(repeatertorch);

        //Observer
        HashMap<Integer, String> observerstone = new HashMap();
        observerstone.put(6, "Cobble Stone");
        HashMap<Integer, String> observerquartz = new HashMap();
        observerquartz.put(1, "Quartz");
        HashMap<Integer, String> observerredstone = new HashMap();
        observerredstone.put(2, "Redstone");
        OBSERVER.add(observerredstone);
        OBSERVER.add(observerstone);
        OBSERVER.add(observerquartz);

        //hopper
        HashMap<Integer, String> hopperiron = new HashMap();
        HashMap<Integer, String> hopperchest = new HashMap();
        HashMap<Integer, String> hopperwood = new HashMap();
        hopperiron.put(5, "Iron");
        hopperchest.put(1, "Chest");
        hopperwood.put(2, "Logs (for chest)");
        HOPPER.add(hopperiron);
        HOPPER.add(hopperchest);
        HOPPER.add(hopperwood);
        //minecart
        HashMap<Integer, String> minecartiron = new HashMap();
        minecartiron.put(5, "Iron");
        MINECART.add(minecartiron);
        //rails
        HashMap<Integer, String> railsiron = new HashMap<>();
        HashMap<Integer, String> railsstick = new HashMap<>();
        railsiron.put(6,"Iron");
        railsstick.put(1,"Stick");
        RAILS.add(railsiron);
        RAILS.add(railsstick);
        //sticks
        HashMap<Integer,String> sticks = new HashMap<>();
        sticks.put(2,"Wood Planks");
        STICKS.add(sticks);
    }
}
