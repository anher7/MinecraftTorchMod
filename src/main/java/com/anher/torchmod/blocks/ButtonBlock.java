package com.anher.torchmod.blocks;

import com.anher.torchmod.Main;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ButtonBlock extends BlockBase {
    public ButtonBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(1.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.2F);
        setLightOpacity(0);
        setCreativeTab(Main.torchTab);
    }
}
