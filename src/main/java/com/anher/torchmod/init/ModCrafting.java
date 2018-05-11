package com.anher.torchmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    //Here are the crafting recipes
    public static void register() {

        //Shaped crafting recipe for our Torch Block
        GameRegistry.addShapedRecipe(new ResourceLocation("torch_block"),
                new ResourceLocation("blocks"),
                new ItemStack(ModBlocks.Button_Block, 1),
                "CCC",
                         "CTC",
                         "CCC",
                         'C', Blocks.COBBLESTONE,
                         'T', Blocks.TORCH);

        //Shapeless recipe for our hidden Torch
        GameRegistry.addShapelessRecipe(new ResourceLocation("torch"),
                new ResourceLocation("stone_button"),
                new ItemStack(ModBlocks.Hidden_Torch),
                CraftingHelper.getIngredient(Blocks.TORCH),
                CraftingHelper.getIngredient(Blocks.STONE_BUTTON)
                        );
    }
}
