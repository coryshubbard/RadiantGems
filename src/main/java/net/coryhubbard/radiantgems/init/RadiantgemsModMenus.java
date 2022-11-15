
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coryhubbard.radiantgems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.coryhubbard.radiantgems.world.inventory.HammerGUIMenu;
import net.coryhubbard.radiantgems.RadiantgemsMod;

public class RadiantgemsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RadiantgemsMod.MODID);
	public static final RegistryObject<MenuType<HammerGUIMenu>> GEODE_SMASHER_GUI = REGISTRY.register("geode_smasher_gui",
			() -> IForgeMenuType.create(HammerGUIMenu::new));
}
