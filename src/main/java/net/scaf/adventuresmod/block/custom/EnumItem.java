package net.scaf.adventuresmod.block.custom;

import net.minecraft.util.StringIdentifiable;

public enum EnumItem implements StringIdentifiable {

    EMPTY,
    GLOWSTONE,
    REDSTONE,
    DIAMOND,
    LAPIS_LAZULI,
    EMERALD;

    public String toString() {
        return this.asString();
    }


    @Override
    public String asString() {
        if (this == EMPTY) {
            return "empty";
        } else if (this == GLOWSTONE) {
            return "glowstone";
        } else if (this == REDSTONE) {
            return "redstone";
        } else if (this == DIAMOND) {
            return "diamond";
        } else if (this == LAPIS_LAZULI) {
            return "lapis_lazuli";
        }
        return "emerald";
    }
}
