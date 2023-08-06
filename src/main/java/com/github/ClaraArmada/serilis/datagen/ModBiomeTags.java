package com.github.ClaraArmada.serilis.datagen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class ModBiomeTags {
    public static final TagKey<Biome> ALLOWS_ROCK_GENERATION = create("allows_rock_generation");

    private ModBiomeTags() {
    }

    private static TagKey<Biome> create(String string) {
        return TagKey.create(Registries.BIOME, new ResourceLocation(string));
    }
}
