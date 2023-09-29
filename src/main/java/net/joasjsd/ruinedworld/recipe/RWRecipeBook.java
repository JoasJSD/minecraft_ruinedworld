package net.joasjsd.ruinedworld.recipe;

public enum RWRecipeBook implements net.minecraftforge.common.IExtensibleEnum {
    RECYCLING;

    public static RWRecipeBook create(String name) {
        throw new IllegalStateException("Enum not extended!");
    }
}
