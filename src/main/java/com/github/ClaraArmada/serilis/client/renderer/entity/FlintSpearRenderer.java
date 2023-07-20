package com.github.ClaraArmada.serilis.client.renderer.entity;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.client.models.FlintSpearModel;
import com.github.ClaraArmada.serilis.client.models.geom.ModModelLayers;
import com.github.ClaraArmada.serilis.world.entity.projectiles.ThrownFlintSpear;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FlintSpearRenderer extends EntityRenderer<ThrownFlintSpear> {
    public static final ResourceLocation SPEAR_LOCATION = new ResourceLocation(Serilis.MODID, "textures/entity/flint_spear.png");
    private final FlintSpearModel model;

    public FlintSpearRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new FlintSpearModel(context.bakeLayer(ModModelLayers.FLINT_SPEAR));
    }

    public void render(ThrownFlintSpear thrownSpear, float v, float v1, PoseStack stack, MultiBufferSource bufferSource, int i) {
        stack.pushPose();
        stack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(v1, thrownSpear.yRotO, thrownSpear.getYRot()) - 90.0F));
        stack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(v1, thrownSpear.xRotO, thrownSpear.getXRot()) + 90.0F));
        VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(bufferSource, this.model.renderType(this.getTextureLocation(thrownSpear)), false, thrownSpear.isFoil());
        this.model.renderToBuffer(stack, vertexconsumer, i, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        stack.popPose();
        super.render(thrownSpear, v, v1, stack, bufferSource, i);
    }

    @Override
    public ResourceLocation getTextureLocation(ThrownFlintSpear flintSpear) {
        return SPEAR_LOCATION;
    }
}
