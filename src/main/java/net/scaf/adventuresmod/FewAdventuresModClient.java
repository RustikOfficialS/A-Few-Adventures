package net.scaf.adventuresmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.scaf.adventuresmod.block.ModBlocks;
import net.scaf.adventuresmod.item.ModItems;

public class FewAdventuresModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MICA, RenderLayer.getCutout());
    }
}
