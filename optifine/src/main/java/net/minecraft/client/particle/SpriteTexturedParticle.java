package net.minecraft.client.particle;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.world.World;

public abstract class SpriteTexturedParticle extends TexturedParticle
{
    protected TextureAtlasSprite sprite;

    protected SpriteTexturedParticle(World p_i2372_1_, double p_i2372_2_, double p_i2372_4_, double p_i2372_6_)
    {
        super(p_i2372_1_, p_i2372_2_, p_i2372_4_, p_i2372_6_);
    }

    protected SpriteTexturedParticle(World p_i2373_1_, double p_i2373_2_, double p_i2373_4_, double p_i2373_6_, double p_i2373_8_, double p_i2373_10_, double p_i2373_12_)
    {
        super(p_i2373_1_, p_i2373_2_, p_i2373_4_, p_i2373_6_, p_i2373_8_, p_i2373_10_, p_i2373_12_);
    }

    protected void setSprite(TextureAtlasSprite sprite)
    {
        this.sprite = sprite;
    }

    protected float getMinU()
    {
        return this.sprite.getMinU();
    }

    protected float getMaxU()
    {
        return this.sprite.getMaxU();
    }

    protected float getMinV()
    {
        return this.sprite.getMinV();
    }

    protected float getMaxV()
    {
        return this.sprite.getMaxV();
    }

    public void selectSpriteRandomly(IAnimatedSprite p_217568_1_)
    {
        this.setSprite(p_217568_1_.get(this.rand));
    }

    public void selectSpriteWithAge(IAnimatedSprite p_217566_1_)
    {
        this.setSprite(p_217566_1_.get(this.age, this.maxAge));
    }
}
