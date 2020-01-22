package me.imillusion.androids.data.common;

import org.bukkit.inventory.ItemStack;

public interface Fuelable {

    ItemStack getFuel();
    long      getFuelDurationSeconds();

}
