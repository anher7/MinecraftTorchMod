package com.anher.torchmod.blocks;

import com.anher.torchmod.Torch;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TorchBlock extends BlockBase {
    public TorchBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(1.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(20.2F);
        setLightOpacity(0);
        setCreativeTab(Torch.torchTab);
    }
}
