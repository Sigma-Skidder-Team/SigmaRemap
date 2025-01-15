package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SSetExperiencePacket implements IPacket<IClientPlayNetHandler>
{
    private float experienceBar;
    private int totalExperience;
    private int level;

    public SSetExperiencePacket()
    {
    }

    public SSetExperiencePacket(float p_i2839_1_, int p_i2839_2_, int p_i2839_3_)
    {
        this.experienceBar = p_i2839_1_;
        this.totalExperience = p_i2839_2_;
        this.level = p_i2839_3_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.experienceBar = buf.readFloat();
        this.level = buf.readVarInt();
        this.totalExperience = buf.readVarInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeFloat(this.experienceBar);
        buf.writeVarInt(this.level);
        buf.writeVarInt(this.totalExperience);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleSetExperience(this);
    }

    public float getExperienceBar()
    {
        return this.experienceBar;
    }

    public int getTotalExperience()
    {
        return this.totalExperience;
    }

    public int getLevel()
    {
        return this.level;
    }
}
