package com.github.ClaraArmada.serilis.client.utils;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.client.models.FlintSpearModel;
import com.github.ClaraArmada.serilis.client.renderer.entity.FlintSpearRenderer;
import com.github.ClaraArmada.serilis.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Serilis.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.FLINT_SPEAR.get(), FlintSpearRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(FlintSpearModel.LAYER_LOCATION, FlintSpearModel::createBodyLayer);
    }
}
