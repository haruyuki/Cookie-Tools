package moe.haruyuki.cookietools.items;

import moe.haruyuki.cookietools.CookieTools;
import moe.haruyuki.cookietools.init.ModItems;
import moe.haruyuki.cookietools.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        CookieTools.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
