package com.github.ClaraArmada.serilis.client.renderer.entity;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.init.ItemInit;
import com.github.ClaraArmada.serilis.world.entity.projectile.ThrownFlintSpear;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FlintSpearRenderer extends ArrowRenderer<ThrownFlintSpear> {

    public FlintSpearRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(ThrownFlintSpear pEntity) {
        Item reference = pEntity.getPickResult().getItem();
        return new ResourceLocation(Serilis.MODID, "textures/entity/projectiles/flint_spear.png");
    }

}
