package net.optifine.gui;

import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.AbstractOption;
import net.minecraft.util.text.StringTextComponent;

public class GuiDetailSettingsOF extends GuiScreenOF
{
    private Screen prevScreen;
    private GameSettings settings;
    private static AbstractOption[] enumOptions = new AbstractOption[] {AbstractOption.CLOUDS, AbstractOption.CLOUD_HEIGHT, AbstractOption.TREES, AbstractOption.RAIN, AbstractOption.SKY, AbstractOption.STARS, AbstractOption.SUN_MOON, AbstractOption.SHOW_CAPES, AbstractOption.FOG_FANCY, AbstractOption.FOG_START, AbstractOption.TRANSLUCENT_BLOCKS, AbstractOption.HELD_ITEM_TOOLTIPS, AbstractOption.DROPPED_ITEMS, AbstractOption.ENTITY_SHADOWS, AbstractOption.VIGNETTE, AbstractOption.ALTERNATE_BLOCKS, AbstractOption.SWAMP_COLORS, AbstractOption.BIOME_BLEND_RADIUS};
    private TooltipManager tooltipManager = new TooltipManager(this, new TooltipProviderOptions());

    public GuiDetailSettingsOF(Screen guiscreen, GameSettings gamesettings)
    {
        super(new StringTextComponent(I18n.format("of.options.detailsTitle")));
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
            this.addButton(abstractoption.createWidget(this.minecraft.gameSettings, j, k, 150));
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
        this.drawCenteredString(this.minecraft.fontRenderer, this.title.getFormattedText(), this.width / 2, 15, 16777215);
        super.render(x, y, f);
        this.tooltipManager.drawTooltips(x, y, this.buttonList);
    }
}