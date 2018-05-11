//package com.anher.torchmod.items;
//
//import com.anher.torchmod.Torch;
//import com.anher.torchmod.init.ModItems;
//import com.anher.torchmod.util.IHasModel;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.Item;
//
//public class ItemBase extends Item implements IHasModel {

//    //In case we need to create an item
//    public ItemBase(String name){
//        setUnlocalizedName(name);
//        setRegistryName(name);
//        setCreativeTab(CreativeTabs.TOOLS);
//        setCreativeTab(Torch.torchTab);
//
//        ModItems.ITEMS.add(this);
//    }
//
//    @Override
//    public void registerModels() {
//        Torch.proxy.registerItemRenderer(this, 0, "inventory");
//    }
//}
