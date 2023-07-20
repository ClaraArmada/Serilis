package com.github.ClaraArmada.serilis.client.models;

import com.github.ClaraArmada.serilis.world.entity.projectiles.ThrownFlintSpear;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;


// Made with Blockbench 4.7.4
public class FlintSpearModel<T extends ThrownFlintSpear> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION =
			new ModelLayerLocation(new ResourceLocation("serilis", "flint_spear"), "main");
	private final ModelPart spear;

	public FlintSpearModel(ModelPart root) {
		this.spear = root.getChild("spear");
	}

	public static LayerDefinition createBodyLayer() {
		var meshDefinition = new MeshDefinition();
		PartDefinition partDefinition = meshDefinition.getRoot();

		PartDefinition spear = partDefinition.addOrReplaceChild("spear", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		spear.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -32.0F, 0.0F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		spear.addOrReplaceChild("flint", CubeListBuilder.create().texOffs(12, 13).addBox(-2.0F, -33.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 10).addBox(-2.0F, -34.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 2).addBox(-3.0F, -38.0F, 0.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 7).addBox(-3.0F, -40.0F, 0.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 13).addBox(-2.0F, -42.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 7).addBox(-1.0F, -44.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshDefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		spear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}