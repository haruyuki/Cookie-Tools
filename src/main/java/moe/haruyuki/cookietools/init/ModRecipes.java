package moe.haruyuki.cookietools.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {

        GameRegistry.addSmelting(ModItems.COOKIE_DUST, new ItemStack(ModItems.COOKIE_INGOT, 1), 0.35F);
    }
}
