//package com.anher.torchmod.items;
//
//import com.anher.torchmod.Main;
//import com.anher.torchmod.init.ModItems;
//import com.anher.torchmod.util.IHasModel;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.Item;
//
//public class ItemBase extends Item implements IHasModel {
//
//    public ItemBase(String name){
//        setUnlocalizedName(name);
//        setRegistryName(name);
//        setCreativeTab(CreativeTabs.TOOLS);
//        setCreativeTab(Main.torchTab);
//
//        ModItems.ITEMS.add(this);
//    }
//
//    @Override
//    public void registerModels() {
//        Main.proxy.registerItemRenderer(this, 0, "inventory");
//    }
//}
