package com.anher.torchmod.init;

import java.util.ArrayList;
import java.util.List;

import com.anher.torchmod.blocks.HiddenTorch;
import com.anher.torchmod.blocks.TorchBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    //Initializing the blocks we have made
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block Button_Block = new TorchBlock("torch_block", Material.GROUND);
    public static final Block Hidden_Torch = new HiddenTorch("hidden_torch", Material.GOURD);

}
