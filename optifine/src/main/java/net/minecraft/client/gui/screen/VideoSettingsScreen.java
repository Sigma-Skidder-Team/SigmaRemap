package net.minecraft.client.gui.screen;

import java.util.List;
import net.minecraft.client.GameSettings;
import net.minecraft.client.MainWindow;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.AbstractOption;
import net.minecraft.util.text.TranslationTextComponent;
import net.optifine.Config;
import net.optifine.Lang;
import net.optifine.gui.GuiAnimationSettingsOF;
import net.optifine.gui.GuiButtonOF;
import net.optifine.gui.GuiDetailSettingsOF;
import net.optifine.gui.GuiOtherSettingsOF;
import net.optifine.gui.GuiPerformanceSettingsOF;
import net.optifine.gui.GuiQualitySettingsOF;
import net.optifine.gui.GuiScreenButtonOF;
import net.optifine.gui.GuiScreenOF;
import net.optifine.gui.TooltipManager;
import net.optifine.gui.TooltipProviderOptions;
import net.optifine.shaders.gui.GuiShaders;
import net.optifine.util.GuiUtils;
import org.lwjgl.glfw.GLFW;

public class VideoSettingsScreen extends GuiScreenOF
{
    private Screen parentGuiScreen;
    private GameSettings guiGameSettings;
    private static AbstractOption[] videoOptions = new AbstractOption[] {AbstractOption.GRAPHICS, AbstractOption.RENDER_DISTANCE, AbstractOption.AO, AbstractOption.FRAMERATE_LIMIT, AbstractOption.AO_LEVEL, AbstractOption.VIEW_BOBBING, AbstractOption.GUI_SCALE, AbstractOption.USE_VBO, AbstractOption.GAMMA, AbstractOption.ATTACK_INDICATOR, AbstractOption.DYNAMIC_LIGHTS, AbstractOption.DYNAMIC_FOV};
    private TooltipManager tooltipManager = new TooltipManager(this, new TooltipProviderOptions());
    private List<Widget> buttonList = this.buttons;
    private Widget buttonGuiScale;

    public VideoSettingsScreen(Screen p_i182_1_, GameSettings p_i182_2_)
    {
        super(new TranslationTextComponent("options.videoTitle"));
        this.parentGuiScreen = p_i182_1_;
        this.guiGameSettings = p_i182_2_;
    }

    public void init()
    {
        this.buttonList.clear();

        for (int i = 0; i < videoOptions.length; ++i)
        {
            AbstractOption abstractoption = videoOptions[i];

            if (abstractoption != null)
            {
                int j = this.width / 2 - 155 + i % 2 * 160;
                int k = this.height / 6 + 21 * (i / 2) - 12;
                Widget widget = this.addButton(abstractoption.createWidget(this.minecraft.gameSettings, j, k, 150));

                if (abstractoption == AbstractOption.GUI_SCALE)
                {
                    this.buttonGuiScale = widget;
                }
            }
        }

        int l = this.height / 6 + 21 * (videoOptions.length / 2) - 12;
        int i1 = 0;
        i1 = this.width / 2 - 155 + 0;
        this.addButton(new GuiScreenButtonOF(231, i1, l, Lang.get("of.options.shaders")));
        i1 = this.width / 2 - 155 + 160;
        this.addButton(new GuiScreenButtonOF(202, i1, l, Lang.get("of.options.quality")));
        l = l + 21;
        i1 = this.width / 2 - 155 + 0;
        this.addButton(new GuiScreenButtonOF(201, i1, l, Lang.get("of.options.details")));
        i1 = this.width / 2 - 155 + 160;
        this.addButton(new GuiScreenButtonOF(212, i1, l, Lang.get("of.options.performance")));
        l = l + 21;
        i1 = this.width / 2 - 155 + 0;
        this.addButton(new GuiScreenButtonOF(211, i1, l, Lang.get("of.options.animations")));
        i1 = this.width / 2 - 155 + 160;
        this.addButton(new GuiScreenButtonOF(222, i1, l, Lang.get("of.options.other")));
        l = l + 21;
        this.addButton(new GuiButtonOF(200, this.width / 2 - 100, this.height / 6 + 168 + 11, I18n.format("gui.done")));
    }

    protected void actionPerformed(Widget p_actionPerformed_1_)
    {
        if (p_actionPerformed_1_ == this.buttonGuiScale)
        {
            this.updateGuiScale();
        }

        if (p_actionPerformed_1_ instanceof GuiButtonOF)
        {
            GuiButtonOF guibuttonof = (GuiButtonOF)p_actionPerformed_1_;
            this.actionPerformed(guibuttonof, 1);
        }
    }

    protected void actionPerformedRightClick(Widget p_actionPerformedRightClick_1_)
    {
        if (p_actionPerformedRightClick_1_ == this.buttonGuiScale)
        {
            AbstractOption.GUI_SCALE.setValueIndex(this.guiGameSettings, -1);
            this.updateGuiScale();
        }
    }

    private void updateGuiScale()
    {
        this.minecraft.updateWindowSize();
        MainWindow mainwindow = this.minecraft.getMainWindow();
        int i = GuiUtils.getWidth(this.buttonGuiScale);
        int j = GuiUtils.getHeight(this.buttonGuiScale);
        int k = this.buttonGuiScale.x + (i - j);
        int l = this.buttonGuiScale.y + j / 2;
        GLFW.glfwSetCursorPos(mainwindow.getHandle(), (double)k * mainwindow.getGuiScaleFactor(), (double)l * mainwindow.getGuiScaleFactor());
    }

    private void actionPerformed(GuiButtonOF p_actionPerformed_1_, int p_actionPerformed_2_)
    {
        if (p_actionPerformed_1_.active)
        {
            if (p_actionPerformed_1_.id == 200)
            {
                this.minecraft.gameSettings.saveOptions();
                this.minecraft.displayGuiScreen(this.parentGuiScreen);
            }

            if (p_actionPerformed_1_.id == 201)
            {
                this.minecraft.gameSettings.saveOptions();
                GuiDetailSettingsOF guidetailsettingsof = new GuiDetailSettingsOF(this, this.guiGameSettings);
                this.minecraft.displayGuiScreen(guidetailsettingsof);
            }

            if (p_actionPerformed_1_.id == 202)
            {
                this.minecraft.gameSettings.saveOptions();
                GuiQualitySettingsOF guiqualitysettingsof = new GuiQualitySettingsOF(this, this.guiGameSettings);
                this.minecraft.displayGuiScreen(guiqualitysettingsof);
            }

            if (p_actionPerformed_1_.id == 211)
            {
                this.minecraft.gameSettings.saveOptions();
                GuiAnimationSettingsOF guianimationsettingsof = new GuiAnimationSettingsOF(this, this.guiGameSettings);
                this.minecraft.displayGuiScreen(guianimationsettingsof);
            }

            if (p_actionPerformed_1_.id == 212)
            {
                this.minecraft.gameSettings.saveOptions();
                GuiPerformanceSettingsOF guiperformancesettingsof = new GuiPerformanceSettingsOF(this, this.guiGameSettings);
                this.minecraft.displayGuiScreen(guiperformancesettingsof);
            }

            if (p_actionPerformed_1_.id == 222)
            {
                this.minecraft.gameSettings.saveOptions();
                GuiOtherSettingsOF guiothersettingsof = new GuiOtherSettingsOF(this, this.guiGameSettings);
                this.minecraft.displayGuiScreen(guiothersettingsof);
            }

            if (p_actionPerformed_1_.id == 231)
            {
                if (Config.isAntialiasing() || Config.isAntialiasingConfigured())
                {
                    Config.showGuiMessage(Lang.get("of.message.shaders.aa1"), Lang.get("of.message.shaders.aa2"));
                    return;
                }

                if (Config.isAnisotropicFiltering())
                {
                    Config.showGuiMessage(Lang.get("of.message.shaders.af1"), Lang.get("of.message.shaders.af2"));
                    return;
                }

                if (Config.isFastRender())
                {
                    Config.showGuiMessage(Lang.get("of.message.shaders.fr1"), Lang.get("of.message.shaders.fr2"));
                    return;
                }

                this.minecraft.gameSettings.saveOptions();
                GuiShaders guishaders = new GuiShaders(this, this.guiGameSettings);
                this.minecraft.displayGuiScreen(guishaders);
            }
        }
    }

    public void removed()
    {
        this.minecraft.gameSettings.saveOptions();
        super.removed();
    }

    public void render(int p_render_1_, int p_render_2_, float p_render_3_)
    {
        this.renderBackground();
        this.drawCenteredString(this.minecraft.fontRenderer, this.title.getFormattedText(), this.width / 2, 15, 16777215);
        String s = Config.getVersion();
        String s1 = "HD_U";

        if (s1.equals("HD"))
        {
            s = "OptiFine HD G1_pre30";
        }

        if (s1.equals("HD_U"))
        {
            s = "OptiFine HD G1_pre30 Ultra";
        }

        if (s1.equals("L"))
        {
            s = "OptiFine G1_pre30 Light";
        }

        this.drawString(this.minecraft.fontRenderer, s, 2, this.height - 10, 8421504);
        String s2 = "Minecraft 1.15.2";
        int i = this.minecraft.fontRenderer.getStringWidth(s2);
        this.drawString(this.minecraft.fontRenderer, s2, this.width - i - 2, this.height - 10, 8421504);
        super.render(p_render_1_, p_render_2_, p_render_3_);
        this.tooltipManager.drawTooltips(p_render_1_, p_render_2_, this.buttonList);
    }

    public static String getGuiChatText(ChatScreen p_getGuiChatText_0_)
    {
        return p_getGuiChatText_0_.inputField.getText();
    }
}
