package net.optifine.gui;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TranslationTextComponent;
import net.optifine.Config;

public class GuiMessage extends GuiScreenOF
{
    private Screen parentScreen;
    private String messageLine1;
    private String messageLine2;
    private final List listLines2 = Lists.newArrayList();
    protected String confirmButtonText;
    private int ticksUntilEnable;

    public GuiMessage(Screen parentScreen, String line1, String line2)
    {
        super(new TranslationTextComponent("of.options.detailsTitle"));
        this.parentScreen = parentScreen;
        this.messageLine1 = line1;
        this.messageLine2 = line2;
        this.confirmButtonText = I18n.format("gui.done");
    }

    public void init()
    {
        this.addButton(new GuiButtonOF(0, this.width / 2 - 100, this.height / 6 + 96, this.confirmButtonText));
        this.listLines2.clear();
        this.listLines2.addAll(this.minecraft.fontRenderer.listFormattedStringToWidth(this.messageLine2, this.width - 50));
    }

    protected void actionPerformed(Widget button)
    {
        Config.getMinecraft().displayGuiScreen(this.parentScreen);
    }

    public void render(int mouseX, int mouseY, float partialTicks)
    {
        this.renderBackground();
        this.drawCenteredString(this.fontRenderer, this.messageLine1, this.width / 2, 70, 16777215);
        int i = 90;

        for (String s : (List<String>)this.listLines2)
        {
            this.drawCenteredString(this.fontRenderer, s, this.width / 2, i, 16777215);
            i += 9;
        }

        super.render(mouseX, mouseY, partialTicks);
    }

    public void setButtonDelay(int ticksUntilEnable)
    {
        this.ticksUntilEnable = ticksUntilEnable;

        for (Widget button : this.buttonList)
        {
            button.active = false;
        }
    }

    public void tick()
    {
        super.tick();

        if (--this.ticksUntilEnable == 0)
        {
            for (Widget button : this.buttonList)
            {
                button.active = true;
            }
        }
    }
}
