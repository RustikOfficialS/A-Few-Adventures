package net.scaf.adventuresmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.scaf.adventuresmod.FewAdventuresMod;
import net.scaf.adventuresmod.block.custom.*;
import net.scaf.adventuresmod.item.ModItemGroup;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {
    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registries.BLOCK, new Identifier(FewAdventuresMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(FewAdventuresMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(FewAdventuresMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()) {
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable(tooltipKey));
            }
        });
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(FewAdventuresMod.MOD_ID, name), block);
    }


    public static final Block CRYSTAL_LAMP = registerBlock("crystal_lamp",
            new CrystalLamp(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
                    .luminance((state) -> state.get(CrystalLamp.LEVEL) == EnumItem.EMPTY ? 0 : 16)), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Block ANCIENT_TEMPLE_BRICKS = registerBlock("ancient_temple_bricks",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Block ANCIENT_TEMPLE_STONE = registerBlock("ancient_temple_stone",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Block ANCIENT_TEMPLE_KEYHOLE = registerBlock("ancient_temple_keyhole",
            new AncientTempleKeyholeBlock(FabricBlockSettings.of(Material.METAL).strength(4f, 6f).requiresTool()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Block MICA_BLOCK = registerBlock("mica_block",
            new MicaBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Block MICA = registerBlock("mica",
            new Mica(FabricBlockSettings.of(Material.METAL).strength(1.5f).requiresTool().nonOpaque().luminance(state -> 5)), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static void registerModBlocks() {
        FewAdventuresMod.LOGGER.debug("Registering Mod Blocks for " + FewAdventuresMod.MOD_ID);
    }
}
