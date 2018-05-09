package com.anher.torchmod.init;

import java.util.ArrayList;
import java.util.List;
import com.anher.torchmod.blocks.ButtonBlock;
import com.anher.torchmod.blocks.Tutton;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block Button_Block = new ButtonBlock("button_block", Material.GROUND);
    public static final Block Tutton = new Tutton("tutton", Material.GOURD);

}
