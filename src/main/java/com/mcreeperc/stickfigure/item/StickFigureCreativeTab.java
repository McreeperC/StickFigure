package com.mcreeperc.stickfigure.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.mcreeperc.stickfigure.StickFigure.MODID;
import static com.mcreeperc.stickfigure.item.MinecraftIcon.Minecraft_ICON;

public class StickFigureCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final Supplier<CreativeModeTab> stick_figure = CREATIVE_MODE_TABS.register("stickfigure_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + MODID))
            .icon(() -> Minecraft_ICON.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(Minecraft_ICON.get());
            })
            .build());
    public static void Registers(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
