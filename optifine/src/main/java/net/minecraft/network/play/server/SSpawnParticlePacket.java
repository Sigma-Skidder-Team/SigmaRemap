package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.registry.Registry;

public class SSpawnParticlePacket implements IPacket<IClientPlayNetHandler>
{
    private double xCoord;
    private double yCoord;
    private double zCoord;
    private float xOffset;
    private float yOffset;
    private float zOffset;
    private float particleSpeed;
    private int particleCount;
    private boolean longDistance;
    private IParticleData particle;

    public SSpawnParticlePacket()
    {
    }

    public <T extends IParticleData> SSpawnParticlePacket(T p_i1060_1_, boolean p_i1060_2_, double p_i1060_3_, double p_i1060_5_, double p_i1060_7_, float p_i1060_9_, float p_i1060_10_, float p_i1060_11_, float p_i1060_12_, int p_i1060_13_)
    {
        this.particle = p_i1060_1_;
        this.longDistance = p_i1060_2_;
        this.xCoord = p_i1060_3_;
        this.yCoord = p_i1060_5_;
        this.zCoord = p_i1060_7_;
        this.xOffset = p_i1060_9_;
        this.yOffset = p_i1060_10_;
        this.zOffset = p_i1060_11_;
        this.particleSpeed = p_i1060_12_;
        this.particleCount = p_i1060_13_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        ParticleType<?> particletype = Registry.PARTICLE_TYPE.getByValue(buf.readInt());

        if (particletype == null)
        {
            particletype = ParticleTypes.BARRIER;
        }

        this.longDistance = buf.readBoolean();
        this.xCoord = buf.readDouble();
        this.yCoord = buf.readDouble();
        this.zCoord = buf.readDouble();
        this.xOffset = buf.readFloat();
        this.yOffset = buf.readFloat();
        this.zOffset = buf.readFloat();
        this.particleSpeed = buf.readFloat();
        this.particleCount = buf.readInt();
        this.particle = this.readParticle(buf, particletype);
    }

    private <T extends IParticleData> T readParticle(PacketBuffer p_199855_1_, ParticleType<T> p_199855_2_)
    {
        return p_199855_2_.getDeserializer().read(p_199855_2_, p_199855_1_);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeInt(Registry.PARTICLE_TYPE.getId(this.particle.getType()));
        buf.writeBoolean(this.longDistance);
        buf.writeDouble(this.xCoord);
        buf.writeDouble(this.yCoord);
        buf.writeDouble(this.zCoord);
        buf.writeFloat(this.xOffset);
        buf.writeFloat(this.yOffset);
        buf.writeFloat(this.zOffset);
        buf.writeFloat(this.particleSpeed);
        buf.writeInt(this.particleCount);
        this.particle.write(buf);
    }

    public boolean isLongDistance()
    {
        return this.longDistance;
    }

    public double getXCoordinate()
    {
        return this.xCoord;
    }

    public double getYCoordinate()
    {
        return this.yCoord;
    }

    public double getZCoordinate()
    {
        return this.zCoord;
    }

    public float getXOffset()
    {
        return this.xOffset;
    }

    public float getYOffset()
    {
        return this.yOffset;
    }

    public float getZOffset()
    {
        return this.zOffset;
    }

    public float getParticleSpeed()
    {
        return this.particleSpeed;
    }

    public int getParticleCount()
    {
        return this.particleCount;
    }

    public IParticleData getParticle()
    {
        return this.particle;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleParticles(this);
    }
}
