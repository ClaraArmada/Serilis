package com.github.ClaraArmada.serilis.init;

import com.github.ClaraArmada.serilis.Serilis;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Serilis.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            Serilis.MODID);

    public static RegistryObject<CreativeModeTab> SERILIS_LIMINAL_SPACE_TAB = CREATIVE_MODE_TABS.register("serilis_liminal_space_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(BlockInit.BACKROOMS_WALL1.get()))
                    .title(Component.translatable("creativemodetab.liminal_space_tab")).build());
    public static RegistryObject<CreativeModeTab> SERILIS_HOLIDAYS = CREATIVE_MODE_TABS.register("serilis_holidays", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(BlockInit.LOOT_GIFT.get()))
                    .title(Component.translatable("creativemodetab.holidays_tab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
