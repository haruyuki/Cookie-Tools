package moe.haruyuki.cookietools.items.tools;

import moe.haruyuki.cookietools.CookieTools;
import moe.haruyuki.cookietools.init.ModItems;
import moe.haruyuki.cookietools.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

    public ToolAxe(String name, ToolMaterial material) {

        super(material, 7.0F, -3.2F);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        CookieTools.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
