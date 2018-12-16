package moe.haruyuki.cookietools;

import moe.haruyuki.cookietools.proxy.CommonProxy;
import moe.haruyuki.cookietools.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class CookieTools {

    @Mod.Instance
    public static CookieTools instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {}

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
}
