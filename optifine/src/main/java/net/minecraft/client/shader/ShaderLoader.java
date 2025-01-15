package net.minecraft.client.shader;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import net.minecraft.client.renderer.texture.TextureUtil;
import org.apache.commons.lang3.StringUtils;

public class ShaderLoader
{
    private final ShaderLoader.ShaderType shaderType;
    private final String shaderFilename;
    private final int shader;
    private int shaderAttachCount;

    private ShaderLoader(ShaderLoader.ShaderType p_i2636_1_, int p_i2636_2_, String p_i2636_3_)
    {
        this.shaderType = p_i2636_1_;
        this.shader = p_i2636_2_;
        this.shaderFilename = p_i2636_3_;
    }

    public void attachShader(IShaderManager manager)
    {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        ++this.shaderAttachCount;
        GlStateManager.attachShader(manager.getProgram(), this.shader);
    }

    public void detachShader()
    {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        --this.shaderAttachCount;

        if (this.shaderAttachCount <= 0)
        {
            GlStateManager.deleteShader(this.shader);
            this.shaderType.getLoadedShaders().remove(this.shaderFilename);
        }
    }

    public String getShaderFilename()
    {
        return this.shaderFilename;
    }

    public static ShaderLoader func_216534_a(ShaderLoader.ShaderType p_216534_0_, String p_216534_1_, InputStream p_216534_2_) throws IOException
    {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        String s = TextureUtil.readResourceAsString(p_216534_2_);

        if (s == null)
        {
            throw new IOException("Could not load program " + p_216534_0_.getShaderName());
        }
        else
        {
            int i = GlStateManager.createShader(p_216534_0_.getShaderMode());
            GlStateManager.shaderSource(i, s);
            GlStateManager.compileShader(i);

            if (GlStateManager.getShader(i, 35713) == 0)
            {
                String s1 = StringUtils.trim(GlStateManager.getShaderInfoLog(i, 32768));
                throw new IOException("Couldn't compile " + p_216534_0_.getShaderName() + " program: " + s1);
            }
            else
            {
                ShaderLoader shaderloader = new ShaderLoader(p_216534_0_, i, p_216534_1_);
                p_216534_0_.getLoadedShaders().put(p_216534_1_, shaderloader);
                return shaderloader;
            }
        }
    }

    public static enum ShaderType
    {
        VERTEX("vertex", ".vsh", 35633),
        FRAGMENT("fragment", ".fsh", 35632);

        private final String shaderName;
        private final String shaderExtension;
        private final int shaderMode;
        private final Map<String, ShaderLoader> loadedShaders = Maps.newHashMap();

        private ShaderType(String p_i2237_3_, String p_i2237_4_, int p_i2237_5_)
        {
            this.shaderName = p_i2237_3_;
            this.shaderExtension = p_i2237_4_;
            this.shaderMode = p_i2237_5_;
        }

        public String getShaderName()
        {
            return this.shaderName;
        }

        public String getShaderExtension()
        {
            return this.shaderExtension;
        }

        private int getShaderMode()
        {
            return this.shaderMode;
        }

        public Map<String, ShaderLoader> getLoadedShaders()
        {
            return this.loadedShaders;
        }
    }
}
