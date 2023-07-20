package com.github.ClaraArmada.serilis.init;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.world.entity.projectiles.ThrownFlintSpear;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Serilis.MODID);

    public static final RegistryObject<EntityType<ThrownFlintSpear>> FLINT_SPEAR = ENTITIES.register("flint_spear",
            () -> EntityType.Builder.<ThrownFlintSpear>of(ThrownFlintSpear::new, MobCategory.MISC).sized(0.5F,0.5F)
                    .clientTrackingRange(4).updateInterval(20)
                    .build(new ResourceLocation(Serilis.MODID, "flint_spear").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
