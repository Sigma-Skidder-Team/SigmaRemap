package net.optifine.gui;

import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.AbstractOption;
import net.minecraft.util.text.StringTextComponent;

public class GuiPerformanceSettingsOF extends GuiScreenOF
{
    private Screen prevScreen;
    private GameSettings settings;
    private static AbstractOption[] enumOptions = new AbstractOption[] {AbstractOption.SMOOTH_FPS, AbstractOption.SMOOTH_WORLD, AbstractOption.FAST_RENDER, AbstractOption.FAST_MATH, AbstractOption.CHUNK_UPDATES, AbstractOption.CHUNK_UPDATES_DYNAMIC, AbstractOption.RENDER_REGIONS, AbstractOption.LAZY_CHUNK_LOADING, AbstractOption.SMART_ANIMATIONS};
    private TooltipManager tooltipManager = new TooltipManager(this, new TooltipProviderOptions());

    public GuiPerformanceSettingsOF(Screen guiscreen, GameSettings gamesettings)
    {
        super(new StringTextComponent(I18n.format("of.options.performanceTitle")));
        this.prevScreen = guiscreen;
        this.settings = gamesettings;
    }

    public void init()
    {
        this.buttonList.clear();

        for (int i = 0; i < enumOptions.length; ++i)
        {
            AbstractOption abstractoption = enumOptions[i];
            int j = this.width / 2 - 155 + i % 2 * 160;
            int k = this.height / 6 + 21 * (i / 2) - 12;
            Widget widget = this.addButton(abstractoption.createWidget(this.minecraft.gameSettings, j, k, 150));

            if (abstractoption == AbstractOption.RENDER_REGIONS)
            {
                widget.active = false;
            }
        }

        this.addButton(new GuiButtonOF(200, this.width / 2 - 100, this.height / 6 + 168 + 11, I18n.format("gui.done")));
    }

    protected void actionPerformed(Widget guiElement)
    {
        if (guiElement instanceof GuiButtonOF)
        {
            GuiButtonOF guibuttonof = (GuiButtonOF)guiElement;

            if (guibuttonof.active)
            {
                if (guibuttonof.id == 200)
                {
                    this.minecraft.gameSettings.saveOptions();
                    this.minecraft.displayGuiScreen(this.prevScreen);
                }
            }
        }
    }

    public void removed()
    {
        this.minecraft.gameSettings.saveOptions();
        super.removed();
    }

    public void render(int x, int y, float f)
    {
        this.renderBackground();
        this.drawCenteredString(this.fontRenderer, this.title.getFormattedText(), this.width / 2, 15, 16777215);
        super.render(x, y, f);
        this.tooltipManager.drawTooltips(x, y, this.buttonList);
    }
}
