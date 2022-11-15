
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coryhubbard.radiantgems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.coryhubbard.radiantgems.world.features.ores.GeodeFeature;
import net.coryhubbard.radiantgems.RadiantgemsMod;

@Mod.EventBusSubscriber
public class RadiantgemsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RadiantgemsMod.MODID);
	public static final RegistryObject<Feature<?>> GEODE = REGISTRY.register("geode", GeodeFeature::feature);
}
