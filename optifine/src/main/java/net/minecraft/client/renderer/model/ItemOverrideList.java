package net.minecraft.client.renderer.model;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.optifine.Config;
import net.optifine.ItemOverrideCache;

public class ItemOverrideList
{
    public static final ItemOverrideList EMPTY = new ItemOverrideList();
    private final List<ItemOverride> overrides = Lists.newArrayList();
    private final List<IBakedModel> overrideBakedModels;
    private ItemOverrideCache itemOverrideCache;
    public static ResourceLocation lastModelLocation = null;

    private ItemOverrideList()
    {
        this.overrideBakedModels = Collections.emptyList();
    }

    public ItemOverrideList(ModelBakery p_i204_1_, BlockModel p_i204_2_, Function<ResourceLocation, IUnbakedModel> p_i204_3_, List<ItemOverride> p_i204_4_)
    {
        this(p_i204_1_, p_i204_2_, p_i204_3_, p_i204_1_.getSpriteMap()::getSprite, p_i204_4_);
    }

    public ItemOverrideList(ModelBakery p_i205_1_, IUnbakedModel p_i205_2_, Function<ResourceLocation, IUnbakedModel> p_i205_3_, Function<Material, TextureAtlasSprite> p_i205_4_, List<ItemOverride> p_i205_5_)
    {
        this.overrideBakedModels = p_i205_5_.stream().map((p_lambda$new$0_4_) ->
        {
            IUnbakedModel iunbakedmodel = p_i205_3_.apply(p_lambda$new$0_4_.getLocation());
            return Objects.equals(iunbakedmodel, p_i205_2_) ? null : p_i205_1_.getBakedModel(p_lambda$new$0_4_.getLocation(), ModelRotation.X0_Y0, p_i205_4_);
        }).collect(Collectors.toList());
        Collections.reverse(this.overrideBakedModels);

        for (int i = p_i205_5_.size() - 1; i >= 0; --i)
        {
            this.overrides.add(p_i205_5_.get(i));
        }

        if (this.overrides.size() > 65)
        {
            this.itemOverrideCache = ItemOverrideCache.make(this.overrides);
        }
    }

    @Nullable
    public IBakedModel getModelWithOverrides(IBakedModel model, ItemStack stack, @Nullable World worldIn, @Nullable LivingEntity entityIn)
    {
        boolean flag = Config.isCustomItems();

        if (flag)
        {
            lastModelLocation = null;
        }

        if (!this.overrides.isEmpty())
        {
            if (this.itemOverrideCache != null)
            {
                Integer integer = this.itemOverrideCache.getModelIndex(stack, worldIn, entityIn);

                if (integer != null)
                {
                    int j = integer;

                    if (j >= 0 && j < this.overrideBakedModels.size())
                    {
                        if (flag)
                        {
                            lastModelLocation = this.overrides.get(j).getLocation();
                        }

                        IBakedModel ibakedmodel1 = this.overrideBakedModels.get(j);

                        if (ibakedmodel1 != null)
                        {
                            return ibakedmodel1;
                        }
                    }

                    return model;
                }
            }

            for (int i = 0; i < this.overrides.size(); ++i)
            {
                ItemOverride itemoverride = this.overrides.get(i);

                if (itemoverride.matchesItemStack(stack, worldIn, entityIn))
                {
                    IBakedModel ibakedmodel = this.overrideBakedModels.get(i);

                    if (flag)
                    {
                        lastModelLocation = itemoverride.getLocation();
                    }

                    if (this.itemOverrideCache != null)
                    {
                        this.itemOverrideCache.putModelIndex(stack, worldIn, entityIn, i);
                    }

                    if (ibakedmodel == null)
                    {
                        return model;
                    }

                    return ibakedmodel;
                }
            }

            if (this.itemOverrideCache != null)
            {
                this.itemOverrideCache.putModelIndex(stack, worldIn, entityIn, ItemOverrideCache.INDEX_NONE);
            }
        }

        return model;
    }

    public ImmutableList<ItemOverride> getOverrides()
    {
        return ImmutableList.copyOf(this.overrides);
    }
}
