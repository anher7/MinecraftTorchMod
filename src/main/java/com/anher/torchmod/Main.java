package com.anher.torchmod;

import com.anher.torchmod.blocks.Tutton;
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
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.swing.plaf.basic.BasicComboBoxUI;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXT_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
        public static void init(FMLInitializationEvent event){
        ModCrafting.register();
    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event){

    }

    public static CreativeTabs torchTab = new CreativeTabs("tutton") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.Button_Block);
        }
    };

    @SubscribeEvent
    public static void tuttonEvent(Tutton event) {
        System.out.println("Tutton is picked up!");
    }
}
