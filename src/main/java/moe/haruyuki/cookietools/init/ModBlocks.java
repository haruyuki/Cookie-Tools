package moe.haruyuki.cookietools.init;

import moe.haruyuki.cookietools.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block COOKIE_BLOCK = new BlockBase("cookie_block", Material.IRON);

}
