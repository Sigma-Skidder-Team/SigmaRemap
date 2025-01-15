package net.optifine.shaders.gui;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.Util;
import net.minecraft.util.text.StringTextComponent;
import net.optifine.Config;
import net.optifine.Lang;
import net.optifine.gui.GuiButtonOF;
import net.optifine.gui.GuiScreenOF;
import net.optifine.gui.TooltipManager;
import net.optifine.gui.TooltipProviderEnumShaderOptions;
import net.optifine.shaders.Shaders;
import net.optifine.shaders.ShadersTex;
import net.optifine.shaders.config.EnumShaderOption;

public class GuiShaders extends GuiScreenOF
{
    protected Screen parentGui;
    private TooltipManager tooltipManager = new TooltipManager(this, new TooltipProviderEnumShaderOptions());
    private int updateTimer = -1;
    private GuiSlotShaders shaderList;
    private boolean saved = false;
    private static float[] QUALITY_MULTIPLIERS = new float[] {0.5F, 0.70710677F, 1.0F, 1.4142135F, 2.0F};
    private static String[] QUALITY_MULTIPLIER_NAMES = new String[] {"0.5x", "0.7x", "1x", "1.5x", "2x"};
    private static float[] HAND_DEPTH_VALUES = new float[] {0.0625F, 0.125F, 0.25F};
    private static String[] HAND_DEPTH_NAMES = new String[] {"0.5x", "1x", "2x"};
    public static final int EnumOS_UNKNOWN = 0;
    public static final int EnumOS_WINDOWS = 1;
    public static final int EnumOS_OSX = 2;
    public static final int EnumOS_SOLARIS = 3;
    public static final int EnumOS_LINUX = 4;

    public GuiShaders(Screen par1GuiScreen, GameSettings par2GameSettings)
    {
        super(new StringTextComponent(I18n.format("of.options.shadersTitle")));
        this.parentGui = par1GuiScreen;
    }

    public void init()
    {
        if (Shaders.shadersConfig == null)
        {
            Shaders.loadConfig();
        }

        int i = 120;
        int j = 20;
        int k = this.width - i - 10;
        int l = 30;
        int i1 = 20;
        int j1 = this.width - i - 20;
        this.shaderList = new GuiSlotShaders(this, j1, this.height, l, this.height - 50, 16);
        this.children.add(this.shaderList);
        this.addButton(new GuiButtonEnumShaderOption(EnumShaderOption.ANTIALIASING, k, 0 * i1 + l, i, j));
        this.addButton(new GuiButtonEnumShaderOption(EnumShaderOption.NORMAL_MAP, k, 1 * i1 + l, i, j));
        this.addButton(new GuiButtonEnumShaderOption(EnumShaderOption.SPECULAR_MAP, k, 2 * i1 + l, i, j));
        this.addButton(new GuiButtonEnumShaderOption(EnumShaderOption.RENDER_RES_MUL, k, 3 * i1 + l, i, j));
        this.addButton(new GuiButtonEnumShaderOption(EnumShaderOption.SHADOW_RES_MUL, k, 4 * i1 + l, i, j));
        this.addButton(new GuiButtonEnumShaderOption(EnumShaderOption.HAND_DEPTH_MUL, k, 5 * i1 + l, i, j));
        this.addButton(new GuiButtonEnumShaderOption(EnumShaderOption.OLD_HAND_LIGHT, k, 6 * i1 + l, i, j));
        this.addButton(new GuiButtonEnumShaderOption(EnumShaderOption.OLD_LIGHTING, k, 7 * i1 + l, i, j));
        int k1 = Math.min(150, j1 / 2 - 10);
        int l1 = j1 / 4 - k1 / 2;
        int i2 = this.height - 25;
        this.addButton(new GuiButtonOF(201, l1, i2, k1 - 22 + 1, j, Lang.get("of.options.shaders.shadersFolder")));
        this.addButton(new GuiButtonDownloadShaders(210, l1 + k1 - 22 - 1, i2));
        this.addButton(new GuiButtonOF(202, j1 / 4 * 3 - k1 / 2, this.height - 25, k1, j, I18n.format("gui.done")));
        this.addButton(new GuiButtonOF(203, k, this.height - 25, i, j, Lang.get("of.options.shaders.shaderOptions")));
        this.setFocused(this.shaderList);
        this.updateButtons();
    }

    public void updateButtons()
    {
        boolean flag = Config.isShaders();

        for (Widget widget : this.buttonList)
        {
            if (widget instanceof GuiButtonOF)
            {
                GuiButtonOF guibuttonof = (GuiButtonOF)widget;

                if (guibuttonof.id != 201 && guibuttonof.id != 202 && guibuttonof.id != 210 && guibuttonof.id != EnumShaderOption.ANTIALIASING.ordinal())
                {
                    guibuttonof.active = flag;
                }
            }
        }
    }

    protected void actionPerformed(Widget guiElement)
    {
        if (guiElement.active)
        {
            if (!(guiElement instanceof GuiButtonEnumShaderOption))
            {
                if (guiElement instanceof GuiButtonOF)
                {
                    GuiButtonOF guibuttonof = (GuiButtonOF)guiElement;

                    switch (guibuttonof.id)
                    {
                        case 201:
                            switch (getOSType())
                            {
                                case 1:
                                    String s = String.format("cmd.exe /C start \"Open file\" \"%s\"", Shaders.shaderPacksDir.getAbsolutePath());

                                    try
                                    {
                                        Runtime.getRuntime().exec(s);
                                        return;
                                    }
                                    catch (IOException ioexception)
                                    {
                                        ioexception.printStackTrace();
                                        break;
                                    }

                                case 2:
                                    try
                                    {
                                        Runtime.getRuntime().exec(new String[] {"/usr/bin/open", Shaders.shaderPacksDir.getAbsolutePath()});
                                        return;
                                    }
                                    catch (IOException ioexception1)
                                    {
                                        ioexception1.printStackTrace();
                                    }
                            }

                            boolean flag = false;

                            try
                            {
                                URI uri = (new File(this.minecraft.gameDir, "shaderpacks")).toURI();
                                Util.getOSType().openURI(uri);
                            }
                            catch (Throwable throwable1)
                            {
                                throwable1.printStackTrace();
                                flag = true;
                            }

                            if (flag)
                            {
                                Config.dbg("Opening via system class!");
                                Util.getOSType().openURI("file://" + Shaders.shaderPacksDir.getAbsolutePath());
                            }

                            break;

                        case 202:
                            Shaders.storeConfig();
                            this.saved = true;
                            this.minecraft.displayGuiScreen(this.parentGui);
                            break;

                        case 203:
                            GuiShaderOptions guishaderoptions = new GuiShaderOptions(this, Config.getGameSettings());
                            Config.getMinecraft().displayGuiScreen(guishaderoptions);

                        case 204:
                        case 205:
                        case 206:
                        case 207:
                        case 208:
                        case 209:
                        default:
                            break;

                        case 210:
                            try
                            {
                                URI uri1 = new URI("http://optifine.net/shaderPacks");
                                Util.getOSType().openURI(uri1);
                            }
                            catch (Throwable throwable)
                            {
                                throwable.printStackTrace();
                            }
                    }
                }
            }
            else
            {
                GuiButtonEnumShaderOption guibuttonenumshaderoption = (GuiButtonEnumShaderOption)guiElement;

                switch (guibuttonenumshaderoption.getEnumShaderOption())
                {
                    case ANTIALIASING:
                        Shaders.nextAntialiasingLevel();
                        Shaders.uninit();
                        break;

                    case NORMAL_MAP:
                        Shaders.configNormalMap = !Shaders.configNormalMap;
                        Shaders.uninit();
                        this.minecraft.scheduleResourcesRefresh();
                        break;

                    case SPECULAR_MAP:
                        Shaders.configSpecularMap = !Shaders.configSpecularMap;
                        Shaders.uninit();
                        this.minecraft.scheduleResourcesRefresh();
                        break;

                    case RENDER_RES_MUL:
                        float f2 = Shaders.configRenderResMul;
                        float[] afloat2 = QUALITY_MULTIPLIERS;
                        String[] astring2 = QUALITY_MULTIPLIER_NAMES;
                        int k = getValueIndex(f2, afloat2);

                        if (hasShiftDown())
                        {
                            --k;

                            if (k < 0)
                            {
                                k = afloat2.length - 1;
                            }
                        }
                        else
                        {
                            ++k;

                            if (k >= afloat2.length)
                            {
                                k = 0;
                            }
                        }

                        Shaders.configRenderResMul = afloat2[k];
                        Shaders.uninit();
                        Shaders.scheduleResize();
                        break;

                    case SHADOW_RES_MUL:
                        float f1 = Shaders.configShadowResMul;
                        float[] afloat1 = QUALITY_MULTIPLIERS;
                        String[] astring1 = QUALITY_MULTIPLIER_NAMES;
                        int j = getValueIndex(f1, afloat1);

                        if (hasShiftDown())
                        {
                            --j;

                            if (j < 0)
                            {
                                j = afloat1.length - 1;
                            }
                        }
                        else
                        {
                            ++j;

                            if (j >= afloat1.length)
                            {
                                j = 0;
                            }
                        }

                        Shaders.configShadowResMul = afloat1[j];
                        Shaders.uninit();
                        Shaders.scheduleResizeShadow();
                        break;

                    case HAND_DEPTH_MUL:
                        float f = Shaders.configHandDepthMul;
                        float[] afloat = HAND_DEPTH_VALUES;
                        String[] astring = HAND_DEPTH_NAMES;
                        int i = getValueIndex(f, afloat);

                        if (hasShiftDown())
                        {
                            --i;

                            if (i < 0)
                            {
                                i = afloat.length - 1;
                            }
                        }
                        else
                        {
                            ++i;

                            if (i >= afloat.length)
                            {
                                i = 0;
                            }
                        }

                        Shaders.configHandDepthMul = afloat[i];
                        Shaders.uninit();
                        break;

                    case OLD_HAND_LIGHT:
                        Shaders.configOldHandLight.nextValue();
                        Shaders.uninit();
                        break;

                    case OLD_LIGHTING:
                        Shaders.configOldLighting.nextValue();
                        Shaders.updateBlockLightLevel();
                        Shaders.uninit();
                        this.minecraft.scheduleResourcesRefresh();
                        break;

                    case TWEAK_BLOCK_DAMAGE:
                        Shaders.configTweakBlockDamage = !Shaders.configTweakBlockDamage;
                        break;

                    case CLOUD_SHADOW:
                        Shaders.configCloudShadow = !Shaders.configCloudShadow;
                        break;

                    case TEX_MIN_FIL_B:
                        Shaders.configTexMinFilB = (Shaders.configTexMinFilB + 1) % 3;
                        Shaders.configTexMinFilN = Shaders.configTexMinFilS = Shaders.configTexMinFilB;
                        guibuttonenumshaderoption.setMessage("Tex Min: " + Shaders.texMinFilDesc[Shaders.configTexMinFilB]);
                        ShadersTex.updateTextureMinMagFilter();
                        break;

                    case TEX_MAG_FIL_N:
                        Shaders.configTexMagFilN = (Shaders.configTexMagFilN + 1) % 2;
                        guibuttonenumshaderoption.setMessage("Tex_n Mag: " + Shaders.texMagFilDesc[Shaders.configTexMagFilN]);
                        ShadersTex.updateTextureMinMagFilter();
                        break;

                    case TEX_MAG_FIL_S:
                        Shaders.configTexMagFilS = (Shaders.configTexMagFilS + 1) % 2;
                        guibuttonenumshaderoption.setMessage("Tex_s Mag: " + Shaders.texMagFilDesc[Shaders.configTexMagFilS]);
                        ShadersTex.updateTextureMinMagFilter();
                        break;

                    case SHADOW_CLIP_FRUSTRUM:
                        Shaders.configShadowClipFrustrum = !Shaders.configShadowClipFrustrum;
                        guibuttonenumshaderoption.setMessage("ShadowClipFrustrum: " + toStringOnOff(Shaders.configShadowClipFrustrum));
                        ShadersTex.updateTextureMinMagFilter();
                }

                guibuttonenumshaderoption.updateButtonText();
            }
        }
    }

    public void removed()
    {
        if (!this.saved)
        {
            Shaders.storeConfig();
            this.saved = true;
        }

        super.removed();
    }

    public void render(int mouseX, int mouseY, float partialTicks)
    {
        this.renderBackground();
        this.shaderList.render(mouseX, mouseY, partialTicks);

        if (this.updateTimer <= 0)
        {
            this.shaderList.updateList();
            this.updateTimer += 20;
        }

        this.drawCenteredString(this.fontRenderer, this.title.getFormattedText(), this.width / 2, 15, 16777215);
        String s = "OpenGL: " + Shaders.glVersionString + ", " + Shaders.glVendorString + ", " + Shaders.glRendererString;
        int i = this.fontRenderer.getStringWidth(s);

        if (i < this.width - 5)
        {
            this.drawCenteredString(this.fontRenderer, s, this.width / 2, this.height - 40, 8421504);
        }
        else
        {
            this.drawString(this.fontRenderer, s, 5, this.height - 40, 8421504);
        }

        super.render(mouseX, mouseY, partialTicks);
        this.tooltipManager.drawTooltips(mouseX, mouseY, this.buttonList);
    }

    public void tick()
    {
        super.tick();
        --this.updateTimer;
    }

    public Minecraft getMc()
    {
        return this.minecraft;
    }

    public void drawCenteredString(String text, int x, int y, int color)
    {
        this.drawCenteredString(this.fontRenderer, text, x, y, color);
    }

    public static String toStringOnOff(boolean value)
    {
        String s = Lang.getOn();
        String s1 = Lang.getOff();
        return value ? s : s1;
    }

    public static String toStringAa(int value)
    {
        if (value == 2)
        {
            return "FXAA 2x";
        }
        else
        {
            return value == 4 ? "FXAA 4x" : Lang.getOff();
        }
    }

    public static String toStringValue(float val, float[] values, String[] names)
    {
        int i = getValueIndex(val, values);
        return names[i];
    }

    public static int getValueIndex(float val, float[] values)
    {
        for (int i = 0; i < values.length; ++i)
        {
            float f = values[i];

            if (f >= val)
            {
                return i;
            }
        }

        return values.length - 1;
    }

    public static String toStringQuality(float val)
    {
        return toStringValue(val, QUALITY_MULTIPLIERS, QUALITY_MULTIPLIER_NAMES);
    }

    public static String toStringHandDepth(float val)
    {
        return toStringValue(val, HAND_DEPTH_VALUES, HAND_DEPTH_NAMES);
    }

    public static int getOSType()
    {
        String s = System.getProperty("os.name").toLowerCase();

        if (s.contains("win"))
        {
            return 1;
        }
        else if (s.contains("mac"))
        {
            return 2;
        }
        else if (s.contains("solaris"))
        {
            return 3;
        }
        else if (s.contains("sunos"))
        {
            return 3;
        }
        else if (s.contains("linux"))
        {
            return 4;
        }
        else
        {
            return s.contains("unix") ? 4 : 0;
        }
    }
}
