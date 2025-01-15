package net.minecraft.network.play.server;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SPlayerPositionLookPacket implements IPacket<IClientPlayNetHandler>
{
    private double x;
    private double y;
    private double z;
    private float yaw;
    private float pitch;
    private Set<SPlayerPositionLookPacket.Flags> flags;
    private int teleportId;

    public SPlayerPositionLookPacket()
    {
    }

    public SPlayerPositionLookPacket(double p_i781_1_, double p_i781_3_, double p_i781_5_, float p_i781_7_, float p_i781_8_, Set<SPlayerPositionLookPacket.Flags> p_i781_9_, int p_i781_10_)
    {
        this.x = p_i781_1_;
        this.y = p_i781_3_;
        this.z = p_i781_5_;
        this.yaw = p_i781_7_;
        this.pitch = p_i781_8_;
        this.flags = p_i781_9_;
        this.teleportId = p_i781_10_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.x = buf.readDouble();
        this.y = buf.readDouble();
        this.z = buf.readDouble();
        this.yaw = buf.readFloat();
        this.pitch = buf.readFloat();
        this.flags = SPlayerPositionLookPacket.Flags.unpack(buf.readUnsignedByte());
        this.teleportId = buf.readVarInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeDouble(this.x);
        buf.writeDouble(this.y);
        buf.writeDouble(this.z);
        buf.writeFloat(this.yaw);
        buf.writeFloat(this.pitch);
        buf.writeByte(SPlayerPositionLookPacket.Flags.pack(this.flags));
        buf.writeVarInt(this.teleportId);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handlePlayerPosLook(this);
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public double getZ()
    {
        return this.z;
    }

    public float getYaw()
    {
        return this.yaw;
    }

    public float getPitch()
    {
        return this.pitch;
    }

    public int getTeleportId()
    {
        return this.teleportId;
    }

    public Set<SPlayerPositionLookPacket.Flags> getFlags()
    {
        return this.flags;
    }

    public static enum Flags
    {
        X(0),
        Y(1),
        Z(2),
        Y_ROT(3),
        X_ROT(4);

        private final int bit;

        private Flags(int p_i2676_3_)
        {
            this.bit = p_i2676_3_;
        }

        private int getMask()
        {
            return 1 << this.bit;
        }

        private boolean isSet(int flags)
        {
            return (flags & this.getMask()) == this.getMask();
        }

        public static Set<SPlayerPositionLookPacket.Flags> unpack(int flags)
        {
            Set<SPlayerPositionLookPacket.Flags> set = EnumSet.noneOf(SPlayerPositionLookPacket.Flags.class);

            for (SPlayerPositionLookPacket.Flags splayerpositionlookpacket$flags : values())
            {
                if (splayerpositionlookpacket$flags.isSet(flags))
                {
                    set.add(splayerpositionlookpacket$flags);
                }
            }

            return set;
        }

        public static int pack(Set<SPlayerPositionLookPacket.Flags> flags)
        {
            int i = 0;

            for (SPlayerPositionLookPacket.Flags splayerpositionlookpacket$flags : flags)
            {
                i |= splayerpositionlookpacket$flags.getMask();
            }

            return i;
        }
    }
}
