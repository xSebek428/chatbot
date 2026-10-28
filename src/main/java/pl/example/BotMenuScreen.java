
package pl.example.botmod;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public final class BotMenuScreen extends Screen {
    public BotMenuScreen() {
        super(Text.literal("BotMod"));
    }

    @Override
    public void render(
        DrawContext context,
        int mouseX,
        int mouseY,
        float delta
    ) {
        this.renderBackground(context, mouseX, mouseY, delta);

        context.drawCenteredTextWithShadow(
            this.textRenderer,
            Text.literal("BotMod - menu testowe"),
            this.width / 2,
            this.height / 2,
            0xFFFFFF
        );

        super.render(context, mouseX, mouseY, delta);
    }
}
