package com.github.ClaraArmada.serilis.init;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.world.blocks.LargeRockModel;
import com.github.ClaraArmada.serilis.world.blocks.RockModel;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
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
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 4)));

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


    public static final RegistryObject<Block> ROCK = registerBlock("rock",
            () -> new RockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SANDSTONE_ROCK = registerBlock("sandstone_rock",
            () -> new RockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_ROCK = registerBlock("large_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> LARGE_SANDSTONE_ROCK = registerBlock("large_sandstone_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_ROCK = registerBlock("small_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> SMALL_SANDSTONE_ROCK = registerBlock("small_sandstone_rock",
            () -> new LargeRockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.STONE).dynamicShape().noOcclusion()));

    public static final RegistryObject<Block> CLAY_PIPE_BLOCK = registerBlock("clay_pipe_block",
            () -> new LargeRockModel(BlockBehaviour.Properties.of(Material.CLAY)
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

    public static  void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
