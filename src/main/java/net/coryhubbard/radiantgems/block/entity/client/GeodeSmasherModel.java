package net.coryhubbard.radiantgems.block.entity.client;

import net.coryhubbard.radiantgems.RadiantgemsMod;
import net.coryhubbard.radiantgems.block.entity.GeodeSmasherBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GeodeSmasherModel extends AnimatedGeoModel<GeodeSmasherBlockEntity> {
    @Override
    public ResourceLocation getModelResource(GeodeSmasherBlockEntity object) {
        return new ResourceLocation("radiantgems", "geo/geode_smasher.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GeodeSmasherBlockEntity object) {
        return new ResourceLocation("radiantgems", "textures/blocks/geode_smasher.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GeodeSmasherBlockEntity animatable) {
        return new ResourceLocation("radiantgems", "animations/geode_smasher.animation.json");
    }
}