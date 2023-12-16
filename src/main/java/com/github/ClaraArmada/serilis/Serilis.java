package com.github.ClaraArmada.serilis;

import com.github.ClaraArmada.serilis.common.events.loot.ModLootModifiers;
import com.github.ClaraArmada.serilis.init.*;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
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

        ModCreativeModeTabs.register(modEventBus);

        ItemInit.register(modEventBus);

        BlockInit.register(modEventBus);

        EntityInit.register(modEventBus);

        ModSounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addcreative);

        ModLootModifiers.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addcreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ItemInit.RAW_CHALCOPYRITE);
            event.accept(ItemInit.OAK_BOARD);
            event.accept(ItemInit.SPRUCE_BOARD);
            event.accept(ItemInit.BIRCH_BOARD);
            event.accept(ItemInit.JUNGLE_BOARD);
            event.accept(ItemInit.ACACIA_BOARD);
            event.accept(ItemInit.DARK_BOARD);
            event.accept(ItemInit.MANGROVE_BOARD);
            event.accept(ItemInit.CRIMSON_BOARD);
            event.accept(ItemInit.WARPED_BOARD);
            event.accept(ItemInit.PLANT_FIBER);
            event.accept(ItemInit.TWINE);
            event.accept(ItemInit.BRANCH);
            event.accept(ItemInit.DAUB);
            event.accept(ItemInit.ANIMAL_EXCREMENTS);
            event.accept(ItemInit.MUD_PILE);
            event.accept(ItemInit.SMALL_FUR);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ItemInit.FLINT_FLAKE);
            event.accept(ItemInit.FLINT_AXE_HEAD);
            event.accept(ItemInit.FLINT_ARROWHEAD);
            event.accept(ItemInit.FLINT_KNIFE_HEAD);
            event.accept(ItemInit.FLINT_AXE);
        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ItemInit.FLINT_SPEAR);
            event.accept(ItemInit.FLINT_KNIFE);
            event.accept(ItemInit.PRIMITIVE_BOOTS);
            event.accept(ItemInit.PRIMITIVE_COAT);
            event.accept(ItemInit.PRIMITIVE_LEGGINGS);
        }
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(BlockInit.CHALCOLPYRITE_ORE);
            event.accept(BlockInit.DEEPSLATE_CHALCOLPYRITE_ORE);
            event.accept(BlockInit.BAUXITE_ORE);
            event.accept(BlockInit.DENSE_BAUXITE_ORE);
            event.accept(BlockInit.ANTIMONY_ORE);
            event.accept(BlockInit.BISMUTH_ORE);
            event.accept(BlockInit.CHROMITE_ORE);
            event.accept(BlockInit.COBALTITE_ORE);
            event.accept(BlockInit.CASSITERITE_ORE); //
            event.accept(BlockInit.CINNABAR_ORE); //
            event.accept(BlockInit.ARGENTITE_ORE); //
            event.accept(BlockInit.PLATINUM_ORE); //
            event.accept(BlockInit.SMALL_ROCK);
            event.accept(BlockInit.ROCK);
            event.accept(BlockInit.LARGE_ROCK);
            event.accept(BlockInit.SMALL_SANDSTONE_ROCK);
            event.accept(BlockInit.SANDSTONE_ROCK);
            event.accept(BlockInit.LARGE_SANDSTONE_ROCK);
            event.accept(BlockInit.SMALL_ANDESITE_ROCK);
            event.accept(BlockInit.ANDESITE_ROCK);
            event.accept(BlockInit.LARGE_ANDESITE_ROCK);
            event.accept(BlockInit.SMALL_DIORITE_ROCK);
            event.accept(BlockInit.DIORITE_ROCK);
            event.accept(BlockInit.LARGE_DIORITE_ROCK);
            event.accept(BlockInit.SMALL_GRANITE_ROCK);
            event.accept(BlockInit.GRANITE_ROCK);
            event.accept(BlockInit.LARGE_GRANITE_ROCK);
            event.accept(BlockInit.SMALL_NETHERRACK_ROCK);
            event.accept(BlockInit.NETHERRACK_ROCK);
            event.accept(BlockInit.LARGE_NETHERRACK_ROCK);
            event.accept(BlockInit.SMALL_END_STONE_ROCK);
            event.accept(BlockInit.END_STONE_ROCK);
            event.accept(BlockInit.LARGE_END_STONE_ROCK);

            event.accept(BlockInit.LOAM);
            event.accept(BlockInit.SILT);
            event.accept(BlockInit.SANDY_CLAY);
            event.accept(BlockInit.SANDY_CLAY_LOAM);
            event.accept(BlockInit.SILT_LOAM);
            event.accept(BlockInit.SANDY_LOAM);
            event.accept(BlockInit.SILTY_CLAY);
            event.accept(BlockInit.SILTY_CLAY_LOAM);
            event.accept(BlockInit.CLAY_LOAM);
            event.accept(BlockInit.LOAM_MUD);
            event.accept(BlockInit.SILT_MUD);
            event.accept(BlockInit.SANDY_CLAY_MUD);
            event.accept(BlockInit.SANDY_CLAY_LOAM_MUD);
            event.accept(BlockInit.SILT_LOAM_MUD);
            event.accept(BlockInit.SANDY_LOAM_MUD);
            event.accept(BlockInit.SILTY_CLAY_MUD);
            event.accept(BlockInit.SILTY_CLAY_LOAM_MUD);
            event.accept(BlockInit.CLAY_LOAM_MUD);
            event.accept(BlockInit.DRY_QUICKSAND);
            event.accept(BlockInit.LOAM_GRASS);
            event.accept(BlockInit.SILT_GRASS);
            event.accept(BlockInit.SANDY_CLAY_GRASS);
            event.accept(BlockInit.SANDY_CLAY_LOAM_GRASS);
            event.accept(BlockInit.SILT_LOAM_GRASS);
            event.accept(BlockInit.SANDY_LOAM_GRASS);
            event.accept(BlockInit.SILTY_CLAY_GRASS);
            event.accept(BlockInit.SILTY_CLAY_LOAM_GRASS);
            event.accept(BlockInit.CLAY_LOAM_GRASS);
            event.accept(BlockInit.SAND_GRASS);
        }

        /*
        if(event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(BlockInit.CLAY_PIPE_BLOCK);
        }
         */

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(BlockInit.WOODEN_POST);
            event.accept(BlockInit.WATTLE);
            event.accept(BlockInit.WATTLE_AND_DAUB);
        }

        if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(BlockInit.BASIC_BLOOMERY);
        }

        if(event.getTab() == ModCreativeModeTabs.SERILIS_LIMINAL_SPACE_TAB.get()) {
            event.accept(BlockInit.BACKROOMS_WALL1);
            event.accept(BlockInit.BACKROOMS_WALL2);
            event.accept(BlockInit.POOLROOM_TILES);
        }
        if(event.getTab() == ModCreativeModeTabs.SERILIS_HOLIDAYS.get()) {
            event.accept(BlockInit.LOOT_GIFT);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }

}
