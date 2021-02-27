package net.badbird5907.redstonecalculator;

import javax.swing.*;
import java.util.HashMap;

public class Calculate {
    public static void process(String input, String type){
        Boolean yes;
        try{
            Integer.parseInt(input);
            yes = true;
        } catch (NumberFormatException e) {
            yes = false;
            throw new ErrorMessage(input + " Is not a integer!");
        }
        if(yes){
            int amount = Integer.parseInt(input);
            HashMap<Integer, String> recipe = new HashMap<>();
            if(type.equalsIgnoreCase("repeater")){
                for (HashMap<Integer, String> a : Type.REPEATER) {
                    a.forEach((k,v) ->{
                        recipe.put(k*amount,v);
                    });
                }
            }
            if(type.equalsIgnoreCase("observer")){
                for (HashMap<Integer, String> a : Type.OBSERVER) {
                    a.forEach((k,v) ->{
                        recipe.put(k*amount,v);
                    });
                }
            }
            if(type.equalsIgnoreCase("hopper")){
                for (HashMap<Integer, String> a : Type.HOPPER) {
                    a.forEach((k,v) ->{
                        recipe.put(k*amount,v);
                    });
                }
            }
            if(type.equalsIgnoreCase("minecart")){
                for (HashMap<Integer, String> a : Type.MINECART) {
                    a.forEach((k,v) ->{
                        recipe.put(k*amount,v);
                    });
                }
            }
            if(type.equalsIgnoreCase("stick")){
                for (HashMap<Integer, String> a : Type.STICKS) {
                    a.forEach((k,v) ->{
                        recipe.put(k*amount,v);
                    });
                }
            }
            if(type.equalsIgnoreCase("rails")){
                for (HashMap<Integer, String> a : Type.RAILS) {
                    a.forEach((k,v) ->{
                        recipe.put(k*amount,v);
                    });
                }
            }
            StringBuilder builder = new StringBuilder();
            builder.append("Recipe for " + amount + " of " + type);
            recipe.forEach((k,v)->{
                if(k > 64){
                    StringBuilder sb = new StringBuilder();
                    sb.append(" | " +  k/64 + " Stacks of " + v);
                    builder.append("\n" + k + "x " + v + sb);
                }
                else builder.append("\n" + k + "x " + v);

            });
            System.out.println(builder);
            JOptionPane.showMessageDialog(null, builder);
        }
    }
}
