package net.optifine.gui;

import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.AbstractOption;
import net.minecraft.client.settings.FullscreenResolutionOption;
import net.minecraft.util.text.StringTextComponent;

public class GuiOtherSettingsOF extends GuiScreenOF
{
    private Screen prevScreen;
    private GameSettings settings;
    private TooltipManager tooltipManager = new TooltipManager(this, new TooltipProviderOptions());

    public GuiOtherSettingsOF(Screen guiscreen, GameSettings gamesettings)
    {
        super(new StringTextComponent(I18n.format("of.options.otherTitle")));
        this.prevScreen = guiscreen;
        this.settings = gamesettings;
    }

    public void init()
    {
        this.buttonList.clear();
        AbstractOption abstractoption = new FullscreenResolutionOption(this.minecraft.getMainWindow());
        AbstractOption[] aabstractoption = new AbstractOption[] {AbstractOption.LAGOMETER, AbstractOption.PROFILER, AbstractOption.SHOW_FPS, AbstractOption.ADVANCED_TOOLTIPS, AbstractOption.WEATHER, AbstractOption.TIME, AbstractOption.FULLSCREEN, AbstractOption.AUTOSAVE_TICKS, AbstractOption.SCREENSHOT_SIZE, AbstractOption.SHOW_GL_ERRORS, abstractoption, null};

        for (int i = 0; i < aabstractoption.length; ++i)
        {
            AbstractOption abstractoption1 = aabstractoption[i];
            int j = this.width / 2 - 155 + i % 2 * 160;
            int k = this.height / 6 + 21 * (i / 2) - 12;
            Widget widget = this.addButton(abstractoption1.createWidget(this.minecraft.gameSettings, j, k, 150));

            if (abstractoption1 == abstractoption)
            {
                widget.setWidth(310);
                ++i;
            }
        }

        this.addButton(new GuiButtonOF(210, this.width / 2 - 100, this.height / 6 + 168 + 11 - 44, I18n.format("of.options.other.reset")));
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
                    this.minecraft.getMainWindow().update();
                    this.minecraft.displayGuiScreen(this.prevScreen);
                }

                if (guibuttonof.id == 210)
                {
                    this.minecraft.gameSettings.saveOptions();
                    String s = I18n.format("of.message.other.reset");
                    ConfirmScreen confirmscreen = new ConfirmScreen(this::confirmResult, new StringTextComponent(s), new StringTextComponent(""));
                    this.minecraft.displayGuiScreen(confirmscreen);
                }
            }
        }
    }

    public void removed()
    {
        this.minecraft.gameSettings.saveOptions();
        this.minecraft.getMainWindow().update();
        super.removed();
    }

    public void confirmResult(boolean flag)
    {
        if (flag)
        {
            this.minecraft.gameSettings.resetSettings();
        }

        this.minecraft.displayGuiScreen(this);
    }

    public void render(int x, int y, float f)
    {
        this.renderBackground();
        this.drawCenteredString(this.fontRenderer, this.title.getFormattedText(), this.width / 2, 15, 16777215);
        super.render(x, y, f);
        this.tooltipManager.drawTooltips(x, y, this.buttonList);
    }
}
