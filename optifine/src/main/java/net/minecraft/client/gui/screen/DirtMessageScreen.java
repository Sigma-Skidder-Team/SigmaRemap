package net.minecraft.client.gui.screen;

import net.minecraft.util.text.ITextComponent;

public class DirtMessageScreen extends Screen
{
    public DirtMessageScreen(ITextComponent serverIn)
    {
        super(serverIn);
    }

    public boolean shouldCloseOnEsc()
    {
        return false;
    }

    public void render(int p_render_1_, int p_render_2_, float p_render_3_)
    {
        this.renderDirtBackground(0);
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 70, 16777215);
        super.render(p_render_1_, p_render_2_, p_render_3_);
    }
}
