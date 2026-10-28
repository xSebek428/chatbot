
package pl.example.botmod;

import net.fabricmc.api.ModInitializer;

public final class BotMod implements ModInitializer {
    public static final String MOD_ID = "botmod";

    @Override
    public void onInitialize() {
        System.out.println("BotMod loaded!");
    }
}
