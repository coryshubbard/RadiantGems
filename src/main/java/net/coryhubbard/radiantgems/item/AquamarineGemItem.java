
package net.coryhubbard.radiantgems.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.coryhubbard.radiantgems.init.RadiantgemsModTabs;

public class AquamarineGemItem extends Item {
	public AquamarineGemItem() {
		super(new Item.Properties().tab(RadiantgemsModTabs.TAB_RADIANT_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
