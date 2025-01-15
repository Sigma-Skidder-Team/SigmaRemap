package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SEntityPacket implements IPacket<IClientPlayNetHandler>
{
    protected int entityId;
    protected short posX;
    protected short posY;
    protected short posZ;
    protected byte yaw;
    protected byte pitch;
    protected boolean onGround;
    protected boolean rotating;
    protected boolean isMovePacket;

    public static long func_218743_a(double p_218743_0_)
    {
        return MathHelper.lfloor(p_218743_0_ * 4096.0D);
    }

    public static Vec3d func_218744_a(long p_218744_0_, long p_218744_2_, long p_218744_4_)
    {
        return (new Vec3d((double)p_218744_0_, (double)p_218744_2_, (double)p_218744_4_)).scale((double)2.4414062E-4F);
    }

    public SEntityPacket()
    {
    }

    public SEntityPacket(int p_i276_1_)
    {
        this.entityId = p_i276_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleEntityMovement(this);
    }

    public String toString()
    {
        return "Entity_" + super.toString();
    }

    public Entity getEntity(World worldIn)
    {
        return worldIn.getEntityByID(this.entityId);
    }

    public short getX()
    {
        return this.posX;
    }

    public short getY()
    {
        return this.posY;
    }

    public short getZ()
    {
        return this.posZ;
    }

    public byte getYaw()
    {
        return this.yaw;
    }

    public byte getPitch()
    {
        return this.pitch;
    }

    public boolean isRotating()
    {
        return this.rotating;
    }

    public boolean func_229745_h_()
    {
        return this.isMovePacket;
    }

    public boolean getOnGround()
    {
        return this.onGround;
    }

    public static class LookPacket extends SEntityPacket
    {
        public LookPacket()
        {
            this.rotating = true;
        }

        public LookPacket(int p_i2682_1_, byte p_i2682_2_, byte p_i2682_3_, boolean p_i2682_4_)
        {
            super(p_i2682_1_);
            this.yaw = p_i2682_2_;
            this.pitch = p_i2682_3_;
            this.rotating = true;
            this.onGround = p_i2682_4_;
        }

        public void readPacketData(PacketBuffer buf) throws IOException
        {
            super.readPacketData(buf);
            this.yaw = buf.readByte();
            this.pitch = buf.readByte();
            this.onGround = buf.readBoolean();
        }

        public void writePacketData(PacketBuffer buf) throws IOException
        {
            super.writePacketData(buf);
            buf.writeByte(this.yaw);
            buf.writeByte(this.pitch);
            buf.writeBoolean(this.onGround);
        }
    }

    public static class MovePacket extends SEntityPacket
    {
        public MovePacket()
        {
            this.rotating = true;
            this.isMovePacket = true;
        }

        public MovePacket(int p_i3934_1_, short p_i3934_2_, short p_i3934_3_, short p_i3934_4_, byte p_i3934_5_, byte p_i3934_6_, boolean p_i3934_7_)
        {
            super(p_i3934_1_);
            this.posX = p_i3934_2_;
            this.posY = p_i3934_3_;
            this.posZ = p_i3934_4_;
            this.yaw = p_i3934_5_;
            this.pitch = p_i3934_6_;
            this.onGround = p_i3934_7_;
            this.rotating = true;
            this.isMovePacket = true;
        }

        public void readPacketData(PacketBuffer buf) throws IOException
        {
            super.readPacketData(buf);
            this.posX = buf.readShort();
            this.posY = buf.readShort();
            this.posZ = buf.readShort();
            this.yaw = buf.readByte();
            this.pitch = buf.readByte();
            this.onGround = buf.readBoolean();
        }

        public void writePacketData(PacketBuffer buf) throws IOException
        {
            super.writePacketData(buf);
            buf.writeShort(this.posX);
            buf.writeShort(this.posY);
            buf.writeShort(this.posZ);
            buf.writeByte(this.yaw);
            buf.writeByte(this.pitch);
            buf.writeBoolean(this.onGround);
        }
    }

    public static class RelativeMovePacket extends SEntityPacket
    {
        public RelativeMovePacket()
        {
            this.isMovePacket = true;
        }

        public RelativeMovePacket(int p_i1479_1_, short p_i1479_2_, short p_i1479_3_, short p_i1479_4_, boolean p_i1479_5_)
        {
            super(p_i1479_1_);
            this.posX = p_i1479_2_;
            this.posY = p_i1479_3_;
            this.posZ = p_i1479_4_;
            this.onGround = p_i1479_5_;
            this.isMovePacket = true;
        }

        public void readPacketData(PacketBuffer buf) throws IOException
        {
            super.readPacketData(buf);
            this.posX = buf.readShort();
            this.posY = buf.readShort();
            this.posZ = buf.readShort();
            this.onGround = buf.readBoolean();
        }

        public void writePacketData(PacketBuffer buf) throws IOException
        {
            super.writePacketData(buf);
            buf.writeShort(this.posX);
            buf.writeShort(this.posY);
            buf.writeShort(this.posZ);
            buf.writeBoolean(this.onGround);
        }
    }
}
