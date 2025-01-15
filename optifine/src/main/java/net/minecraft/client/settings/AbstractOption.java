package net.minecraft.client.settings;

import net.minecraft.client.GameSettings;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.NewChatGui;
import net.minecraft.client.gui.chat.NarratorChatListener;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.ChatVisibility;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.optifine.Lang;
import net.optifine.config.IteratableOptionOF;
import net.optifine.config.SliderPercentageOptionOF;

public abstract class AbstractOption
{
    public static final SliderPercentageOption BIOME_BLEND_RADIUS = new SliderPercentageOption("options.biomeBlendRadius", 0.0D, 7.0D, 1.0F, (p_lambda$static$0_0_) ->
    {
        return (double)p_lambda$static$0_0_.biomeBlendRadius;
    }, (p_lambda$static$1_0_, p_lambda$static$1_1_) ->
    {
        p_lambda$static$1_0_.biomeBlendRadius = MathHelper.clamp(p_lambda$static$1_1_.intValue(), 0, 7);
        Minecraft.getInstance().worldRenderer.loadRenderers();
    }, (p_lambda$static$2_0_, p_lambda$static$2_1_) ->
    {
        double d0 = p_lambda$static$2_1_.get(p_lambda$static$2_0_);
        String s = p_lambda$static$2_1_.getDisplayString();
        int i = (int)d0 * 2 + 1;
        return s + I18n.format("options.biomeBlendRadius." + i);
    });
    public static final SliderPercentageOption CHAT_HEIGHT_FOCUSED = new SliderPercentageOption("options.chat.height.focused", 0.0D, 1.0D, 0.0F, (p_lambda$static$3_0_) ->
    {
        return p_lambda$static$3_0_.chatHeightFocused;
    }, (p_lambda$static$4_0_, p_lambda$static$4_1_) ->
    {
        p_lambda$static$4_0_.chatHeightFocused = p_lambda$static$4_1_;
        Minecraft.getInstance().ingameGUI.getChatGUI().refreshChat();
    }, (p_lambda$static$5_0_, p_lambda$static$5_1_) ->
    {
        double d0 = p_lambda$static$5_1_.normalizeValue(p_lambda$static$5_1_.get(p_lambda$static$5_0_));
        return p_lambda$static$5_1_.getDisplayString() + NewChatGui.calculateChatboxHeight(d0) + "px";
    });
    public static final SliderPercentageOption CHAT_HEIGHT_UNFOCUSED = new SliderPercentageOption("options.chat.height.unfocused", 0.0D, 1.0D, 0.0F, (p_lambda$static$6_0_) ->
    {
        return p_lambda$static$6_0_.chatHeightUnfocused;
    }, (p_lambda$static$7_0_, p_lambda$static$7_1_) ->
    {
        p_lambda$static$7_0_.chatHeightUnfocused = p_lambda$static$7_1_;
        Minecraft.getInstance().ingameGUI.getChatGUI().refreshChat();
    }, (p_lambda$static$8_0_, p_lambda$static$8_1_) ->
    {
        double d0 = p_lambda$static$8_1_.normalizeValue(p_lambda$static$8_1_.get(p_lambda$static$8_0_));
        return p_lambda$static$8_1_.getDisplayString() + NewChatGui.calculateChatboxHeight(d0) + "px";
    });
    public static final SliderPercentageOption CHAT_OPACITY = new SliderPercentageOption("options.chat.opacity", 0.0D, 1.0D, 0.0F, (p_lambda$static$9_0_) ->
    {
        return p_lambda$static$9_0_.chatOpacity;
    }, (p_lambda$static$10_0_, p_lambda$static$10_1_) ->
    {
        p_lambda$static$10_0_.chatOpacity = p_lambda$static$10_1_;
        Minecraft.getInstance().ingameGUI.getChatGUI().refreshChat();
    }, (p_lambda$static$11_0_, p_lambda$static$11_1_) ->
    {
        double d0 = p_lambda$static$11_1_.normalizeValue(p_lambda$static$11_1_.get(p_lambda$static$11_0_));
        return p_lambda$static$11_1_.getDisplayString() + (int)(d0 * 90.0D + 10.0D) + "%";
    });
    public static final SliderPercentageOption CHAT_SCALE = new SliderPercentageOption("options.chat.scale", 0.0D, 1.0D, 0.0F, (p_lambda$static$12_0_) ->
    {
        return p_lambda$static$12_0_.chatScale;
    }, (p_lambda$static$13_0_, p_lambda$static$13_1_) ->
    {
        p_lambda$static$13_0_.chatScale = p_lambda$static$13_1_;
        Minecraft.getInstance().ingameGUI.getChatGUI().refreshChat();
    }, (p_lambda$static$14_0_, p_lambda$static$14_1_) ->
    {
        double d0 = p_lambda$static$14_1_.normalizeValue(p_lambda$static$14_1_.get(p_lambda$static$14_0_));
        String s = p_lambda$static$14_1_.getDisplayString();
        return d0 == 0.0D ? s + I18n.format("options.off") : s + (int)(d0 * 100.0D) + "%";
    });
    public static final SliderPercentageOption CHAT_WIDTH = new SliderPercentageOption("options.chat.width", 0.0D, 1.0D, 0.0F, (p_lambda$static$15_0_) ->
    {
        return p_lambda$static$15_0_.chatWidth / 4.0571431D;
    }, (p_lambda$static$16_0_, p_lambda$static$16_1_) ->
    {
        p_lambda$static$16_1_ = p_lambda$static$16_1_ * 4.0571431D;
        p_lambda$static$16_0_.chatWidth = p_lambda$static$16_1_;
        Minecraft.getInstance().ingameGUI.getChatGUI().refreshChat();
    }, (p_lambda$static$17_0_, p_lambda$static$17_1_) ->
    {
        double d0 = p_lambda$static$17_1_.normalizeValue(p_lambda$static$17_1_.get(p_lambda$static$17_0_));
        return p_lambda$static$17_1_.getDisplayString() + NewChatGui.calculateChatboxWidth(d0 * 4.0571431D) + "px";
    });
    public static final SliderPercentageOption FOV = new SliderPercentageOption("options.fov", 30.0D, 110.0D, 1.0F, (p_lambda$static$18_0_) ->
    {
        return p_lambda$static$18_0_.fov;
    }, (p_lambda$static$19_0_, p_lambda$static$19_1_) ->
    {
        p_lambda$static$19_0_.fov = p_lambda$static$19_1_;
    }, (p_lambda$static$20_0_, p_lambda$static$20_1_) ->
    {
        double d0 = p_lambda$static$20_1_.get(p_lambda$static$20_0_);
        String s = p_lambda$static$20_1_.getDisplayString();

        if (d0 == 70.0D)
        {
            return s + I18n.format("options.fov.min");
        }
        else {
            return d0 == p_lambda$static$20_1_.getMaxValue() ? s + I18n.format("options.fov.max") : s + (int)d0;
        }
    });
    public static final SliderPercentageOption FRAMERATE_LIMIT = new SliderPercentageOption("options.framerateLimit", 0.0D, 260.0D, 5.0F, (p_lambda$static$21_0_) ->
    {
        return p_lambda$static$21_0_.vsync ? 0: (double)p_lambda$static$21_0_.framerateLimit;
    }, (p_lambda$static$22_0_, p_lambda$static$22_1_) ->
    {
        p_lambda$static$22_0_.framerateLimit = p_lambda$static$22_1_.intValue();
        p_lambda$static$22_0_.vsync = false;

        if (p_lambda$static$22_0_.framerateLimit <= 0)
        {
            p_lambda$static$22_0_.framerateLimit = 260;
            p_lambda$static$22_0_.vsync = true;
        }

        p_lambda$static$22_0_.updateVSync();
        Minecraft.getInstance().getMainWindow().setFramerateLimit(p_lambda$static$22_0_.framerateLimit);
    }, (p_lambda$static$23_0_, p_lambda$static$23_1_) ->
    {
        double d0 = p_lambda$static$23_1_.get(p_lambda$static$23_0_);
        String s = p_lambda$static$23_1_.getDisplayString();

        if (p_lambda$static$23_0_.vsync)
        {
            return s + Lang.get("of.options.framerateLimit.vsync");
        }
        else {
            return d0 == p_lambda$static$23_1_.getMaxValue() ? s + I18n.format("options.framerateLimit.max") : s + I18n.format("options.framerate", (int)d0);
        }
    });
    public static final SliderPercentageOption GAMMA = new SliderPercentageOption("options.gamma", 0.0D, 1.0D, 0.0F, (p_lambda$static$24_0_) ->
    {
        return p_lambda$static$24_0_.gamma;
    }, (p_lambda$static$25_0_, p_lambda$static$25_1_) ->
    {
        p_lambda$static$25_0_.gamma = p_lambda$static$25_1_;
    }, (p_lambda$static$26_0_, p_lambda$static$26_1_) ->
    {
        double d0 = p_lambda$static$26_1_.normalizeValue(p_lambda$static$26_1_.get(p_lambda$static$26_0_));
        String s = p_lambda$static$26_1_.getDisplayString();

        if (d0 == 0.0D)
        {
            return s + I18n.format("options.gamma.min");
        }
        else {
            return d0 == 1.0D ? s + I18n.format("options.gamma.max") : s + "+" + (int)(d0 * 100.0D) + "%";
        }
    });
    public static final SliderPercentageOption MIPMAP_LEVELS = new SliderPercentageOption("options.mipmapLevels", 0.0D, 4.0D, 1.0F, (p_lambda$static$27_0_) ->
    {
        return (double)p_lambda$static$27_0_.mipmapLevels;
    }, (p_lambda$static$28_0_, p_lambda$static$28_1_) ->
    {
        p_lambda$static$28_0_.mipmapLevels = p_lambda$static$28_1_.intValue();
        p_lambda$static$28_0_.updateMipmaps();
    }, (p_lambda$static$29_0_, p_lambda$static$29_1_) ->
    {
        double d0 = p_lambda$static$29_1_.get(p_lambda$static$29_0_);
        String s = p_lambda$static$29_1_.getDisplayString();

        if (d0 >= 4.0D)
        {
            return s + Lang.get("of.general.max");
        }
        else {
            return d0 == 0.0D ? s + I18n.format("options.off") : s + (int)d0;
        }
    });
    public static final SliderPercentageOption MOUSE_WHEEL_SENSITIVITY = new SliderMultiplierOption("options.mouseWheelSensitivity", 0.01D, 10.0D, 0.01F, (p_lambda$static$30_0_) ->
    {
        return p_lambda$static$30_0_.mouseWheelSensitivity;
    }, (p_lambda$static$31_0_, p_lambda$static$31_1_) ->
    {
        p_lambda$static$31_0_.mouseWheelSensitivity = p_lambda$static$31_1_;
    }, (p_lambda$static$32_0_, p_lambda$static$32_1_) ->
    {
        double d0 = p_lambda$static$32_1_.normalizeValue(p_lambda$static$32_1_.get(p_lambda$static$32_0_));
        return p_lambda$static$32_1_.getDisplayString() + String.format("%.2f", p_lambda$static$32_1_.denormalizeValue(d0));
    });
    public static final BooleanOption RAW_MOUSE_INPUT = new BooleanOption("options.rawMouseInput", (p_lambda$static$33_0_) ->
    {
        return p_lambda$static$33_0_.rawMouseInput;
    }, (p_lambda$static$34_0_, p_lambda$static$34_1_) ->
    {
        p_lambda$static$34_0_.rawMouseInput = p_lambda$static$34_1_;
        MainWindow mainwindow = Minecraft.getInstance().getMainWindow();

        if (mainwindow != null)
        {
            mainwindow.setRawMouseInput(p_lambda$static$34_1_);
        }
    });
    public static final SliderPercentageOption RENDER_DISTANCE = new SliderPercentageOption("options.renderDistance", 2.0D, 16.0D, 1.0F, (p_lambda$static$35_0_) ->
    {
        return (double)p_lambda$static$35_0_.renderDistanceChunks;
    }, (p_lambda$static$36_0_, p_lambda$static$36_1_) ->
    {
        p_lambda$static$36_0_.renderDistanceChunks = p_lambda$static$36_1_.intValue();
        Minecraft.getInstance().worldRenderer.setDisplayListEntitiesDirty();
    }, (p_lambda$static$37_0_, p_lambda$static$37_1_) ->
    {
        double d0 = p_lambda$static$37_1_.get(p_lambda$static$37_0_);
        return p_lambda$static$37_1_.getDisplayString() + I18n.format("options.chunks", (int)d0);
    });
    public static final SliderPercentageOption SENSITIVITY = new SliderPercentageOption("options.sensitivity", 0.0D, 1.0D, 0.0F, (p_lambda$static$38_0_) ->
    {
        return p_lambda$static$38_0_.mouseSensitivity;
    }, (p_lambda$static$39_0_, p_lambda$static$39_1_) ->
    {
        p_lambda$static$39_0_.mouseSensitivity = p_lambda$static$39_1_;
    }, (p_lambda$static$40_0_, p_lambda$static$40_1_) ->
    {
        double d0 = p_lambda$static$40_1_.normalizeValue(p_lambda$static$40_1_.get(p_lambda$static$40_0_));
        String s = p_lambda$static$40_1_.getDisplayString();

        if (d0 == 0.0D)
        {
            return s + I18n.format("options.sensitivity.min");
        }
        else {
            return d0 == 1.0D ? s + I18n.format("options.sensitivity.max") : s + (int)(d0 * 200.0D) + "%";
        }
    });
    public static final SliderPercentageOption ACCESSIBILITY_TEXT_BACKGROUND_OPACITY = new SliderPercentageOption("options.accessibility.text_background_opacity", 0.0D, 1.0D, 0.0F, (p_lambda$static$41_0_) ->
    {
        return p_lambda$static$41_0_.accessibilityTextBackgroundOpacity;
    }, (p_lambda$static$42_0_, p_lambda$static$42_1_) ->
    {
        p_lambda$static$42_0_.accessibilityTextBackgroundOpacity = p_lambda$static$42_1_;
        Minecraft.getInstance().ingameGUI.getChatGUI().refreshChat();
    }, (p_lambda$static$43_0_, p_lambda$static$43_1_) ->
    {
        return p_lambda$static$43_1_.getDisplayString() + (int)(p_lambda$static$43_1_.normalizeValue(p_lambda$static$43_1_.get(p_lambda$static$43_0_)) * 100.0D) + "%";
    });
    public static final IteratableOption AO = new IteratableOption("options.ao", (p_lambda$static$44_0_, p_lambda$static$44_1_) ->
    {
        p_lambda$static$44_0_.ambientOcclusionStatus = AmbientOcclusionStatus.getValue(p_lambda$static$44_0_.ambientOcclusionStatus.getId() + p_lambda$static$44_1_);
        Minecraft.getInstance().worldRenderer.loadRenderers();
    }, (p_lambda$static$45_0_, p_lambda$static$45_1_) ->
    {
        return p_lambda$static$45_1_.getDisplayString() + I18n.format(p_lambda$static$45_0_.ambientOcclusionStatus.getResourceKey());
    });
    public static final IteratableOption ATTACK_INDICATOR = new IteratableOption("options.attackIndicator", (p_lambda$static$46_0_, p_lambda$static$46_1_) ->
    {
        p_lambda$static$46_0_.attackIndicator = AttackIndicatorStatus.byId(p_lambda$static$46_0_.attackIndicator.getId() + p_lambda$static$46_1_);
    }, (p_lambda$static$47_0_, p_lambda$static$47_1_) ->
    {
        return p_lambda$static$47_1_.getDisplayString() + I18n.format(p_lambda$static$47_0_.attackIndicator.getResourceKey());
    });
    public static final IteratableOption CHAT_VISIBILITY = new IteratableOption("options.chat.visibility", (p_lambda$static$48_0_, p_lambda$static$48_1_) ->
    {
        p_lambda$static$48_0_.chatVisibility = ChatVisibility.getValue((p_lambda$static$48_0_.chatVisibility.getId() + p_lambda$static$48_1_) % 3);
    }, (p_lambda$static$49_0_, p_lambda$static$49_1_) ->
    {
        return p_lambda$static$49_1_.getDisplayString() + I18n.format(p_lambda$static$49_0_.chatVisibility.getResourceKey());
    });
    public static final IteratableOption GRAPHICS = new IteratableOption("options.graphics", (p_lambda$static$50_0_, p_lambda$static$50_1_) ->
    {
        p_lambda$static$50_0_.fancyGraphics = !p_lambda$static$50_0_.fancyGraphics;
        p_lambda$static$50_0_.updateRenderClouds();
        Minecraft.getInstance().worldRenderer.loadRenderers();
    }, (p_lambda$static$51_0_, p_lambda$static$51_1_) ->
    {
        return p_lambda$static$51_0_.fancyGraphics ? p_lambda$static$51_1_.getDisplayString() + I18n.format("options.graphics.fancy") : p_lambda$static$51_1_.getDisplayString() + I18n.format("options.graphics.fast");
    });
    public static final IteratableOption GUI_SCALE = new IteratableOption("options.guiScale", (p_lambda$static$52_0_, p_lambda$static$52_1_) ->
    {
        p_lambda$static$52_0_.guiScale = MathHelper.normalizeAngle(p_lambda$static$52_0_.guiScale + p_lambda$static$52_1_, Minecraft.getInstance().getMainWindow().calcGuiScale(0, Minecraft.getInstance().getForceUnicodeFont()) + 1);
    }, (p_lambda$static$53_0_, p_lambda$static$53_1_) ->
    {
        return p_lambda$static$53_1_.getDisplayString() + (p_lambda$static$53_0_.guiScale == 0 ? I18n.format("options.guiScale.auto") : p_lambda$static$53_0_.guiScale);
    });
    public static final IteratableOption MAIN_HAND = new IteratableOption("options.mainHand", (p_lambda$static$54_0_, p_lambda$static$54_1_) ->
    {
        p_lambda$static$54_0_.mainHand = p_lambda$static$54_0_.mainHand.opposite();
    }, (p_lambda$static$55_0_, p_lambda$static$55_1_) ->
    {
        return p_lambda$static$55_1_.getDisplayString() + p_lambda$static$55_0_.mainHand;
    });
    public static final IteratableOption NARRATOR = new IteratableOption("options.narrator", (p_lambda$static$56_0_, p_lambda$static$56_1_) ->
    {
        if (NarratorChatListener.INSTANCE.isActive())
        {
            p_lambda$static$56_0_.narrator = NarratorStatus.byId(p_lambda$static$56_0_.narrator.getId() + p_lambda$static$56_1_);
        }
        else {
            p_lambda$static$56_0_.narrator = NarratorStatus.OFF;
        }

        NarratorChatListener.INSTANCE.announceMode(p_lambda$static$56_0_.narrator);
    }, (p_lambda$static$57_0_, p_lambda$static$57_1_) ->
    {
        return NarratorChatListener.INSTANCE.isActive() ? p_lambda$static$57_1_.getDisplayString() + I18n.format(p_lambda$static$57_0_.narrator.getResourceKey()) : p_lambda$static$57_1_.getDisplayString() + I18n.format("options.narrator.notavailable");
    });
    public static final IteratableOption PARTICLES = new IteratableOption("options.particles", (p_lambda$static$58_0_, p_lambda$static$58_1_) ->
    {
        p_lambda$static$58_0_.particles = ParticleStatus.byId(p_lambda$static$58_0_.particles.getId() + p_lambda$static$58_1_);
    }, (p_lambda$static$59_0_, p_lambda$static$59_1_) ->
    {
        return p_lambda$static$59_1_.getDisplayString() + I18n.format(p_lambda$static$59_0_.particles.getResourceKey());
    });
    public static final IteratableOption RENDER_CLOUDS = new IteratableOption("options.renderClouds", (p_lambda$static$60_0_, p_lambda$static$60_1_) ->
    {
        p_lambda$static$60_0_.cloudOption = CloudOption.byId(p_lambda$static$60_0_.cloudOption.getId() + p_lambda$static$60_1_);
    }, (p_lambda$static$61_0_, p_lambda$static$61_1_) ->
    {
        return p_lambda$static$61_1_.getDisplayString() + I18n.format(p_lambda$static$61_0_.cloudOption.getKey());
    });
    public static final IteratableOption ACCESSIBILITY_TEXT_BACKGROUND = new IteratableOption("options.accessibility.text_background", (p_lambda$static$62_0_, p_lambda$static$62_1_) ->
    {
        p_lambda$static$62_0_.accessibilityTextBackground = !p_lambda$static$62_0_.accessibilityTextBackground;
    }, (p_lambda$static$63_0_, p_lambda$static$63_1_) ->
    {
        return p_lambda$static$63_1_.getDisplayString() + I18n.format(p_lambda$static$63_0_.accessibilityTextBackground ? "options.accessibility.text_background.chat" : "options.accessibility.text_background.everywhere");
    });
    public static final BooleanOption AUTO_JUMP = new BooleanOption("options.autoJump", (p_lambda$static$64_0_) ->
    {
        return p_lambda$static$64_0_.autoJump;
    }, (p_lambda$static$65_0_, p_lambda$static$65_1_) ->
    {
        p_lambda$static$65_0_.autoJump = p_lambda$static$65_1_;
    });
    public static final BooleanOption AUTO_SUGGEST_COMMANDS = new BooleanOption("options.autoSuggestCommands", (p_lambda$static$66_0_) ->
    {
        return p_lambda$static$66_0_.autoSuggestCommands;
    }, (p_lambda$static$67_0_, p_lambda$static$67_1_) ->
    {
        p_lambda$static$67_0_.autoSuggestCommands = p_lambda$static$67_1_;
    });
    public static final BooleanOption CHAT_COLOR = new BooleanOption("options.chat.color", (p_lambda$static$68_0_) ->
    {
        return p_lambda$static$68_0_.chatColor;
    }, (p_lambda$static$69_0_, p_lambda$static$69_1_) ->
    {
        p_lambda$static$69_0_.chatColor = p_lambda$static$69_1_;
    });
    public static final BooleanOption CHAT_LINKS = new BooleanOption("options.chat.links", (p_lambda$static$70_0_) ->
    {
        return p_lambda$static$70_0_.chatLinks;
    }, (p_lambda$static$71_0_, p_lambda$static$71_1_) ->
    {
        p_lambda$static$71_0_.chatLinks = p_lambda$static$71_1_;
    });
    public static final BooleanOption CHAT_LINKS_PROMPT = new BooleanOption("options.chat.links.prompt", (p_lambda$static$72_0_) ->
    {
        return p_lambda$static$72_0_.chatLinksPrompt;
    }, (p_lambda$static$73_0_, p_lambda$static$73_1_) ->
    {
        p_lambda$static$73_0_.chatLinksPrompt = p_lambda$static$73_1_;
    });
    public static final BooleanOption DISCRETE_MOUSE_SCROLL = new BooleanOption("options.discrete_mouse_scroll", (p_lambda$static$74_0_) ->
    {
        return p_lambda$static$74_0_.discreteMouseScroll;
    }, (p_lambda$static$75_0_, p_lambda$static$75_1_) ->
    {
        p_lambda$static$75_0_.discreteMouseScroll = p_lambda$static$75_1_;
    });
    public static final BooleanOption VSYNC = new BooleanOption("options.vsync", (p_lambda$static$76_0_) ->
    {
        return p_lambda$static$76_0_.vsync;
    }, (p_lambda$static$77_0_, p_lambda$static$77_1_) ->
    {
        p_lambda$static$77_0_.vsync = p_lambda$static$77_1_;

        if (Minecraft.getInstance().getMainWindow() != null)
        {
            Minecraft.getInstance().getMainWindow().setVsync(p_lambda$static$77_0_.vsync);
        }
    });
    public static final BooleanOption ENTITY_SHADOWS = new BooleanOption("options.entityShadows", (p_lambda$static$78_0_) ->
    {
        return p_lambda$static$78_0_.entityShadows;
    }, (p_lambda$static$79_0_, p_lambda$static$79_1_) ->
    {
        p_lambda$static$79_0_.entityShadows = p_lambda$static$79_1_;
    });
    public static final BooleanOption FORCE_UNICODE_FONT = new BooleanOption("options.forceUnicodeFont", (p_lambda$static$80_0_) ->
    {
        return p_lambda$static$80_0_.forceUnicodeFont;
    }, (p_lambda$static$81_0_, p_lambda$static$81_1_) ->
    {
        p_lambda$static$81_0_.forceUnicodeFont = p_lambda$static$81_1_;
        Minecraft minecraft = Minecraft.getInstance();

        if (minecraft.getFontResourceManager() != null)
        {
            minecraft.getFontResourceManager().setForceUnicodeFont(p_lambda$static$81_0_.forceUnicodeFont, Util.getServerExecutor(), minecraft);
        }
    });
    public static final BooleanOption INVERT_MOUSE = new BooleanOption("options.invertMouse", (p_lambda$static$82_0_) ->
    {
        return p_lambda$static$82_0_.invertMouse;
    }, (p_lambda$static$83_0_, p_lambda$static$83_1_) ->
    {
        p_lambda$static$83_0_.invertMouse = p_lambda$static$83_1_;
    });
    public static final BooleanOption REALMS_NOTIFICATIONS = new BooleanOption("options.realmsNotifications", (p_lambda$static$84_0_) ->
    {
        return p_lambda$static$84_0_.realmsNotifications;
    }, (p_lambda$static$85_0_, p_lambda$static$85_1_) ->
    {
        p_lambda$static$85_0_.realmsNotifications = p_lambda$static$85_1_;
    });
    public static final BooleanOption REDUCED_DEBUG_INFO = new BooleanOption("options.reducedDebugInfo", (p_lambda$static$86_0_) ->
    {
        return p_lambda$static$86_0_.reducedDebugInfo;
    }, (p_lambda$static$87_0_, p_lambda$static$87_1_) ->
    {
        p_lambda$static$87_0_.reducedDebugInfo = p_lambda$static$87_1_;
    });
    public static final BooleanOption SHOW_SUBTITLES = new BooleanOption("options.showSubtitles", (p_lambda$static$88_0_) ->
    {
        return p_lambda$static$88_0_.showSubtitles;
    }, (p_lambda$static$89_0_, p_lambda$static$89_1_) ->
    {
        p_lambda$static$89_0_.showSubtitles = p_lambda$static$89_1_;
    });
    public static final BooleanOption SNOOPER = new BooleanOption("options.snooper", (p_lambda$static$90_0_) ->
    {
        if (p_lambda$static$90_0_.snooper)
        {
            ;
        }

        return false;
    }, (p_lambda$static$91_0_, p_lambda$static$91_1_) ->
    {
        p_lambda$static$91_0_.snooper = p_lambda$static$91_1_;
    });
    public static final IteratableOption SNEAK = new IteratableOption("key.sneak", (p_lambda$static$92_0_, p_lambda$static$92_1_) ->
    {
        p_lambda$static$92_0_.toggleCrouch = !p_lambda$static$92_0_.toggleCrouch;
    }, (p_lambda$static$93_0_, p_lambda$static$93_1_) ->
    {
        return p_lambda$static$93_1_.getDisplayString() + I18n.format(p_lambda$static$93_0_.toggleCrouch ? "options.key.toggle" : "options.key.hold");
    });
    public static final IteratableOption SPRINT = new IteratableOption("key.sprint", (p_lambda$static$94_0_, p_lambda$static$94_1_) ->
    {
        p_lambda$static$94_0_.toggleSprint = !p_lambda$static$94_0_.toggleSprint;
    }, (p_lambda$static$95_0_, p_lambda$static$95_1_) ->
    {
        return p_lambda$static$95_1_.getDisplayString() + I18n.format(p_lambda$static$95_0_.toggleSprint ? "options.key.toggle" : "options.key.hold");
    });
    public static final BooleanOption TOUCHSCREEN = new BooleanOption("options.touchscreen", (p_lambda$static$96_0_) ->
    {
        return p_lambda$static$96_0_.touchscreen;
    }, (p_lambda$static$97_0_, p_lambda$static$97_1_) ->
    {
        p_lambda$static$97_0_.touchscreen = p_lambda$static$97_1_;
    });
    public static final BooleanOption FULLSCREEN = new BooleanOption("options.fullscreen", (p_lambda$static$98_0_) ->
    {
        return p_lambda$static$98_0_.fullscreen;
    }, (p_lambda$static$99_0_, p_lambda$static$99_1_) ->
    {
        p_lambda$static$99_0_.fullscreen = p_lambda$static$99_1_;
        Minecraft minecraft = Minecraft.getInstance();

        if (minecraft.getMainWindow() != null && minecraft.getMainWindow().isFullscreen() != p_lambda$static$99_0_.fullscreen)
        {
            minecraft.getMainWindow().toggleFullscreen();
            p_lambda$static$99_0_.fullscreen = minecraft.getMainWindow().isFullscreen();
        }
    });
    public static final BooleanOption VIEW_BOBBING = new BooleanOption("options.viewBobbing", (p_lambda$static$100_0_) ->
    {
        return p_lambda$static$100_0_.viewBobbing;
    }, (p_lambda$static$101_0_, p_lambda$static$101_1_) ->
    {
        p_lambda$static$101_0_.viewBobbing = p_lambda$static$101_1_;
    });
    private final String translationKey;
    public static final IteratableOption FOG_FANCY = new IteratableOptionOF("of.options.FOG_FANCY");
    public static final IteratableOption FOG_START = new IteratableOptionOF("of.options.FOG_START");
    public static final SliderPercentageOption MIPMAP_TYPE = new SliderPercentageOptionOF("of.options.MIPMAP_TYPE", 0.0D, 3.0D, 1.0F);
    public static final IteratableOption SMOOTH_FPS = new IteratableOptionOF("of.options.SMOOTH_FPS");
    public static final IteratableOption CLOUDS = new IteratableOptionOF("of.options.CLOUDS");
    public static final SliderPercentageOption CLOUD_HEIGHT = new SliderPercentageOptionOF("of.options.CLOUD_HEIGHT");
    public static final IteratableOption TREES = new IteratableOptionOF("of.options.TREES");
    public static final IteratableOption RAIN = new IteratableOptionOF("of.options.RAIN");
    public static final IteratableOption ANIMATED_WATER = new IteratableOptionOF("of.options.ANIMATED_WATER");
    public static final IteratableOption ANIMATED_LAVA = new IteratableOptionOF("of.options.ANIMATED_LAVA");
    public static final IteratableOption ANIMATED_FIRE = new IteratableOptionOF("of.options.ANIMATED_FIRE");
    public static final IteratableOption ANIMATED_PORTAL = new IteratableOptionOF("of.options.ANIMATED_PORTAL");
    public static final SliderPercentageOption AO_LEVEL = new SliderPercentageOptionOF("of.options.AO_LEVEL");
    public static final IteratableOption LAGOMETER = new IteratableOptionOF("of.options.LAGOMETER");
    public static final IteratableOption SHOW_FPS = new IteratableOptionOF("of.options.SHOW_FPS");
    public static final IteratableOption AUTOSAVE_TICKS = new IteratableOptionOF("of.options.AUTOSAVE_TICKS");
    public static final IteratableOption BETTER_GRASS = new IteratableOptionOF("of.options.BETTER_GRASS");
    public static final IteratableOption ANIMATED_REDSTONE = new IteratableOptionOF("of.options.ANIMATED_REDSTONE");
    public static final IteratableOption ANIMATED_EXPLOSION = new IteratableOptionOF("of.options.ANIMATED_EXPLOSION");
    public static final IteratableOption ANIMATED_FLAME = new IteratableOptionOF("of.options.ANIMATED_FLAME");
    public static final IteratableOption ANIMATED_SMOKE = new IteratableOptionOF("of.options.ANIMATED_SMOKE");
    public static final IteratableOption WEATHER = new IteratableOptionOF("of.options.WEATHER");
    public static final IteratableOption SKY = new IteratableOptionOF("of.options.SKY");
    public static final IteratableOption STARS = new IteratableOptionOF("of.options.STARS");
    public static final IteratableOption SUN_MOON = new IteratableOptionOF("of.options.SUN_MOON");
    public static final IteratableOption VIGNETTE = new IteratableOptionOF("of.options.VIGNETTE");
    public static final IteratableOption CHUNK_UPDATES = new IteratableOptionOF("of.options.CHUNK_UPDATES");
    public static final IteratableOption CHUNK_UPDATES_DYNAMIC = new IteratableOptionOF("of.options.CHUNK_UPDATES_DYNAMIC");
    public static final IteratableOption TIME = new IteratableOptionOF("of.options.TIME");
    public static final IteratableOption SMOOTH_WORLD = new IteratableOptionOF("of.options.SMOOTH_WORLD");
    public static final IteratableOption VOID_PARTICLES = new IteratableOptionOF("of.options.VOID_PARTICLES");
    public static final IteratableOption WATER_PARTICLES = new IteratableOptionOF("of.options.WATER_PARTICLES");
    public static final IteratableOption RAIN_SPLASH = new IteratableOptionOF("of.options.RAIN_SPLASH");
    public static final IteratableOption PORTAL_PARTICLES = new IteratableOptionOF("of.options.PORTAL_PARTICLES");
    public static final IteratableOption POTION_PARTICLES = new IteratableOptionOF("of.options.POTION_PARTICLES");
    public static final IteratableOption FIREWORK_PARTICLES = new IteratableOptionOF("of.options.FIREWORK_PARTICLES");
    public static final IteratableOption PROFILER = new IteratableOptionOF("of.options.PROFILER");
    public static final IteratableOption DRIPPING_WATER_LAVA = new IteratableOptionOF("of.options.DRIPPING_WATER_LAVA");
    public static final IteratableOption BETTER_SNOW = new IteratableOptionOF("of.options.BETTER_SNOW");
    public static final IteratableOption ANIMATED_TERRAIN = new IteratableOptionOF("of.options.ANIMATED_TERRAIN");
    public static final IteratableOption SWAMP_COLORS = new IteratableOptionOF("of.options.SWAMP_COLORS");
    public static final IteratableOption RANDOM_ENTITIES = new IteratableOptionOF("of.options.RANDOM_ENTITIES");
    public static final IteratableOption SMOOTH_BIOMES = new IteratableOptionOF("of.options.SMOOTH_BIOMES");
    public static final IteratableOption CUSTOM_FONTS = new IteratableOptionOF("of.options.CUSTOM_FONTS");
    public static final IteratableOption CUSTOM_COLORS = new IteratableOptionOF("of.options.CUSTOM_COLORS");
    public static final IteratableOption SHOW_CAPES = new IteratableOptionOF("of.options.SHOW_CAPES");
    public static final IteratableOption CONNECTED_TEXTURES = new IteratableOptionOF("of.options.CONNECTED_TEXTURES");
    public static final IteratableOption CUSTOM_ITEMS = new IteratableOptionOF("of.options.CUSTOM_ITEMS");
    public static final SliderPercentageOption AA_LEVEL = new SliderPercentageOptionOF("of.options.AA_LEVEL", 0.0D, 16.0D, 1.0F);
    public static final SliderPercentageOption AF_LEVEL = new SliderPercentageOptionOF("of.options.AF_LEVEL", 1.0D, 16.0D, 1.0F);
    public static final IteratableOption ANIMATED_TEXTURES = new IteratableOptionOF("of.options.ANIMATED_TEXTURES");
    public static final IteratableOption NATURAL_TEXTURES = new IteratableOptionOF("of.options.NATURAL_TEXTURES");
    public static final IteratableOption EMISSIVE_TEXTURES = new IteratableOptionOF("of.options.EMISSIVE_TEXTURES");
    public static final IteratableOption HELD_ITEM_TOOLTIPS = new IteratableOptionOF("of.options.HELD_ITEM_TOOLTIPS");
    public static final IteratableOption DROPPED_ITEMS = new IteratableOptionOF("of.options.DROPPED_ITEMS");
    public static final IteratableOption LAZY_CHUNK_LOADING = new IteratableOptionOF("of.options.LAZY_CHUNK_LOADING");
    public static final IteratableOption CUSTOM_SKY = new IteratableOptionOF("of.options.CUSTOM_SKY");
    public static final IteratableOption FAST_MATH = new IteratableOptionOF("of.options.FAST_MATH");
    public static final IteratableOption FAST_RENDER = new IteratableOptionOF("of.options.FAST_RENDER");
    public static final IteratableOption TRANSLUCENT_BLOCKS = new IteratableOptionOF("of.options.TRANSLUCENT_BLOCKS");
    public static final IteratableOption DYNAMIC_FOV = new IteratableOptionOF("of.options.DYNAMIC_FOV");
    public static final IteratableOption DYNAMIC_LIGHTS = new IteratableOptionOF("of.options.DYNAMIC_LIGHTS");
    public static final IteratableOption ALTERNATE_BLOCKS = new IteratableOptionOF("of.options.ALTERNATE_BLOCKS");
    public static final IteratableOption CUSTOM_ENTITY_MODELS = new IteratableOptionOF("of.options.CUSTOM_ENTITY_MODELS");
    public static final IteratableOption ADVANCED_TOOLTIPS = new IteratableOptionOF("of.options.ADVANCED_TOOLTIPS");
    public static final IteratableOption SCREENSHOT_SIZE = new IteratableOptionOF("of.options.SCREENSHOT_SIZE");
    public static final IteratableOption CUSTOM_GUIS = new IteratableOptionOF("of.options.CUSTOM_GUIS");
    public static final IteratableOption RENDER_REGIONS = new IteratableOptionOF("of.options.RENDER_REGIONS");
    public static final IteratableOption SHOW_GL_ERRORS = new IteratableOptionOF("of.options.SHOW_GL_ERRORS");
    public static final IteratableOption SMART_ANIMATIONS = new IteratableOptionOF("of.options.SMART_ANIMATIONS");
    public static final IteratableOption CHAT_BACKGROUND = new IteratableOptionOF("of.options.CHAT_BACKGROUND");
    public static final IteratableOption CHAT_SHADOW = new IteratableOptionOF("of.options.CHAT_SHADOW");
    public static final IteratableOption USE_VBO = new IteratableOptionOF("options.vbo");

    public AbstractOption(String p_i115_1_)
    {
        this.translationKey = p_i115_1_;
    }

    public abstract Widget createWidget(GameSettings options, int xIn, int yIn, int widthIn);

    public String getDisplayString()
    {
        return I18n.format(this.translationKey) + ": ";
    }

    public String getResourceKey()
    {
        return this.translationKey;
    }
}
