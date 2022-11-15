
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coryhubbard.radiantgems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.coryhubbard.radiantgems.item.SapphireGemItem;
import net.coryhubbard.radiantgems.item.RubyGemItem;
import net.coryhubbard.radiantgems.item.RoseQuartzGemItem;
import net.coryhubbard.radiantgems.item.HammerItem;
import net.coryhubbard.radiantgems.item.AquamarineGemItem;
import net.coryhubbard.radiantgems.item.AmethystGemItem;
import net.coryhubbard.radiantgems.RadiantgemsMod;

public class RadiantgemsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RadiantgemsMod.MODID);
	public static final RegistryObject<Item> GEODE = block(RadiantgemsModBlocks.GEODE, RadiantgemsModTabs.TAB_RADIANT_TAB);
	public static final RegistryObject<Item> AMETHYST_GEM = REGISTRY.register("amethyst_gem", () -> new AmethystGemItem());
	public static final RegistryObject<Item> AQUAMARINE_GEM = REGISTRY.register("aquamarine_gem", () -> new AquamarineGemItem());
	public static final RegistryObject<Item> RUBY_GEM = REGISTRY.register("ruby_gem", () -> new RubyGemItem());
	public static final RegistryObject<Item> SAPPHIRE_GEM = REGISTRY.register("sapphire_gem", () -> new SapphireGemItem());
	public static final RegistryObject<Item> ROSE_QUARTZ_GEM = REGISTRY.register("rose_quartz_gem", () -> new RoseQuartzGemItem());
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> GEODE_SMASHER = block(RadiantgemsModBlocks.GEODE_SMASHER, RadiantgemsModTabs.TAB_RADIANT_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
