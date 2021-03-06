package moe.haruyuki.cookietools.blocks;

import moe.haruyuki.cookietools.CookieTools;
import moe.haruyuki.cookietools.init.ModBlocks;
import moe.haruyuki.cookietools.init.ModItems;
import moe.haruyuki.cookietools.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {

        CookieTools.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
