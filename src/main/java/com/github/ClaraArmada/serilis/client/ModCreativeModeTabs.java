package com.github.ClaraArmada.serilis.client;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.init.BlockInit;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Serilis.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab LIMINAL_SPACE_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        LIMINAL_SPACE_TAB = event.registerCreativeModeTab(new ResourceLocation(Serilis.MODID, "liminal_space_tab"),
            builder -> builder.icon(() -> new ItemStack(BlockInit.BACKROOMS_WALL1.get()))
                    .title(Component.translatable("creativemodetab.liminal_space_tab")));
    }
}
