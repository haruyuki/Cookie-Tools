package moe.haruyuki.cookietools.items.tools;

import moe.haruyuki.cookietools.CookieTools;
import moe.haruyuki.cookietools.init.ModItems;
import moe.haruyuki.cookietools.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

    public ToolPickaxe(String name, ToolMaterial material) {

        super(material);
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
