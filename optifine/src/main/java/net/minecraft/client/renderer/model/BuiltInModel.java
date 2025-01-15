package net.minecraft.client.renderer.model;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.Direction;

public class BuiltInModel implements IBakedModel
{
    private final ItemCameraTransforms cameraTransforms;
    private final ItemOverrideList overrides;
    private final TextureAtlasSprite field_217829_c;
    private final boolean field_230184_d_;

    public BuiltInModel(ItemCameraTransforms p_i2674_1_, ItemOverrideList p_i2674_2_, TextureAtlasSprite p_i2674_3_, boolean p_i2674_4_)
    {
        this.cameraTransforms = p_i2674_1_;
        this.overrides = p_i2674_2_;
        this.field_217829_c = p_i2674_3_;
        this.field_230184_d_ = p_i2674_4_;
    }

    public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, Random rand)
    {
        return Collections.emptyList();
    }

    public boolean isAmbientOcclusion()
    {
        return false;
    }

    public boolean isGui3d()
    {
        return true;
    }

    public boolean func_230044_c_()
    {
        return this.field_230184_d_;
    }

    public boolean isBuiltInRenderer()
    {
        return true;
    }

    public TextureAtlasSprite getParticleTexture()
    {
        return this.field_217829_c;
    }

    public ItemCameraTransforms getItemCameraTransforms()
    {
        return this.cameraTransforms;
    }

    public ItemOverrideList getOverrides()
    {
        return this.overrides;
    }
}
