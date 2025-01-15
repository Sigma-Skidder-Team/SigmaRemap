package net.minecraft.client.renderer.texture;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.resources.IResourceManager;
import net.optifine.Config;
import net.optifine.shaders.ShadersTex;

public class DynamicTexture extends Texture implements AutoCloseable
{
    private NativeImage dynamicTextureData;

    public DynamicTexture(NativeImage p_i87_1_)
    {
        this.dynamicTextureData = p_i87_1_;

        if (!RenderSystem.isOnRenderThread())
        {
            RenderSystem.recordRenderCall(() ->
            {
                TextureUtil.prepareImage(this.getGlTextureId(), this.dynamicTextureData.getWidth(), this.dynamicTextureData.getHeight());
                this.updateDynamicTexture();

                if (Config.isShaders())
                {
                    ShadersTex.initDynamicTextureNS(this);
                }
            });
        }
        else
        {
            TextureUtil.prepareImage(this.getGlTextureId(), this.dynamicTextureData.getWidth(), this.dynamicTextureData.getHeight());
            this.updateDynamicTexture();

            if (Config.isShaders())
            {
                ShadersTex.initDynamicTextureNS(this);
            }
        }
    }

    public DynamicTexture(int p_i88_1_, int p_i88_2_, boolean p_i88_3_)
    {
        RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
        this.dynamicTextureData = new NativeImage(p_i88_1_, p_i88_2_, p_i88_3_);
        TextureUtil.prepareImage(this.getGlTextureId(), this.dynamicTextureData.getWidth(), this.dynamicTextureData.getHeight());

        if (Config.isShaders())
        {
            ShadersTex.initDynamicTextureNS(this);
        }
    }

    public void loadTexture(IResourceManager manager) throws IOException
    {
    }

    public void updateDynamicTexture()
    {
        this.bindTexture();
        this.dynamicTextureData.uploadTextureSub(0, 0, 0, false);
    }

    @Nullable
    public NativeImage getTextureData()
    {
        return this.dynamicTextureData;
    }

    public void setTextureData(NativeImage nativeImageIn) throws Exception
    {
        this.dynamicTextureData.close();
        this.dynamicTextureData = nativeImageIn;
    }

    public void close()
    {
        this.dynamicTextureData.close();
        this.deleteGlTexture();
        this.dynamicTextureData = null;
    }
}
