package net.minecraft.client.audio;

import net.minecraft.util.ResourceLocation;

public class Sound implements ISoundEventAccessor<Sound>
{
    private final ResourceLocation name;
    private final float volume;
    private final float pitch;
    private final int weight;
    private final Sound.Type type;
    private final boolean streaming;
    private final boolean preload;
    private final int attenuationDistance;

    public Sound(String p_i1241_1_, float p_i1241_2_, float p_i1241_3_, int p_i1241_4_, Sound.Type p_i1241_5_, boolean p_i1241_6_, boolean p_i1241_7_, int p_i1241_8_)
    {
        this.name = new ResourceLocation(p_i1241_1_);
        this.volume = p_i1241_2_;
        this.pitch = p_i1241_3_;
        this.weight = p_i1241_4_;
        this.type = p_i1241_5_;
        this.streaming = p_i1241_6_;
        this.preload = p_i1241_7_;
        this.attenuationDistance = p_i1241_8_;
    }

    public ResourceLocation getSoundLocation()
    {
        return this.name;
    }

    public ResourceLocation getSoundAsOggLocation()
    {
        return new ResourceLocation(this.name.getNamespace(), "sounds/" + this.name.getPath() + ".ogg");
    }

    public float getVolume()
    {
        return this.volume;
    }

    public float getPitch()
    {
        return this.pitch;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public Sound cloneEntry()
    {
        return this;
    }

    public void enqueuePreload(SoundEngine engine)
    {
        if (this.preload)
        {
            engine.enqueuePreload(this);
        }
    }

    public Sound.Type getType()
    {
        return this.type;
    }

    public boolean isStreaming()
    {
        return this.streaming;
    }

    public boolean shouldPreload()
    {
        return this.preload;
    }

    public int getAttenuationDistance()
    {
        return this.attenuationDistance;
    }

    public static enum Type
    {
        FILE("file"),
        SOUND_EVENT("event");

        private final String name;

        private Type(String p_i4086_3_)
        {
            this.name = p_i4086_3_;
        }

        public static Sound.Type getByName(String nameIn)
        {
            for (Sound.Type sound$type : values())
            {
                if (sound$type.name.equals(nameIn))
                {
                    return sound$type;
                }
            }

            return null;
        }
    }
}
