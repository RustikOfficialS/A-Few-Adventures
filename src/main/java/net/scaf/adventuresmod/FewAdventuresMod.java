package net.scaf.adventuresmod;

import net.fabricmc.api.ModInitializer;
import net.scaf.adventuresmod.block.ModBlocks;
import net.scaf.adventuresmod.effect.ModEffects;
import net.scaf.adventuresmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FewAdventuresMod implements ModInitializer {
	public static final String MOD_ID = "adventuresmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEffects.registerEffects();
	}
}
