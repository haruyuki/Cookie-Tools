package moe.haruyuki.cookietools.items.tools;

import moe.haruyuki.cookietools.CookieTools;
import moe.haruyuki.cookietools.init.ModItems;
import moe.haruyuki.cookietools.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel {

    public ToolSpade(String name, ToolMaterial material) {

        super(material);
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
