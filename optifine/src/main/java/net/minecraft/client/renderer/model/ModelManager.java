package net.minecraft.client.renderer.model;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.renderer.texture.SpriteMap;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.ReloadListener;
import net.minecraft.fluid.IFluidState;
import net.minecraft.profiler.IProfiler;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;

public class ModelManager extends ReloadListener<ModelBakery> implements AutoCloseable
{
    private Map<ResourceLocation, IBakedModel> modelRegistry;
    private SpriteMap atlases;
    private final BlockModelShapes modelProvider;
    private final TextureManager textureManager;
    private final BlockColors blockColors;
    private int maxMipmapLevel;
    private IBakedModel defaultModel;
    private Object2IntMap<BlockState> stateModelIds;

    public ModelManager(TextureManager p_i405_1_, BlockColors p_i405_2_, int p_i405_3_)
    {
        this.textureManager = p_i405_1_;
        this.blockColors = p_i405_2_;
        this.maxMipmapLevel = p_i405_3_;
        this.modelProvider = new BlockModelShapes(this);
    }

    public IBakedModel getModel(ModelResourceLocation modelLocation)
    {
        return this.modelRegistry.getOrDefault(modelLocation, this.defaultModel);
    }

    public IBakedModel getMissingModel()
    {
        return this.defaultModel;
    }

    public BlockModelShapes getBlockModelShapes()
    {
        return this.modelProvider;
    }

    protected ModelBakery prepare(IResourceManager resourceManagerIn, IProfiler profilerIn)
    {
        profilerIn.startTick();
        ModelBakery modelbakery = new ModelBakery(resourceManagerIn, this.blockColors, profilerIn, this.maxMipmapLevel);
        profilerIn.endTick();
        return modelbakery;
    }

    protected void apply(ModelBakery objectIn, IResourceManager resourceManagerIn, IProfiler profilerIn)
    {
        profilerIn.startTick();
        profilerIn.startSection("upload");

        if (this.atlases != null)
        {
            this.atlases.close();
        }

        this.atlases = objectIn.uploadTextures(this.textureManager, profilerIn);
        this.modelRegistry = objectIn.getTopBakedModels();
        this.stateModelIds = objectIn.getStateModelIds();
        this.defaultModel = this.modelRegistry.get(ModelBakery.MODEL_MISSING);
        profilerIn.endStartSection("cache");
        this.modelProvider.reloadModels();
        profilerIn.endSection();
        profilerIn.endTick();
    }

    public boolean needsRenderUpdate(BlockState oldState, BlockState newState)
    {
        if (oldState == newState)
        {
            return false;
        }
        else
        {
            int i = this.stateModelIds.getInt(oldState);

            if (i != -1)
            {
                int j = this.stateModelIds.getInt(newState);

                if (i == j)
                {
                    IFluidState ifluidstate = oldState.getFluidState();
                    IFluidState ifluidstate1 = newState.getFluidState();
                    return ifluidstate != ifluidstate1;
                }
            }

            return true;
        }
    }

    public AtlasTexture getAtlasTexture(ResourceLocation locationIn)
    {
        return this.atlases.getAtlasTexture(locationIn);
    }

    public void close()
    {
        this.atlases.close();
    }

    public void setMaxMipmapLevel(int levelIn)
    {
        this.maxMipmapLevel = levelIn;
    }
}
