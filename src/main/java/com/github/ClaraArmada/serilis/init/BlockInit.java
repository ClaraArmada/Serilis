package com.github.ClaraArmada.serilis.init;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.world.blocks.LargeRockModel;
import com.github.ClaraArmada.serilis.world.blocks.RockModel;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Serilis.MODID);

    //Blocks
    public static final RegistryObject<Block> CHALCOPYRITE_ORE = registerBlock("chalcopyrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
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
        public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
        public static final RegistryObject<Block> MERCURY_ORE = registerBlock("mercury_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));



    public static final RegistryObject<Block> LOAM = registerBlock("loam",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
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
    public static final RegistryObject<Block> BACKROOMS_WALL1 = registerBlock("backrooms_wall1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(-1.0F, 3600000.0F).sound(SoundType.STONE).noLootTable().isValidSpawn(BlockInit::never)));
    public static final RegistryObject<Block> BACKROOMS_WALL2 = registerBlock("backrooms_wall2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(-1.0F, 3600000.0F).sound(SoundType.STONE).noLootTable().isValidSpawn(BlockInit::never)));



    public static final RegistryObject<Block> ROCK = registerBlock("rock",
            () -> new RockModel(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SANDSTONE_ROCK = registerBlock("sandstone_rock",
            () -> new RockModel(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_ROCK = registerBlock("large_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_SANDSTONE_ROCK = registerBlock("large_sandstone_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_ROCK = registerBlock("small_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_SANDSTONE_ROCK = registerBlock("small_sandstone_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));

    /*
    public static final RegistryObject<Block> CLAY_PIPE_BLOCK = registerBlock("clay_pipe_block",
            () -> new ClayPipeBlock(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(0.6f).sound(SoundType.STONE)));
     */
    public static final RegistryObject<Block> CLAY_FURNACE = registerBlock("clay_furnace",
            () -> new FurnaceBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)
                    .strength(0.6f).sound(SoundType.STONE)));


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
