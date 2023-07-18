package com.github.ClaraArmada.serilis.common.events;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber(modid = Serilis.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ItemEventHandler {

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

    //////////////////////////////////////

    private static final Random random = new Random();

    @SubscribeEvent
    public static void onBlockClicked(PlayerInteractEvent.RightClickBlock event) {
        if (event.getLevel().isClientSide()) return;

        BlockPos blockPos = event.getPos();
        BlockState blockState = event.getLevel().getBlockState(blockPos);

        if (blockState.is(BlockTags.BASE_STONE_OVERWORLD)) {
            Item heldItem = event.getItemStack().getItem();

            if (heldItem == Items.FLINT) {
                int minQuantity = 0;
                int maxQuantity = 2;
                int randomQuantity = random.nextInt(maxQuantity - minQuantity + 1) + minQuantity;

                // Add the random quantity of FlintFlake items to the player's inventory
                for (int i = 0; i < randomQuantity; i++) {
                    event.getEntity().getInventory().add(ItemInit.FLINT_FLAKE.get().getDefaultInstance());
                }

                // Replace the Flint item in the player's hand with the remaining stack, if any
                ItemStack stack = event.getItemStack();
                stack.shrink(randomQuantity);
                if (stack.isEmpty()) {
                    event.getEntity().setItemInHand(event.getHand(), ItemStack.EMPTY);
                } else {
                    event.getEntity().setItemInHand(event.getHand(), stack);
                }
            }
        }
    }
}