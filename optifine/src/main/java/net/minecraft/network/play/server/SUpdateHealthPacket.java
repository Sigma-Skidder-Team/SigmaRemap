package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SUpdateHealthPacket implements IPacket<IClientPlayNetHandler>
{
    private float health;
    private int foodLevel;
    private float saturationLevel;

    public SUpdateHealthPacket()
    {
    }

    public SUpdateHealthPacket(float p_i2462_1_, int p_i2462_2_, float p_i2462_3_)
    {
        this.health = p_i2462_1_;
        this.foodLevel = p_i2462_2_;
        this.saturationLevel = p_i2462_3_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.health = buf.readFloat();
        this.foodLevel = buf.readVarInt();
        this.saturationLevel = buf.readFloat();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeFloat(this.health);
        buf.writeVarInt(this.foodLevel);
        buf.writeFloat(this.saturationLevel);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleUpdateHealth(this);
    }

    public float getHealth()
    {
        return this.health;
    }

    public int getFoodLevel()
    {
        return this.foodLevel;
    }

    public float getSaturationLevel()
    {
        return this.saturationLevel;
    }
}
