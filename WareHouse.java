package InventoryReorderingSystem;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WareHouse {
    static void main() {
        ArrayList<ArrayList<Integer>>  inventory=new ArrayList<>();
        ArrayList<Integer> section0=new ArrayList<>();
        section0.add(10);
        section0.add(6);
        section0.add(8);
        inventory.add(section0);
        inventory.add(new ArrayList<>(List.of(1, 15, 2)));
        inventory.add(new ArrayList<>(List.of(5,8,13)));

        LinkedList<Integer> reorder=new LinkedList<>();
        for( ArrayList<Integer> section : inventory){
            for(int i: section){
                if(i<5){
                    reorder.add(i*2);
                }
            }
        }
        System.out.println("Original Warehouse Inventory:");
        for(int i=0;i< inventory.size();i++){
            System.out.println("Section "+i+" stock "+ inventory.get(i));
        }
        System.out.println("Target record Quantites ");
        System.out.println("Reordered list"+ reorder);
    }

}
