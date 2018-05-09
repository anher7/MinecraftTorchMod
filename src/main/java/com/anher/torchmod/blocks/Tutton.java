package com.anher.torchmod.blocks;

import com.anher.torchmod.Main;
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

public class Tutton extends BlockTorch {

    public Tutton(String name, Material material) {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.torchTab);
        setCreativeTab(CreativeTabs.TOOLS);
        setLightLevel(1.0F);
        setLightOpacity(1);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
        RenderHelper.enableGUIStandardItemLighting();
    }

//    @Override
//    public Item getItemDropped(IBlockState state, Random rand){
//        return Item.getItemFromBlock(ModBlocks.Tutton);
//    }
//
//    @Override
//    public Item getItem(IBlockState state, Random rand){
//        return new ItemBlock(ModBlocks.Tutton);
//    }


//    protected void playClickSound(@Nullable EntityPlayer p_playClickSound_1_, World p_playClickSound_2_, BlockPos p_playClickSound_3_) {
//        p_playClickSound_2_.playSound(p_playClickSound_1_, p_playClickSound_3_, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
//    }
//
//    protected void playReleaseSound(World p_playReleaseSound_1_, BlockPos p_playReleaseSound_2_) {
//        p_playReleaseSound_1_.playSound((EntityPlayer)null, p_playReleaseSound_2_, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.5F);
//    }

    public boolean onBlockActivated(World p_onBlockActivated_1_, BlockPos p_onBlockActivated_2_, IBlockState p_onBlockActivated_3_, EntityPlayer p_onBlockActivated_4_, EnumHand p_onBlockActivated_5_, EnumFacing enumHand, float p_onBlockActivated_7_, float p_onBlockActivated_8_, float p_onBlockActivated_9_) {
            return true;
    }
}
