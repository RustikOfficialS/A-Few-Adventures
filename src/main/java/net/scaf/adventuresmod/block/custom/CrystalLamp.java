package net.scaf.adventuresmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CrystalLamp extends Block {
    public static final EnumProperty<EnumItem> LEVEL = EnumProperty.of("level", EnumItem.class);
    public CrystalLamp(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient() && hand == Hand.MAIN_HAND) {

            if (state.get(LEVEL) == EnumItem.GLOWSTONE) {
                world.setBlockState(pos, state.with(LEVEL, EnumItem.EMPTY));
                double d = (double)(world.random.nextFloat() * 0.7f) + (double)0.15f;
                double e = (double)(world.random.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
                double g = (double)(world.random.nextFloat() * 0.7f) + (double)0.15f;
                Item item = Items.GLOWSTONE_DUST;
                ItemEntity itemEntity = new ItemEntity(world, (double)pos.getX() + d, (double)pos.getY() + e, (double)pos.getZ() + g, item.getDefaultStack());
                itemEntity.setToDefaultPickupDelay();
                world.spawnEntity(itemEntity);
            } else if (state.get(LEVEL) == EnumItem.REDSTONE) {
                world.setBlockState(pos, state.with(LEVEL, EnumItem.EMPTY));
                double d = (double)(world.random.nextFloat() * 0.7f) + (double)0.15f;
                double e = (double)(world.random.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
                double g = (double)(world.random.nextFloat() * 0.7f) + (double)0.15f;
                Item item = Items.REDSTONE;
                ItemEntity itemEntity = new ItemEntity(world, (double)pos.getX() + d, (double)pos.getY() + e, (double)pos.getZ() + g, item.getDefaultStack());
                itemEntity.setToDefaultPickupDelay();
                world.spawnEntity(itemEntity);
            } else if (state.get(LEVEL) == EnumItem.DIAMOND) {
                world.setBlockState(pos, state.with(LEVEL, EnumItem.EMPTY));
                double d = (double)(world.random.nextFloat() * 0.7f) + (double)0.15f;
                double e = (double)(world.random.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
                double g = (double)(world.random.nextFloat() * 0.7f) + (double)0.15f;
                Item item = Items.DIAMOND;
                ItemEntity itemEntity = new ItemEntity(world, (double)pos.getX() + d, (double)pos.getY() + e, (double)pos.getZ() + g, item.getDefaultStack());
                itemEntity.setToDefaultPickupDelay();
                world.spawnEntity(itemEntity);
            } else if (state.get(LEVEL) == EnumItem.LAPIS_LAZULI) {
                world.setBlockState(pos, state.with(LEVEL, EnumItem.EMPTY));
                double d = (double)(world.random.nextFloat() * 0.7f) + (double)0.15f;
                double e = (double)(world.random.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
                double g = (double)(world.random.nextFloat() * 0.7f) + (double)0.15f;
                Item item = Items.LAPIS_LAZULI;
                ItemEntity itemEntity = new ItemEntity(world, (double)pos.getX() + d, (double)pos.getY() + e, (double)pos.getZ() + g, item.getDefaultStack());
                itemEntity.setToDefaultPickupDelay();
                world.spawnEntity(itemEntity);
            } else if (state.get(LEVEL) == EnumItem.EMERALD) {
                world.setBlockState(pos, state.with(LEVEL, EnumItem.EMPTY));
                double d = (double)(world.random.nextFloat() * 0.7f) + (double)0.15f;
                double e = (double)(world.random.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
                double g = (double)(world.random.nextFloat() * 0.7f) + (double)0.15f;
                Item item = Items.EMERALD;
                ItemEntity itemEntity = new ItemEntity(world, (double)pos.getX() + d, (double)pos.getY() + e, (double)pos.getZ() + g, item.getDefaultStack());
                itemEntity.setToDefaultPickupDelay();
                world.spawnEntity(itemEntity);
            }

            if (player.getMainHandStack().getItem() == Items.GLOWSTONE_DUST){
                player.getMainHandStack().decrement(1);
                world.setBlockState(pos, state.with(LEVEL, EnumItem.GLOWSTONE));
            } else if (player.getMainHandStack().getItem() == Items.REDSTONE) {
                player.getMainHandStack().decrement(1);
                world.setBlockState(pos, state.with(LEVEL, EnumItem.REDSTONE));
            } else if (player.getMainHandStack().getItem() == Items.DIAMOND) {
                player.getMainHandStack().decrement(1);
                world.setBlockState(pos, state.with(LEVEL, EnumItem.DIAMOND));
            } else if (player.getMainHandStack().getItem() == Items.LAPIS_LAZULI) {
                player.getMainHandStack().decrement(1);
                world.setBlockState(pos, state.with(LEVEL, EnumItem.LAPIS_LAZULI));
            } else if (player.getMainHandStack().getItem() == Items.EMERALD) {
                player.getMainHandStack().decrement(1);
                world.setBlockState(pos, state.with(LEVEL, EnumItem.EMERALD));
            }

        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LEVEL);
    }
}