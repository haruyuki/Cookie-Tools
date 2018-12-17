package moe.haruyuki.cookietools.init;

import moe.haruyuki.cookietools.items.ItemBase;
import moe.haruyuki.cookietools.items.tools.*;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();

    // Materials
    public static final Item.ToolMaterial MATERIAL_COOKIE = EnumHelper.addToolMaterial("material_cookie", 2, 150, 5.0F, 1.5F, 10);

    // Items
    public static final Item COOKIE_POWDER = new ItemBase("cookie_powder");
    public static final Item COOKIE_DUST = new ItemBase("cookie_dust");
    public static final Item COOKIE_INGOT = new ItemBase("cookie_ingot");

    // Tools
    public static final ItemPickaxe COOKIE_PICKAXE = new ToolPickaxe("cookie_pickaxe", MATERIAL_COOKIE);
    public static final ItemSpade COOKIE_SHOVEL = new ToolSpade("cookie_shovel", MATERIAL_COOKIE);
    public static final ItemSword COOKIE_SWORD = new ToolSword("cookie_sword", MATERIAL_COOKIE);

}
