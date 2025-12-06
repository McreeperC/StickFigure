package com.mcreeperc.stickfigure;


import com.mcreeperc.stickfigure.item.MinecraftIcon;
import com.mcreeperc.stickfigure.item.StickFigureCreativeTab;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.OutgoingChatMessage;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameType;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ClientChatReceivedEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import org.slf4j.Logger;

import java.util.logging.Level;


@Mod(StickFigure.MODID)
public class StickFigure {
    public static final String MODID = "stickfigure";
    public static final Logger LOGGER = LogUtils.getLogger();
//    LocalPlayer player = Minecraft.getInstance().player;

//    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
//
//    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);




    public StickFigure(IEventBus bus){
//        BLOCKS.register(bus);
        MinecraftIcon.Registers(bus);
        StickFigureCreativeTab.Registers(bus);
        NeoForge.EVENT_BUS.register(new EventHandler());
//        NeoForge.EVENT_BUS.addListener(this::);
//        while (true){System.out.println(player.getOffhandItem());}



//        boolean isOnHand = MinecraftIcon.IsOnHand(player, player.interactOn());

    }




    //    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
    //        if (!event.getEntity().level().isClientSide) {
    //            // 设置所有新加入玩家为创造模式
    ////            event.getEntity().get(GameType.CREATIVE);
    //
    //            // 可选：发送欢迎消息
    //            event.getEntity().sendSystemMessage(Component.literal("已自动设置为创造模式"));
    //        }
    //    }



}

