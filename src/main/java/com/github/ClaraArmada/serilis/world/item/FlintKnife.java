package com.github.ClaraArmada.serilis.world.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FlintKnife extends SwordItem {
    public FlintKnife(Tier tier, int v, float v1, Properties properties) {
        super(tier, v, v1, properties);
    }

    /* @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("item.serilis.flint_flake.tooltip").withStyle(ChatFormatting.GOLD));


        super.appendHoverText(stack, level, components, flag);
    }
     */ //this was a test
}
