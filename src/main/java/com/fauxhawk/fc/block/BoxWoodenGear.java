package com.fauxhawk.fc.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BoxWoodenGear extends Block
{


    public BoxWoodenGear(Material materialIn)
    {
        super(materialIn);
        this.isTranslucent();
        this.isOpaqueCube();
    }
}
