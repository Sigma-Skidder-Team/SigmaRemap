package net.minecraft.client.renderer.texture;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.resources.IResource;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;
import net.optifine.reflect.Reflector;
import net.optifine.shaders.ShadersTex;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LayeredTexture extends Texture
{
    private static final Logger LOGGER = LogManager.getLogger();
    public final List<String> layeredTextureNames;
    private IResourceManager resourceManager;
    private String currentPath;

    public LayeredTexture(String... p_i243_1_)
    {
        this.layeredTextureNames = Lists.newArrayList(p_i243_1_);

        if (this.layeredTextureNames.isEmpty())
        {
            throw new IllegalStateException("Layered texture with no layers.");
        }
    }

    public void loadTexture(IResourceManager manager) throws IOException
    {
        this.resourceManager = manager;
        Iterator<String> iterator = this.layeredTextureNames.iterator();
        String s = iterator.next();
        this.currentPath = s;

        try (IResource iresource = manager.getResource(new ResourceLocation(s)))
        {
            NativeImage nativeimage;

            if (Reflector.MinecraftForgeClient_getImageLayer.exists())
            {
                nativeimage = (NativeImage)Reflector.MinecraftForgeClient_getImageLayer.call(new ResourceLocation(s), manager);
            }
            else
            {
                nativeimage = NativeImage.read(iresource.getInputStream());
            }

            while (iterator.hasNext())
            {
                String s1 = iterator.next();

                if (s1 != null)
                {
                    try (
                            IResource iresource1 = manager.getResource(new ResourceLocation(s1));
                            NativeImage nativeimage1 = NativeImage.read(iresource1.getInputStream());
                        )
                    {
                        for (int i = 0; i < nativeimage1.getHeight(); ++i)
                        {
                            for (int j = 0; j < nativeimage1.getWidth(); ++j)
                            {
                                nativeimage.blendPixel(j, i, nativeimage1.getPixelRGBA(j, i));
                            }
                        }
                    }
                }
            }

            if (!RenderSystem.isOnRenderThreadOrInit())
            {
                RenderSystem.recordRenderCall(() ->
                {
                    this.loadImage(nativeimage);
                });
            }
            else
            {
                this.loadImage(nativeimage);
            }
        }
        catch (IOException ioexception1)
        {
            LOGGER.error("Couldn't load layered image", (Throwable)ioexception1);
        }
    }

    private void loadImage(NativeImage imageIn)
    {
        TextureUtil.prepareImage(this.getGlTextureId(), imageIn.getWidth(), imageIn.getHeight());
        imageIn.uploadTextureSub(0, 0, 0, true);

        if (Config.isShaders())
        {
            ShadersTex.loadSimpleTextureNS(this.getGlTextureId(), imageIn, false, false, this.resourceManager, new ResourceLocation(this.currentPath), this.getMultiTexID());
        }
    }
}
