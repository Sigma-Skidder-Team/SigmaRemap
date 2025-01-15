package net.minecraft.client.renderer;

import java.util.Collection;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public class StitcherException extends RuntimeException
{
    private final Collection<TextureAtlasSprite.Info> spriteInfos;

    public StitcherException(TextureAtlasSprite.Info p_i184_1_, Collection<TextureAtlasSprite.Info> p_i184_2_)
    {
        super(String.format("Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", p_i184_1_.getSpriteLocation(), p_i184_1_.getSpriteWidth(), p_i184_1_.getSpriteHeight()));
        this.spriteInfos = p_i184_2_;
    }

    public Collection<TextureAtlasSprite.Info> getSpriteInfos()
    {
        return this.spriteInfos;
    }

    public StitcherException(TextureAtlasSprite.Info p_i185_1_, Collection<TextureAtlasSprite.Info> p_i185_2_, int p_i185_3_, int p_i185_4_, int p_i185_5_, int p_i185_6_)
    {
        super(String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", "" + p_i185_1_.getSpriteLocation(), p_i185_1_.getSpriteWidth(), p_i185_1_.getSpriteHeight(), p_i185_3_, p_i185_4_, p_i185_5_, p_i185_6_));
        this.spriteInfos = p_i185_2_;
    }
}
