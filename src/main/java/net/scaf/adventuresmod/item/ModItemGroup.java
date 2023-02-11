package net.scaf.adventuresmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scaf.adventuresmod.FewAdventuresMod;

public class ModItemGroup {
    public static final ItemGroup FEW_ADVENTURES_MOD_ITEMS = FabricItemGroup.builder(new Identifier(FewAdventuresMod.MOD_ID))
            .displayName(Text.literal("A Few Adventures"))
            .icon(() -> new ItemStack(ModItems.GREEN_REFRACTING_CRYSTAL))
            .build();
}
