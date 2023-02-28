package com.github.ClaraArmada.serilis.client;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.client.renderer.entity.FlintSpearRenderer;
import com.github.ClaraArmada.serilis.world.entity.ModEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Serilis.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityType.FLINT_SPEAR.get(), FlintSpearRenderer::new);
    }
}
