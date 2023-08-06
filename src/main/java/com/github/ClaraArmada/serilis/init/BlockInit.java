package com.github.ClaraArmada.serilis.init;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.world.blocks.BasicBloomery;
import com.github.ClaraArmada.serilis.world.blocks.LargeRockModel;
import com.github.ClaraArmada.serilis.world.blocks.RockModel;
import com.github.ClaraArmada.serilis.world.blocks.SmallRockModel;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Serilis.MODID);

    public static final RegistryObject<Block> CHALCOLPYRITE_ORE = registerBlock("chalcopyrite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> DEEPSLATE_CHALCOLPYRITE_ORE = registerBlock("deepslate_chalcopyrite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> BAUXITE_ORE = registerBlock("bauxite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> DENSE_BAUXITE_ORE = registerBlock("dense_bauxite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> ANTIMONY_ORE = registerBlock("antimony_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
        public static final RegistryObject<Block> BISMUTH_ORE = registerBlock("bismuth_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> CHROMITE_ORE = registerBlock("chromite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> COBALTITE_ORE = registerBlock("cobaltite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> CASSITERITE_ORE = registerBlock("cassiterite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
        public static final RegistryObject<Block> CINNABAR_ORE = registerBlock("cinnabar_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> ARGENTITE_ORE = registerBlock("argentite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));



    public static final RegistryObject<Block> LOAM = registerBlock("loam",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> SANDY_CLAY = registerBlock("sandy_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> SANDY_CLAY_LOAM = registerBlock("sandy_clay_loam",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> SANDY_LOAM = registerBlock("sandy_loam",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> CLAY_LOAM = registerBlock("clay_loam",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> SILT = registerBlock("silt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> SILT_LOAM = registerBlock("silt_loam",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> SILTY_CLAY = registerBlock("silty_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> SILTY_CLAY_LOAM = registerBlock("silty_clay_loam",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> LOAM_MUD = registerBlock("loam_mud",
            () -> new MudBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> SANDY_CLAY_MUD = registerBlock("sandy_clay_mud",
            () -> new MudBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> SANDY_CLAY_LOAM_MUD = registerBlock("sandy_clay_loam_mud",
            () -> new MudBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> SANDY_LOAM_MUD = registerBlock("sandy_loam_mud",
            () -> new MudBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> CLAY_LOAM_MUD = registerBlock("clay_loam_mud",
            () -> new MudBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> SILT_MUD = registerBlock("silt_mud",
            () -> new MudBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> SILT_LOAM_MUD = registerBlock("silt_loam_mud",
            () -> new MudBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> SILTY_CLAY_MUD = registerBlock("silty_clay_mud",
            () -> new MudBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> SILTY_CLAY_LOAM_MUD = registerBlock("silty_clay_loam_mud",
            () -> new MudBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> DRY_QUICKSAND = registerBlock("dry_quicksand",
            () -> new PowderSnowBlock(BlockBehaviour.Properties.copy(Blocks.POWDER_SNOW).sound(SoundType.SAND)));

    public static final RegistryObject<Block> LOAM_GRASS = registerBlock("loam_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.GRASS).randomTicks()));
    public static final RegistryObject<Block> SANDY_CLAY_GRASS = registerBlock("sandy_clay_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.GRASS).randomTicks().sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> SANDY_CLAY_LOAM_GRASS = registerBlock("sandy_clay_loam_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.GRASS).randomTicks()));
    public static final RegistryObject<Block> SANDY_LOAM_GRASS = registerBlock("sandy_loam_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.GRASS).randomTicks()));
    public static final RegistryObject<Block> CLAY_LOAM_GRASS = registerBlock("clay_loam_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.GRASS).randomTicks()));
    public static final RegistryObject<Block> SILT_GRASS = registerBlock("silt_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.GRASS).randomTicks()));


    public static final RegistryObject<Block> SILT_LOAM_GRASS = registerBlock("silt_loam_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.GRASS).randomTicks()));
    public static final RegistryObject<Block> SILTY_CLAY_GRASS = registerBlock("silty_clay_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.GRASS).randomTicks()));
    public static final RegistryObject<Block> SILTY_CLAY_LOAM_GRASS = registerBlock("silty_clay_loam_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.GRASS).randomTicks()));
    public static final RegistryObject<Block> SAND_GRASS = registerBlock("sand_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.GRASS).randomTicks().sound(SoundType.GRAVEL)));


    public static final RegistryObject<Block> BACKROOMS_WALL1 = registerBlock("backrooms_wall1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(-1.0F, 3600000.0F).sound(SoundType.STONE).noLootTable().isValidSpawn(BlockInit::never)));
    public static final RegistryObject<Block> BACKROOMS_WALL2 = registerBlock("backrooms_wall2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(-1.0F, 3600000.0F).sound(SoundType.STONE).noLootTable().isValidSpawn(BlockInit::never)));



    public static final RegistryObject<Block> ROCK = registerBlock("rock",
            () -> new RockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_ROCK = registerBlock("large_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_ROCK = registerBlock("small_rock",
            () -> new SmallRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_SANDSTONE_ROCK = registerBlock("small_sandstone_rock",
            () -> new SmallRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SANDSTONE_ROCK = registerBlock("sandstone_rock",
            () -> new RockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_SANDSTONE_ROCK = registerBlock("large_sandstone_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_GRANITE_ROCK = registerBlock("small_granite_rock",
            () -> new SmallRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> GRANITE_ROCK = registerBlock("granite_rock",
            () -> new RockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_GRANITE_ROCK = registerBlock("large_granite_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_DIORITE_ROCK = registerBlock("small_diorite_rock",
            () -> new SmallRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> DIORITE_ROCK = registerBlock("diorite_rock",
            () -> new RockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_DIORITE_ROCK = registerBlock("large_diorite_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_ANDESITE_ROCK = registerBlock("small_andesite_rock",
            () -> new SmallRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> ANDESITE_ROCK = registerBlock("andesite_rock",
            () -> new RockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_ANDESITE_ROCK = registerBlock("large_andesite_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_NETHERRACK_ROCK = registerBlock("small_netherrack_rock",
            () -> new SmallRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> NETHERRACK_ROCK = registerBlock("netherrack_rock",
            () -> new RockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_NETHERRACK_ROCK = registerBlock("large_netherrack_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_END_STONE_ROCK = registerBlock("small_end_stone_rock",
            () -> new SmallRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> END_STONE_ROCK = registerBlock("end_stone_rock",
            () -> new RockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_END_STONE_ROCK = registerBlock("large_end_stone_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.STONE).dynamicShape().noOcclusion()));


    /*
    public static final RegistryObject<Block> CLAY_PIPE_BLOCK = registerBlock("clay_pipe_block",
            () -> new ClayPipeBlock(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(0.6f).sound(SoundType.STONE)));
     */
    public static final RegistryObject<Block> BASIC_BLOOMERY = registerBlock("basic_bloomery",
            () -> new BasicBloomery(BlockBehaviour.Properties.copy(Blocks.CLAY)
                    .strength(0.6f).sound(SoundType.STONE).dynamicShape().noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    private static Boolean never(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> entityType) {
        return (boolean)false;
    }

    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }


    public static  void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
