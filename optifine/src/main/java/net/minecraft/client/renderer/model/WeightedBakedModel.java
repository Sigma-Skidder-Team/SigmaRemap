package net.minecraft.client.renderer.model;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.Direction;
import net.minecraft.util.WeightedRandom;

public class WeightedBakedModel implements IBakedModel
{
    private final int totalWeight;
    private final List<WeightedBakedModel.WeightedModel> models;
    private final IBakedModel baseModel;

    public WeightedBakedModel(List<WeightedBakedModel.WeightedModel> p_i2661_1_)
    {
        this.models = p_i2661_1_;
        this.totalWeight = WeightedRandom.getTotalWeight(p_i2661_1_);
        this.baseModel = (p_i2661_1_.get(0)).model;
    }

    public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, Random rand)
    {
        return (WeightedRandom.getRandomItem(this.models, Math.abs((int)rand.nextLong()) % this.totalWeight)).model.getQuads(state, side, rand);
    }

    public boolean isAmbientOcclusion()
    {
        return this.baseModel.isAmbientOcclusion();
    }

    public boolean isGui3d()
    {
        return this.baseModel.isGui3d();
    }

    public boolean func_230044_c_()
    {
        return this.baseModel.func_230044_c_();
    }

    public boolean isBuiltInRenderer()
    {
        return this.baseModel.isBuiltInRenderer();
    }

    public TextureAtlasSprite getParticleTexture()
    {
        return this.baseModel.getParticleTexture();
    }

    public ItemCameraTransforms getItemCameraTransforms()
    {
        return this.baseModel.getItemCameraTransforms();
    }

    public ItemOverrideList getOverrides()
    {
        return this.baseModel.getOverrides();
    }

    public static class Builder
    {
        private final List<WeightedBakedModel.WeightedModel> listItems = Lists.newArrayList();

        public WeightedBakedModel.Builder add(@Nullable IBakedModel model, int weight)
        {
            if (model != null)
            {
                this.listItems.add(new WeightedBakedModel.WeightedModel(model, weight));
            }

            return this;
        }

        @Nullable
        public IBakedModel build()
        {
            if (this.listItems.isEmpty())
            {
                return null;
            }
            else
            {
                return (IBakedModel)(this.listItems.size() == 1 ? (this.listItems.get(0)).model : new WeightedBakedModel(this.listItems));
            }
        }
    }

    static class WeightedModel extends WeightedRandom.Item
    {
        protected final IBakedModel model;

        public WeightedModel(IBakedModel p_i3794_1_, int p_i3794_2_)
        {
            super(p_i3794_2_);
            this.model = p_i3794_1_;
        }
    }
}
