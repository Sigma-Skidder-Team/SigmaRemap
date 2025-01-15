package net.minecraft.client.renderer.texture;

import java.util.stream.Stream;
import net.minecraft.client.resources.ReloadListener;
import net.minecraft.profiler.IProfiler;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;

public abstract class SpriteUploader extends ReloadListener<AtlasTexture.SheetData> implements AutoCloseable
{
    private final AtlasTexture textureAtlas;
    private final String prefix;

    public SpriteUploader(TextureManager p_i814_1_, ResourceLocation p_i814_2_, String p_i814_3_)
    {
        this.prefix = p_i814_3_;
        this.textureAtlas = new AtlasTexture(p_i814_2_);
        p_i814_1_.loadTexture(this.textureAtlas.getTextureLocation(), this.textureAtlas);
    }

    protected abstract Stream<ResourceLocation> getResourceLocations();

    protected TextureAtlasSprite getSprite(ResourceLocation locationIn)
    {
        return this.textureAtlas.getSprite(this.resolveLocation(locationIn));
    }

    private ResourceLocation resolveLocation(ResourceLocation locationIn)
    {
        return new ResourceLocation(locationIn.getNamespace(), this.prefix + "/" + locationIn.getPath());
    }

    protected AtlasTexture.SheetData prepare(IResourceManager resourceManagerIn, IProfiler profilerIn)
    {
        profilerIn.startTick();
        profilerIn.startSection("stitching");
        AtlasTexture.SheetData atlastexture$sheetdata = this.textureAtlas.stitch(resourceManagerIn, this.getResourceLocations().map(this::resolveLocation), profilerIn, 0);
        profilerIn.endSection();
        profilerIn.endTick();
        return atlastexture$sheetdata;
    }

    protected void apply(AtlasTexture.SheetData objectIn, IResourceManager resourceManagerIn, IProfiler profilerIn)
    {
        profilerIn.startTick();
        profilerIn.startSection("upload");
        this.textureAtlas.upload(objectIn);
        profilerIn.endSection();
        profilerIn.endTick();
    }

    public void close()
    {
        this.textureAtlas.clear();
    }
}
