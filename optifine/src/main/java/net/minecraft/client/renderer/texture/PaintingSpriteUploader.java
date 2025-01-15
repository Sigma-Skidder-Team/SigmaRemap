package net.minecraft.client.renderer.texture;

import java.util.stream.Stream;
import net.minecraft.entity.item.PaintingType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class PaintingSpriteUploader extends SpriteUploader
{
    private static final ResourceLocation LOCATION_BACK_SPRITE = new ResourceLocation("back");

    public PaintingSpriteUploader(TextureManager p_i1724_1_)
    {
        super(p_i1724_1_, new ResourceLocation("textures/atlas/paintings.png"), "painting");
    }

    protected Stream<ResourceLocation> getResourceLocations()
    {
        return Stream.concat(Registry.MOTIVE.keySet().stream(), Stream.of(LOCATION_BACK_SPRITE));
    }

    public TextureAtlasSprite getSpriteForPainting(PaintingType paintingTypeIn)
    {
        return this.getSprite(Registry.MOTIVE.getKey(paintingTypeIn));
    }

    public TextureAtlasSprite getBackSprite()
    {
        return this.getSprite(LOCATION_BACK_SPRITE);
    }
}
