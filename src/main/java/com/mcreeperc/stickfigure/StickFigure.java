package com.mcreeperc.stickfigure;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(StickFigure.MODID)
public class StickFigure {
    public static final String MODID = "stickfigure";

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    //BLOCKS is a DeferredRegister.Blocks
    public static final DeferredItem<Item> Minecraft_ICON = ITEMS.registerSimpleItem("minecraft_icon", new Item.Properties());

    public StickFigure(IEventBus bus){
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
