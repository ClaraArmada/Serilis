package com.github.ClaraArmada.serilis.client.models.geom;

import com.google.common.collect.Sets;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Set;
import java.util.stream.Stream;

@OnlyIn(Dist.CLIENT)
public class ModModelLayers {
    private static final Set<ModelLayerLocation> ALL_MODELS = Sets.newHashSet();

    // Custom entity model layers
    public static final ModelLayerLocation FLINT_SPEAR = register("flint_spear");

    private static ModelLayerLocation register(String name) {
        return createLocation(name, "main");
    }

    private static ModelLayerLocation createLocation(String name, String layer) {
        ModelLayerLocation modelLayerLocation = new ModelLayerLocation(new ResourceLocation("serilis", name), layer);
        if (!ALL_MODELS.add(modelLayerLocation)) {
            throw new IllegalStateException("Duplicate registration for " + modelLayerLocation);
        }
        return modelLayerLocation;
    }

    public static Stream<ModelLayerLocation> getKnownLocations() {
        return ALL_MODELS.stream();
    }
}
