package net.scaf.adventuresmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scaf.adventuresmod.FewAdventuresMod;
import net.scaf.adventuresmod.item.custom.*;

public class ModItems {

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
            return Registry.register(Registries.ITEM, new Identifier(FewAdventuresMod.MOD_ID, name), item);
    }

    public static final Item GREEN_REFRACTING_CRYSTAL = registerItem("green_refracting_crystal",
            new Item(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item SEA_AMULET = registerItem("sea_amulet",
            new Item(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item BLOOD_SCROLL = registerItem("blood_scroll",
            new Item(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item AQUARIUM_RING = registerItem("aquarium_ring",
            new AquariumRing(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item EVE = registerItem("eve",
            new SwordItem(ToolMaterials.DIAMOND, 8, 5f,
                    new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item DARK_BLADE = registerItem("dark_blade",
            new DarkBlade(ToolMaterials.DIAMOND, 12, 5f,
                    new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item AMETHYST_MAGIC_SWORD = registerItem("amethyst_magic_sword",
            new AmethystSword(ModToolMaterials.AMETHYST, 8, 4f,
                    new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item AMETHYST_MAGIC_PICKAXE = registerItem("amethyst_magic_pickaxe",
            new ModPickaxeItem(ModToolMaterials.AMETHYST, 7, 4f,
                    new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item AMETHYST_MAGIC_AXE = registerItem("amethyst_magic_axe",
            new ModAxeItem(ModToolMaterials.AMETHYST, 8, 3f,
                    new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item AQUAMANTIUM_INGOT = registerItem("aquamantium_ingot",
            new Item(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item AQUAMANTIUM_SHARD = registerItem("aquamantium_shard",
            new Item(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item AQUAMANTIUM_HELMET = registerItem("aquamantium_helmet",
            new AquamantiumHelmet(ModArmorMaterials.AQUAMANTIUM, EquipmentSlot.HEAD,
                    new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item FROSTMOURNE = registerItem("frostmourne",
            new SwordItem(ToolMaterials.DIAMOND, 12, 5f,
                    new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item ANCIENT_KEY = registerItem("ancient_key",
            new Item(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item ASTRAL_STONE = registerItem("astral_stone",
            new Item(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item ASTRAL_CLUSTER = registerItem("astral_cluster",
            new Item(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item KNIFE = registerItem("knife",
            new Knife(ModToolMaterials.KNIFE_MATERIAL, -1, -2.4f,
                    new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item FLASK_OF_BLASE_POWDER = registerItem("flask_of_blaze_powder",
            new Item(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static final Item SHARD_OF_MICA = registerItem("shard_of_mica",
            new Item(new Item.Settings()), ModItemGroup.FEW_ADVENTURES_MOD_ITEMS);

    public static void registerModItems() {
        FewAdventuresMod.LOGGER.debug("Regsitering Mod Items for " + FewAdventuresMod.MOD_ID);
    }

}