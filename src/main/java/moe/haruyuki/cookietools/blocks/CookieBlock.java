package moe.haruyuki.cookietools.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CookieBlock extends BlockBase {

    public CookieBlock(String name, Material material) {

        super(name, material);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setSoundType(SoundType.METAL);
        setHardness(1.0F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 0);
//        setLightLevel(0.0F);
//        setLightOpacity(0);
//        setBlockUnbreakable();
    }
}
