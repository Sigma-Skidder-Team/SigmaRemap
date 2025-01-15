package net.minecraft.particles;

public class ParticleType<T extends IParticleData>
{
    private final boolean alwaysShow;
    private final IParticleData.IDeserializer<T> deserializer;

    protected ParticleType(boolean other, IParticleData.IDeserializer<T> p_i1577_2_)
    {
        this.alwaysShow = other;
        this.deserializer = p_i1577_2_;
    }

    public boolean getAlwaysShow()
    {
        return this.alwaysShow;
    }

    public IParticleData.IDeserializer<T> getDeserializer()
    {
        return this.deserializer;
    }
}
