package com.anher.torchmod.blocks;

import com.anher.torchmod.Torch;
import com.anher.torchmod.init.ModBlocks;
import com.anher.torchmod.init.ModItems;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HiddenTorch extends BlockTorch {

    public HiddenTorch(String name, Material material) {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Torch.torchTab);
        setCreativeTab(CreativeTabs.TOOLS);
        setLightLevel(1.0F);
        setLightOpacity(1);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
        RenderHelper.enableGUIStandardItemLighting();
    }

    public boolean onBlockActivated(World p_onBlockActivated_1_, BlockPos p_onBlockActivated_2_, IBlockState p_onBlockActivated_3_, EntityPlayer p_onBlockActivated_4_, EnumHand p_onBlockActivated_5_, EnumFacing enumHand, float p_onBlockActivated_7_, float p_onBlockActivated_8_, float p_onBlockActivated_9_) {
            return true;
    }
}
