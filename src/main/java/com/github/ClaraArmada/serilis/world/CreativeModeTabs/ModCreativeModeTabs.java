package com.github.ClaraArmada.serilis.world.CreativeModeTabs;

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
    public static CreativeModeTab BACKROOMS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BACKROOMS_TAB = event.registerCreativeModeTab(new ResourceLocation(Serilis.MODID, "backrooms_tab"),
            builder -> builder.icon(() -> new ItemStack(BlockInit.BACKROOMS_WALL1.get()))
                    .title(Component.translatable("creativemodetab.backrooms_tab")));
    }
}
