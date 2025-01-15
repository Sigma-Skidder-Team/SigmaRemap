package net.minecraft.client.audio;

import javax.annotation.Nullable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;

public interface ISound
{
    ResourceLocation getSoundLocation();

    @Nullable
    SoundEventAccessor createAccessor(SoundHandler handler);

    Sound getSound();

    SoundCategory getCategory();

    boolean canRepeat();

    boolean isGlobal();

    int getRepeatDelay();

    float getVolume();

    float getPitch();

    float getX();

    float getY();

    float getZ();

    ISound.AttenuationType getAttenuationType();

default boolean canBeSilent()
    {
        return false;
    }

    public static enum AttenuationType
    {
        NONE,
        LINEAR;
    }
}
