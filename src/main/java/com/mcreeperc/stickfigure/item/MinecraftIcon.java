package com.mcreeperc.stickfigure.item;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.mcreeperc.stickfigure.StickFigure.MODID;

public class MinecraftIcon {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredItem<Item> Minecraft_ICON = ITEMS.registerSimpleItem("minecraft_icon", new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.EPIC)

    );
    public static void Registers(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
