package moe.haruyuki.cookietools.init;

import moe.haruyuki.cookietools.blocks.CookieBlock;
import moe.haruyuki.cookietools.blocks.CookieDirt;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block COOKIE_BLOCK = new CookieBlock("cookie_block", Material.IRON);
    public static final Block COOKIE_DIRT = new CookieDirt("cookie_dirt", Material.GROUND);

}
