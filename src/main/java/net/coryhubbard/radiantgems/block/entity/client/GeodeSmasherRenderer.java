package net.coryhubbard.radiantgems.block.entity.client;

import net.coryhubbard.radiantgems.RadiantgemsMod;
import net.coryhubbard.radiantgems.block.entity.GeodeSmasherBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class GeodeSmasherRenderer extends GeoBlockRenderer<GeodeSmasherBlockEntity> {
    public GeodeSmasherRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
        super(rendererDispatcherIn, new GeodeSmasherModel());
    }

    @Override
    public RenderType getRenderType(GeodeSmasherBlockEntity animatable, float partialTick, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
