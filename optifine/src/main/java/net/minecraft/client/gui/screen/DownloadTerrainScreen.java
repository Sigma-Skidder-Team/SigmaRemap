package net.minecraft.client.gui.screen;

import net.minecraft.client.gui.chat.NarratorChatListener;
import net.minecraft.client.resources.I18n;
import net.optifine.CustomLoadingScreen;
import net.optifine.CustomLoadingScreens;

public class DownloadTerrainScreen extends Screen
{
    private CustomLoadingScreen customLoadingScreen = CustomLoadingScreens.getCustomLoadingScreen();

    public DownloadTerrainScreen()
    {
        super(NarratorChatListener.EMPTY);
    }

    public boolean shouldCloseOnEsc()
    {
        return false;
    }

    public void render(int p_render_1_, int p_render_2_, float p_render_3_)
    {
        if (this.customLoadingScreen != null)
        {
            this.customLoadingScreen.drawBackground(this.width, this.height);
        }
        else
        {
            this.renderDirtBackground(0);
        }

        this.drawCenteredString(this.font, I18n.format("multiplayer.downloadingTerrain"), this.width / 2, this.height / 2 - 50, 16777215);
        super.render(p_render_1_, p_render_2_, p_render_3_);
    }

    public boolean isPauseScreen()
    {
        return false;
    }
}