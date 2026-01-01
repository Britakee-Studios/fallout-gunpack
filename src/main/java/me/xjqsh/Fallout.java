package me.xjqsh;

import com.tacz.guns.api.resource.ResourceManager;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Fallout.MOD_ID)
public class Fallout {
    public static final String MOD_ID = "tacz_fallout";
    public static final String DEFAULT_PACK_NAME = "fallout_default_pack";

    public Fallout(IEventBus modEventBus) {
        registerDefaultExtraGunPack();
    }

    private static void registerDefaultExtraGunPack() {
        String jarDefaultPackPath = String.format("/assets/%s/custom/%s", MOD_ID, DEFAULT_PACK_NAME);
        ResourceManager.registerExportResource(Fallout.class, jarDefaultPackPath);
    }
}
