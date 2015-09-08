package com.fauxhawk.fauxcraft.block;

import com.fauxhawk.fauxcraft.Reference.Textures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFauxCraft extends Block {
    public BlockFauxCraft() {
        this(Material.rock);
    }

    public BlockFauxCraft(Material material) {
        super(material);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
