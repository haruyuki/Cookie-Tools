package moe.haruyuki.cookietools.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CookieDirt extends BlockBase {

    public CookieDirt(String name, Material material) {

        super(name, material);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setSoundType(SoundType.GROUND);
        setHardness(0.5F);
        setResistance(2.5F);
        setHarvestLevel("spade", 0);
//        setLightLevel(0.0F);
//        setLightOpacity(0);
//        setBlockUnbreakable();
    }
}
