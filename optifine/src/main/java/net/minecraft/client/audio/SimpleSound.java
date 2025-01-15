package net.minecraft.client.audio;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;

public class SimpleSound extends LocatableSound
{
    public SimpleSound(SoundEvent p_i2089_1_, SoundCategory p_i2089_2_, float p_i2089_3_, float p_i2089_4_, BlockPos p_i2089_5_)
    {
        this(p_i2089_1_, p_i2089_2_, p_i2089_3_, p_i2089_4_, (float)p_i2089_5_.getX() + 0.5F, (float)p_i2089_5_.getY() + 0.5F, (float)p_i2089_5_.getZ() + 0.5F);
    }

    public static SimpleSound master(SoundEvent soundIn, float pitchIn)
    {
        return master(soundIn, pitchIn, 0.25F);
    }

    public static SimpleSound master(SoundEvent soundIn, float pitchIn, float volumeIn)
    {
        return new SimpleSound(soundIn.getName(), SoundCategory.MASTER, volumeIn, pitchIn, false, 0, ISound.AttenuationType.NONE, 0.0F, 0.0F, 0.0F, true);
    }

    public static SimpleSound music(SoundEvent soundIn)
    {
        return new SimpleSound(soundIn.getName(), SoundCategory.MUSIC, 1.0F, 1.0F, false, 0, ISound.AttenuationType.NONE, 0.0F, 0.0F, 0.0F, true);
    }

    public static SimpleSound record(SoundEvent soundIn, float xIn, float yIn, float zIn)
    {
        return new SimpleSound(soundIn, SoundCategory.RECORDS, 4.0F, 1.0F, false, 0, ISound.AttenuationType.LINEAR, xIn, yIn, zIn);
    }

    public SimpleSound(SoundEvent p_i2090_1_, SoundCategory p_i2090_2_, float p_i2090_3_, float p_i2090_4_, float p_i2090_5_, float p_i2090_6_, float p_i2090_7_)
    {
        this(p_i2090_1_, p_i2090_2_, p_i2090_3_, p_i2090_4_, false, 0, ISound.AttenuationType.LINEAR, p_i2090_5_, p_i2090_6_, p_i2090_7_);
    }

    private SimpleSound(SoundEvent p_i2091_1_, SoundCategory p_i2091_2_, float p_i2091_3_, float p_i2091_4_, boolean p_i2091_5_, int p_i2091_6_, ISound.AttenuationType p_i2091_7_, float p_i2091_8_, float p_i2091_9_, float p_i2091_10_)
    {
        this(p_i2091_1_.getName(), p_i2091_2_, p_i2091_3_, p_i2091_4_, p_i2091_5_, p_i2091_6_, p_i2091_7_, p_i2091_8_, p_i2091_9_, p_i2091_10_, false);
    }

    public SimpleSound(ResourceLocation p_i2092_1_, SoundCategory p_i2092_2_, float p_i2092_3_, float p_i2092_4_, boolean p_i2092_5_, int p_i2092_6_, ISound.AttenuationType p_i2092_7_, float p_i2092_8_, float p_i2092_9_, float p_i2092_10_, boolean p_i2092_11_)
    {
        super(p_i2092_1_, p_i2092_2_);
        this.volume = p_i2092_3_;
        this.pitch = p_i2092_4_;
        this.x = p_i2092_8_;
        this.y = p_i2092_9_;
        this.z = p_i2092_10_;
        this.repeat = p_i2092_5_;
        this.repeatDelay = p_i2092_6_;
        this.attenuationType = p_i2092_7_;
        this.global = p_i2092_11_;
    }
}
