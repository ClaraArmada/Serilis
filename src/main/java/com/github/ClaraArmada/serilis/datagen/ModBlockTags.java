package com.github.ClaraArmada.serilis.datagen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> ROCKS = create("rocks");

    private ModBlockTags() {
    }

    private static TagKey<Block> create(String s) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(s));
    }

    public static TagKey<Block> create(ResourceLocation name) {
        return TagKey.create(Registries.BLOCK, name);
    }
}
