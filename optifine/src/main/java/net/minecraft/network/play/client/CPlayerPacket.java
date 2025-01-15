package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CPlayerPacket implements IPacket<IServerPlayNetHandler>
{
    protected double x;
    protected double y;
    protected double z;
    protected float yaw;
    protected float pitch;
    protected boolean onGround;
    protected boolean moving;
    protected boolean rotating;

    public CPlayerPacket()
    {
    }

    public CPlayerPacket(boolean p_i2215_1_)
    {
        this.onGround = p_i2215_1_;
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processPlayer(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.onGround = buf.readUnsignedByte() != 0;
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.onGround ? 1 : 0);
    }

    public double getX(double defaultValue)
    {
        return this.moving ? this.x : defaultValue;
    }

    public double getY(double defaultValue)
    {
        return this.moving ? this.y : defaultValue;
    }

    public double getZ(double defaultValue)
    {
        return this.moving ? this.z : defaultValue;
    }

    public float getYaw(float defaultValue)
    {
        return this.rotating ? this.yaw : defaultValue;
    }

    public float getPitch(float defaultValue)
    {
        return this.rotating ? this.pitch : defaultValue;
    }

    public boolean isOnGround()
    {
        return this.onGround;
    }

    public static class PositionPacket extends CPlayerPacket
    {
        public PositionPacket()
        {
            this.moving = true;
        }

        public PositionPacket(double p_i1101_1_, double p_i1101_3_, double p_i1101_5_, boolean p_i1101_7_)
        {
            this.x = p_i1101_1_;
            this.y = p_i1101_3_;
            this.z = p_i1101_5_;
            this.onGround = p_i1101_7_;
            this.moving = true;
        }

        public void readPacketData(PacketBuffer buf) throws IOException
        {
            this.x = buf.readDouble();
            this.y = buf.readDouble();
            this.z = buf.readDouble();
            super.readPacketData(buf);
        }

        public void writePacketData(PacketBuffer buf) throws IOException
        {
            buf.writeDouble(this.x);
            buf.writeDouble(this.y);
            buf.writeDouble(this.z);
            super.writePacketData(buf);
        }
    }

    public static class PositionRotationPacket extends CPlayerPacket
    {
        public PositionRotationPacket()
        {
            this.moving = true;
            this.rotating = true;
        }

        public PositionRotationPacket(double p_i589_1_, double p_i589_3_, double p_i589_5_, float p_i589_7_, float p_i589_8_, boolean p_i589_9_)
        {
            this.x = p_i589_1_;
            this.y = p_i589_3_;
            this.z = p_i589_5_;
            this.yaw = p_i589_7_;
            this.pitch = p_i589_8_;
            this.onGround = p_i589_9_;
            this.rotating = true;
            this.moving = true;
        }

        public void readPacketData(PacketBuffer buf) throws IOException
        {
            this.x = buf.readDouble();
            this.y = buf.readDouble();
            this.z = buf.readDouble();
            this.yaw = buf.readFloat();
            this.pitch = buf.readFloat();
            super.readPacketData(buf);
        }

        public void writePacketData(PacketBuffer buf) throws IOException
        {
            buf.writeDouble(this.x);
            buf.writeDouble(this.y);
            buf.writeDouble(this.z);
            buf.writeFloat(this.yaw);
            buf.writeFloat(this.pitch);
            super.writePacketData(buf);
        }
    }

    public static class RotationPacket extends CPlayerPacket
    {
        public RotationPacket()
        {
            this.rotating = true;
        }

        public RotationPacket(float p_i1803_1_, float p_i1803_2_, boolean p_i1803_3_)
        {
            this.yaw = p_i1803_1_;
            this.pitch = p_i1803_2_;
            this.onGround = p_i1803_3_;
            this.rotating = true;
        }

        public void readPacketData(PacketBuffer buf) throws IOException
        {
            this.yaw = buf.readFloat();
            this.pitch = buf.readFloat();
            super.readPacketData(buf);
        }

        public void writePacketData(PacketBuffer buf) throws IOException
        {
            buf.writeFloat(this.yaw);
            buf.writeFloat(this.pitch);
            super.writePacketData(buf);
        }
    }
}
