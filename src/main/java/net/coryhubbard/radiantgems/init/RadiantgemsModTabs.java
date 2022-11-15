
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coryhubbard.radiantgems.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RadiantgemsModTabs {
	public static CreativeModeTab TAB_RADIANT_TAB;

	public static void load() {
		TAB_RADIANT_TAB = new CreativeModeTab("tabradiant_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RadiantgemsModItems.AMETHYST_GEM.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
