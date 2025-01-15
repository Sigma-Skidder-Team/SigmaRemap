package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;

public class SPlayEntityEffectPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private byte effectId;
    private byte amplifier;
    private int duration;
    private byte flags;

    public SPlayEntityEffectPacket()
    {
    }

    public SPlayEntityEffectPacket(int p_i497_1_, EffectInstance p_i497_2_)
    {
        this.entityId = p_i497_1_;
        this.effectId = (byte)(Effect.getId(p_i497_2_.getPotion()) & 255);
        this.amplifier = (byte)(p_i497_2_.getAmplifier() & 255);

        if (p_i497_2_.getDuration() > 32767)
        {
            this.duration = 32767;
        }
        else
        {
            this.duration = p_i497_2_.getDuration();
        }

        this.flags = 0;

        if (p_i497_2_.isAmbient())
        {
            this.flags = (byte)(this.flags | 1);
        }

        if (p_i497_2_.doesShowParticles())
        {
            this.flags = (byte)(this.flags | 2);
        }

        if (p_i497_2_.isShowIcon())
        {
            this.flags = (byte)(this.flags | 4);
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
        this.effectId = buf.readByte();
        this.amplifier = buf.readByte();
        this.duration = buf.readVarInt();
        this.flags = buf.readByte();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
        buf.writeByte(this.effectId);
        buf.writeByte(this.amplifier);
        buf.writeVarInt(this.duration);
        buf.writeByte(this.flags);
    }

    public boolean isMaxDuration()
    {
        return this.duration == 32767;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleEntityEffect(this);
    }

    public int getEntityId()
    {
        return this.entityId;
    }

    public byte getEffectId()
    {
        return this.effectId;
    }

    public byte getAmplifier()
    {
        return this.amplifier;
    }

    public int getDuration()
    {
        return this.duration;
    }

    public boolean doesShowParticles()
    {
        return (this.flags & 2) == 2;
    }

    public boolean getIsAmbient()
    {
        return (this.flags & 1) == 1;
    }

    public boolean shouldShowIcon()
    {
        return (this.flags & 4) == 4;
    }
}
