package net.joasjsd.ruinedworld.datagen;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.block.RWBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RWBlockStateProvider extends BlockStateProvider {
    public RWBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RuinedWorld.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(RWBlocks.ROBIUM_INFECTED_STONE);
        blockWithItem(RWBlocks.ROBIUM_INFECTED_CRACKED_STONE_BRICKS);
        blockWithItem(RWBlocks.ROBIUM_INFECTED_STONE_BRICKS);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}