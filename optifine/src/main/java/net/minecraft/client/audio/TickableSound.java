package net.minecraft.client.audio;

import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public abstract class TickableSound extends LocatableSound implements ITickableSound
{
    protected boolean donePlaying;

    protected TickableSound(SoundEvent profile, SoundCategory startDate)
    {
        super(profile, startDate);
    }

    public boolean isDonePlaying()
    {
        return this.donePlaying;
    }
}
