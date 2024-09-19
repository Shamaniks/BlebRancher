package com.doctorsmp.bleb_rancher.registry;

import com.doctorsmp.bleb_rancher.BlebRancher;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlebItems {
    public static Item PINK_PLORT = new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)
            .food(new FoodComponent.Builder()
                    .hunger(16)
                    .alwaysEdible()
                    .build()));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(BlebRancher.MOD_ID, "item/pink_plort"), PINK_PLORT);
    }
}
