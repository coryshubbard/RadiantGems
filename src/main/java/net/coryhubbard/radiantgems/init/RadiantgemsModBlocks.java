
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coryhubbard.radiantgems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.coryhubbard.radiantgems.block.GeodeSmasherBlock;
import net.coryhubbard.radiantgems.block.GeodeBlock;
import net.coryhubbard.radiantgems.RadiantgemsMod;

public class RadiantgemsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RadiantgemsMod.MODID);
	public static final RegistryObject<Block> GEODE = REGISTRY.register("geode", () -> new GeodeBlock());
	public static final RegistryObject<Block> GEODE_SMASHER = REGISTRY.register("geode_smasher", () -> new GeodeSmasherBlock());
}
