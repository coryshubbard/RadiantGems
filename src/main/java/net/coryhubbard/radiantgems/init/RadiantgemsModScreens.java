
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coryhubbard.radiantgems.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.coryhubbard.radiantgems.client.gui.HammerGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RadiantgemsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RadiantgemsModMenus.GEODE_SMASHER_GUI.get(), HammerGUIScreen::new);
		});
	}
}
