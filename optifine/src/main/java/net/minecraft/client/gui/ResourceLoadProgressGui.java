package net.minecraft.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.resources.data.TextureMetadataSection;
import net.minecraft.resources.IAsyncReloader;
import net.minecraft.resources.IResourceManager;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.resources.VanillaPack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.optifine.Config;
import net.optifine.reflect.Reflector;
import net.optifine.util.PropertiesOrdered;

public class ResourceLoadProgressGui extends LoadingGui
{
    private static final ResourceLocation MOJANG_LOGO_TEXTURE = new ResourceLocation("textures/gui/title/mojang.png");
    private final Minecraft mc;
    private final IAsyncReloader asyncReloader;
    private final Consumer<Optional<Throwable>> completedCallback;
    private final boolean reloading;
    private float progress;
    private long fadeOutStart = -1L;
    private long fadeInStart = -1L;
    private int colorBackground = 16777215;
    private int colorBar = 16777215;
    private int colorOutline = 0;
    private int colorProgress = 14821431;
    private boolean fadeOut = false;

    public ResourceLoadProgressGui(Minecraft p_i153_1_, IAsyncReloader p_i153_2_, Consumer<Optional<Throwable>> p_i153_3_, boolean p_i153_4_)
    {
        this.mc = p_i153_1_;
        this.asyncReloader = p_i153_2_;
        this.completedCallback = p_i153_3_;
        this.reloading = false;
    }

    public static void loadLogoTexture(Minecraft mc)
    {
        mc.getTextureManager().loadTexture(MOJANG_LOGO_TEXTURE, new ResourceLoadProgressGui.MojangLogoTexture());
    }

    public void render(int p_render_1_, int p_render_2_, float p_render_3_)
    {
        int i = this.mc.getMainWindow().getScaledWidth();
        int j = this.mc.getMainWindow().getScaledHeight();
        long k = Util.milliTime();

        if (this.reloading && (this.asyncReloader.asyncPartDone() || this.mc.currentScreen != null) && this.fadeInStart == -1L)
        {
            this.fadeInStart = k;
        }

        float f = this.fadeOutStart > -1L ? (float)(k - this.fadeOutStart) / 1000.0F : -1.0F;
        float f1 = this.fadeInStart > -1L ? (float)(k - this.fadeInStart) / 500.0F : -1.0F;
        float f2;

        if (f >= 1.0F)
        {
            this.fadeOut = true;

            if (this.mc.currentScreen != null)
            {
                this.mc.currentScreen.render(0, 0, p_render_3_);
            }

            int l = MathHelper.ceil((1.0F - MathHelper.clamp(f - 1.0F, 0.0F, 1.0F)) * 255.0F);
            fill(0, 0, i, j, this.colorBackground | l << 24);
            f2 = 1.0F - MathHelper.clamp(f - 1.0F, 0.0F, 1.0F);
        }
        else if (this.reloading)
        {
            if (this.mc.currentScreen != null && f1 < 1.0F)
            {
                this.mc.currentScreen.render(p_render_1_, p_render_2_, p_render_3_);
            }

            int j1 = MathHelper.ceil(MathHelper.clamp((double)f1, 0.15D, 1.0D) * 255.0D);
            fill(0, 0, i, j, this.colorBackground | j1 << 24);
            f2 = MathHelper.clamp(f1, 0.0F, 1.0F);
        }
        else
        {
            fill(0, 0, i, j, this.colorBackground | -16777216);
            f2 = 1.0F;
        }

        int k1 = (this.mc.getMainWindow().getScaledWidth() - 256) / 2;
        int i1 = (this.mc.getMainWindow().getScaledHeight() - 256) / 2;
        this.mc.getTextureManager().bindTexture(MOJANG_LOGO_TEXTURE);
        RenderSystem.enableBlend();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, f2);
        this.blit(k1, i1, 0, 0, 256, 256);
        float f3 = this.asyncReloader.estimateExecutionSpeed();
        this.progress = MathHelper.clamp(this.progress * 0.95F + f3 * 0.050000012F, 0.0F, 1.0F);
        Reflector.ClientModLoader_renderProgressText.call();

        if (f < 1.0F)
        {
            this.renderProgressBar(i / 2 - 150, j / 4 * 3, i / 2 + 150, j / 4 * 3 + 10, 1.0F - MathHelper.clamp(f, 0.0F, 1.0F));
        }

        if (f >= 2.0F)
        {
            this.mc.setLoadingGui((LoadingGui)null);
        }

        if (this.fadeOutStart == -1L && this.asyncReloader.fullyDone() && (!this.reloading || f1 >= 2.0F))
        {
            this.fadeOutStart = Util.milliTime();

            try
            {
                this.asyncReloader.join();
                this.completedCallback.accept(Optional.empty());
            }
            catch (Throwable throwable)
            {
                this.completedCallback.accept(Optional.of(throwable));
            }

            if (this.mc.currentScreen != null)
            {
                this.mc.currentScreen.init(this.mc, this.mc.getMainWindow().getScaledWidth(), this.mc.getMainWindow().getScaledHeight());
            }
        }
    }

    private void renderProgressBar(int p_228181_1_, int p_228181_2_, int p_228181_3_, int p_228181_4_, float p_228181_5_)
    {
        int i = MathHelper.ceil((float)(p_228181_3_ - p_228181_1_ - 1) * this.progress);
        float f = (float)(this.colorBackground >> 16 & 255);
        float f1 = (float)(this.colorBackground >> 8 & 255);
        float f2 = (float)(this.colorBackground & 255);
        float f3 = (float)(this.colorOutline >> 16 & 255);
        float f4 = (float)(this.colorOutline >> 8 & 255);
        float f5 = (float)(this.colorOutline & 255);
        fill(p_228181_1_ - 1, p_228181_2_ - 1, p_228181_3_ + 1, p_228181_4_ + 1, -16777216 | (int)MathHelper.lerp(1.0F - p_228181_5_, f3, f) << 16 | (int)MathHelper.lerp(1.0F - p_228181_5_, f4, f1) << 8 | (int)MathHelper.lerp(1.0F - p_228181_5_, f5, f2));
        fill(p_228181_1_, p_228181_2_, p_228181_3_, p_228181_4_, this.colorBar | -16777216);
        int j = this.colorProgress >> 16 & 255;
        int k = this.colorProgress >> 8 & 255;
        int l = this.colorProgress & 255;
        fill(p_228181_1_ + 1, p_228181_2_ + 1, p_228181_1_ + i, p_228181_4_ - 1, -16777216 | (int)MathHelper.lerp(1.0F - p_228181_5_, (float)j, f) << 16 | (int)MathHelper.lerp(1.0F - p_228181_5_, (float)k, f1) << 8 | (int)MathHelper.lerp(1.0F - p_228181_5_, (float)l, f2));
    }

    public boolean isPauseScreen()
    {
        return true;
    }

    public void update()
    {
        this.colorBackground = 16777215;
        this.colorBar = 16777215;
        this.colorProgress = 14821431;

        if (Config.isCustomColors())
        {
            try
            {
                String s = "optifine/color.properties";
                ResourceLocation resourcelocation = new ResourceLocation(s);

                if (!Config.hasResource(resourcelocation))
                {
                    return;
                }

                InputStream inputstream = Config.getResourceStream(resourcelocation);
                Config.dbg("Loading " + s);
                Properties properties = new PropertiesOrdered();
                properties.load(inputstream);
                inputstream.close();
                this.colorBackground = readColor(properties, "screen.loading", this.colorBackground);
                this.colorOutline = readColor(properties, "screen.loading.outline", this.colorOutline);
                this.colorBar = readColor(properties, "screen.loading.bar", this.colorBar);
                this.colorProgress = readColor(properties, "screen.loading.progress", this.colorProgress);
            }
            catch (Exception exception)
            {
                Config.warn("" + exception.getClass().getName() + ": " + exception.getMessage());
            }
        }
    }

    private static int readColor(Properties p_readColor_0_, String p_readColor_1_, int p_readColor_2_)
    {
        String s = p_readColor_0_.getProperty(p_readColor_1_);

        if (s == null)
        {
            return p_readColor_2_;
        }
        else
        {
            s = s.trim();
            int i = parseColor(s, p_readColor_2_);

            if (i < 0)
            {
                Config.warn("Invalid color: " + p_readColor_1_ + " = " + s);
                return i;
            }
            else
            {
                Config.dbg(p_readColor_1_ + " = " + s);
                return i;
            }
        }
    }

    private static int parseColor(String p_parseColor_0_, int p_parseColor_1_)
    {
        if (p_parseColor_0_ == null)
        {
            return p_parseColor_1_;
        }
        else
        {
            p_parseColor_0_ = p_parseColor_0_.trim();

            try
            {
                int i = Integer.parseInt(p_parseColor_0_, 16) & 16777215;
                return i;
            }
            catch (NumberFormatException var3)
            {
                return p_parseColor_1_;
            }
        }
    }

    public boolean isFadeOut()
    {
        return this.fadeOut;
    }

    static class MojangLogoTexture extends SimpleTexture
    {
        public MojangLogoTexture()
        {
            super(ResourceLoadProgressGui.MOJANG_LOGO_TEXTURE);
        }

        protected SimpleTexture.TextureData getTextureData(IResourceManager resourceManager)
        {
            Minecraft minecraft = Minecraft.getInstance();
            VanillaPack vanillapack = minecraft.getPackFinder().getVanillaPack();

            try (InputStream inputstream = vanillapack.getResourceStream(ResourcePackType.CLIENT_RESOURCES, ResourceLoadProgressGui.MOJANG_LOGO_TEXTURE))
            {
                SimpleTexture.TextureData simpletexture$texturedata = new SimpleTexture.TextureData((TextureMetadataSection)null, NativeImage.read(inputstream));
                return simpletexture$texturedata;
            }
            catch (IOException ioexception1)
            {
                return new SimpleTexture.TextureData(ioexception1);
            }
        }
    }
}
