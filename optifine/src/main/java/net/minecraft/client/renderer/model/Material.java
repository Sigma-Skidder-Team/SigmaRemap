package net.minecraft.client.renderer.model;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.ResourceLocation;
import net.optifine.EmissiveTextures;

public class Material
{
    private final ResourceLocation atlasLocation;
    private final ResourceLocation textureLocation;
    @Nullable
    private RenderType renderType;

    public Material(ResourceLocation p_i202_1_, ResourceLocation p_i202_2_)
    {
        this.atlasLocation = p_i202_1_;
        this.textureLocation = p_i202_2_;
    }

    public ResourceLocation getAtlasLocation()
    {
        return this.atlasLocation;
    }

    public ResourceLocation getTextureLocation()
    {
        return this.textureLocation;
    }

    public TextureAtlasSprite getSprite()
    {
        TextureAtlasSprite textureatlassprite = Minecraft.getInstance().getAtlasSpriteGetter(this.getAtlasLocation()).apply(this.getTextureLocation());

        if (EmissiveTextures.isActive())
        {
            textureatlassprite = EmissiveTextures.getEmissiveSprite(textureatlassprite);
        }

        return textureatlassprite;
    }

    public RenderType getRenderType(Function<ResourceLocation, RenderType> renderTypeGetter)
    {
        if (this.renderType == null)
        {
            this.renderType = renderTypeGetter.apply(this.atlasLocation);
        }

        return this.renderType;
    }

    public IVertexBuilder getBuffer(IRenderTypeBuffer bufferIn, Function<ResourceLocation, RenderType> renderTypeGetter)
    {
        TextureAtlasSprite textureatlassprite = this.getSprite();
        RenderType rendertype = this.getRenderType(renderTypeGetter);

        if (textureatlassprite.isSpriteEmissive && rendertype.isEntitySolid())
        {
            rendertype = RenderType.getEntityCutout(this.atlasLocation);
        }

        return textureatlassprite.wrapBuffer(bufferIn.getBuffer(rendertype));
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass())
        {
            Material material = (Material)p_equals_1_;
            return this.atlasLocation.equals(material.atlasLocation) && this.textureLocation.equals(material.textureLocation);
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return Objects.hash(this.atlasLocation, this.textureLocation);
    }

    public String toString()
    {
        return "Material{atlasLocation=" + this.atlasLocation + ", texture=" + this.textureLocation + '}';
    }
}
