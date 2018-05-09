package com.anher.torchmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void register() {
        GameRegistry.addShapedRecipe(new ResourceLocation("torch"),
                new ResourceLocation("111"),
                new ItemStack(ModBlocks.Button_Block),
                "CCC",
                "CBC",
                "CCC",
                'C', Blocks.COBBLESTONE,
                'B', Blocks.STONE_BUTTON);

        GameRegistry.addShapelessRecipe(new ResourceLocation("torch"),
                new ResourceLocation("torch.png"),
                new ItemStack(ModBlocks.Tutton),
                CraftingHelper.getIngredient(Blocks.TORCH),
                CraftingHelper.getIngredient(Blocks.STONE_BUTTON)
                        );
    }
}
