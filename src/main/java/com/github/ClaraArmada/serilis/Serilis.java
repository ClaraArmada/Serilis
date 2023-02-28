package com.github.ClaraArmada.serilis;

import com.github.ClaraArmada.serilis.init.ItemInit;
import com.github.ClaraArmada.serilis.init.BlockInit;
import com.github.ClaraArmada.serilis.events.loot.ModLootModifiers;
import com.github.ClaraArmada.serilis.world.entity.ModEntityType;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Serilis.MODID)
public class Serilis {
    public static final String MODID = "serilis";
    private static final Logger LOGGER = LogUtils.getLogger();
    public Serilis() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.register(modEventBus);

        BlockInit.register(modEventBus);

        ModEntityType.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addcreative);

        ModLootModifiers.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addcreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ItemInit.RAW_CHALCOPYRITE);
            event.accept(ItemInit.OAK_PLANK);
            event.accept(ItemInit.SPRUCE_PLANK);
            event.accept(ItemInit.BIRCH_PLANK);
            event.accept(ItemInit.JUNGLE_PLANK);
            event.accept(ItemInit.ACACIA_PLANK);
            event.accept(ItemInit.DARK_OAK_PLANK);
            event.accept(ItemInit.MANGROVE_PLANK);
            event.accept(ItemInit.CRIMSON_PLANK);
            event.accept(ItemInit.WARPED_PLANK);
            event.accept(ItemInit.PLANT_FIBER);
            event.accept(ItemInit.TWINE);
        }
        if(event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ItemInit.FLINT_FLAKE);
            event.accept(ItemInit.FLINT_AXE_HEAD);
            event.accept(ItemInit.FLINT_ARROWHEAD);
            event.accept(ItemInit.FLINT_KNIFE_HEAD);
            event.accept(ItemInit.FLINT_AXE);
        }
        if(event.getTab() == CreativeModeTabs.COMBAT) {
            event.accept(ItemInit.FLINT_SPEAR);
            event.accept(ItemInit.FLINT_KNIFE);
        }
        if(event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(BlockInit.CHALCOPYRITE_ORE);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

}
