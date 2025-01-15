package net.minecraft.client.audio;

import java.util.List;
import javax.annotation.Nullable;

public class SoundList
{
    private final List<Sound> sounds;
    private final boolean replaceExisting;
    private final String subtitle;

    public SoundList(List<Sound> p_i2530_1_, boolean p_i2530_2_, String p_i2530_3_)
    {
        this.sounds = p_i2530_1_;
        this.replaceExisting = p_i2530_2_;
        this.subtitle = p_i2530_3_;
    }

    public List<Sound> getSounds()
    {
        return this.sounds;
    }

    public boolean canReplaceExisting()
    {
        return this.replaceExisting;
    }

    @Nullable
    public String getSubtitle()
    {
        return this.subtitle;
    }
}
