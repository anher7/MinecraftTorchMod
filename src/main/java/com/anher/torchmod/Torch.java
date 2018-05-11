package com.anher.torchmod;

import com.anher.torchmod.init.ModBlocks;
import com.anher.torchmod.init.ModCrafting;
import com.anher.torchmod.proxy.CommonProxy;
import com.anher.torchmod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Torch {

    @Mod.Instance
    public static Torch instance;

    //Configure mod info according to the Reference class
    @SidedProxy(clientSide = Reference.CLIENT_PROXT_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
        public static void init(FMLInitializationEvent event){
        //Initialize Crafting recipes class
        ModCrafting.register();
    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event){

    }

    //Creative Tab and it's icon
    public static CreativeTabs torchTab = new CreativeTabs("torch") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.Button_Block);
        }
    };

}
