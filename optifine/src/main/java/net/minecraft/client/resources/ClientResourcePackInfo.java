package net.minecraft.client.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.resources.IResourcePack;
import net.minecraft.resources.PackCompatibility;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.data.PackMetadataSection;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class ClientResourcePackInfo extends ResourcePackInfo
{
    @Nullable
    private NativeImage field_195809_a;
    @Nullable
    private ResourceLocation field_195810_b;

    public ClientResourcePackInfo(String valueIn, boolean json, Supplier<IResourcePack> p_i1147_3_, IResourcePack p_i1147_4_, PackMetadataSection p_i1147_5_, ResourcePackInfo.Priority p_i1147_6_)
    {
        super(valueIn, json, p_i1147_3_, p_i1147_4_, p_i1147_5_, p_i1147_6_);
        NativeImage nativeimage = null;

        try (InputStream inputstream = p_i1147_4_.getRootResourceStream("pack.png"))
        {
            nativeimage = NativeImage.read(inputstream);
        }
        catch (IllegalArgumentException | IOException var21)
        {
            ;
        }

        this.field_195809_a = nativeimage;
    }

    public ClientResourcePackInfo(String modelSize, boolean p_i1148_2_, Supplier<IResourcePack> p_i1148_3_, ITextComponent p_i1148_4_, ITextComponent p_i1148_5_, PackCompatibility p_i1148_6_, ResourcePackInfo.Priority p_i1148_7_, boolean p_i1148_8_, @Nullable NativeImage p_i1148_9_)
    {
        super(modelSize, p_i1148_2_, p_i1148_3_, p_i1148_4_, p_i1148_5_, p_i1148_6_, p_i1148_7_, p_i1148_8_);
        this.field_195809_a = p_i1148_9_;
    }

    public void func_195808_a(TextureManager p_195808_1_)
    {
        if (this.field_195810_b == null)
        {
            if (this.field_195809_a == null)
            {
                this.field_195810_b = new ResourceLocation("textures/misc/unknown_pack.png");
            }
            else
            {
                this.field_195810_b = p_195808_1_.getDynamicTextureLocation("texturepackicon", new DynamicTexture(this.field_195809_a));
            }
        }

        p_195808_1_.bindTexture(this.field_195810_b);
    }

    public void close()
    {
        super.close();

        if (this.field_195809_a != null)
        {
            this.field_195809_a.close();
            this.field_195809_a = null;
        }
    }
}
