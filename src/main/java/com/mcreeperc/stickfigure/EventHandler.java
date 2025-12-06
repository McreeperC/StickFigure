package com.mcreeperc.stickfigure;

import com.mcreeperc.stickfigure.item.MinecraftIcon;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

public class EventHandler {
    public GameType currentgameType = GameType.DEFAULT_MODE;
    public boolean trigger = false;
    public boolean trigger1 = true;


    @SubscribeEvent
    public void checkPlayerHand (PlayerTickEvent.Post event) {
        Player player = event.getEntity();
        ItemStack MainHand = player.getMainHandItem();
        ItemStack OffHand = player.getOffhandItem();
        boolean isMinecraftIconOnHand = MainHand.is(MinecraftIcon.Minecraft_ICON) || OffHand.is(MinecraftIcon.Minecraft_ICON);
        if (isMinecraftIconOnHand) {

            if (event.getEntity() instanceof ServerPlayer serverPlayer) {
                if (trigger1) {
                    CompoundTag data = serverPlayer.saveWithoutId(new CompoundTag());
                    int gameType = data.getInt("playerGameType");
                    currentgameType = GameType.byId(gameType);
                    trigger1 = false;
                }
                serverPlayer.setGameMode(GameType.CREATIVE);
                trigger = true;
            }
        }

        if (!isMinecraftIconOnHand && trigger) {
            if (event.getEntity() instanceof ServerPlayer serverPlayer) {
                serverPlayer.setGameMode(currentgameType);
                trigger = false;
                trigger1 = true;
            }

        }



    }


}