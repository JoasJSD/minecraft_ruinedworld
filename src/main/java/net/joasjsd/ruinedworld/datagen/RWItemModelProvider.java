package net.joasjsd.ruinedworld.datagen;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.item.RWItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
public class RWItemModelProvider extends ItemModelProvider {
    public RWItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RuinedWorld.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        handheldItem(RWItems.ROBIUM_SWORD);
        handheldItem(RWItems.ROBIUM_PICKAXE);
        handheldItem(RWItems.ROBIUM_AXE);
        handheldItem(RWItems.ROBIUM_SHOVEL);
        handheldItem(RWItems.ROBIUM_HOE);


        simpleItem(RWItems.INFECTED_ROBIUM_HELMET);
        simpleItem(RWItems.INFECTED_ROBIUM_CHESTPLATE);
        simpleItem(RWItems.INFECTED_ROBIUM_LEGGINGS);
        simpleItem(RWItems.INFECTED_ROBIUM_BOOTS);


        withExistingParent(RWItems.SHADOWMELDER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RuinedWorld.MODID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RuinedWorld.MODID, "item/" + item.getId().getPath()));
    }
}