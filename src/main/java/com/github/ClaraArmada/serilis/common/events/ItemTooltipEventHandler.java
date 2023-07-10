package com.github.ClaraArmada.serilis.common.events;

import com.github.ClaraArmada.serilis.Serilis;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Serilis.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ItemTooltipEventHandler {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack itemstack = event.getItemStack();
        Item item = itemstack.getItem();

        if (item == Items.RAW_COPPER || item == Items.RAW_COPPER_BLOCK || item == Items.COPPER_BLOCK) {
            event.getToolTip().add(Component.translatable("item.serilis.atomicsymbol.copper"));
        } else if (item == Items.RAW_IRON || item == Items.RAW_IRON_BLOCK || item == Items.IRON_BLOCK) {
            event.getToolTip().add(Component.translatable("item.serilis.atomicsymbol.iron"));
        } else if (item == Items.RAW_GOLD || item == Items.RAW_GOLD_BLOCK || item == Items.GOLD_BLOCK) {
            event.getToolTip().add(Component.translatable("item.serilis.atomicsymbol.gold"));
        } else if (item == Items.CLAY) {
            event.getToolTip().add(Component.translatable("item.serilis.atomicsymbol.kaolinite"));
        }

    }

}
