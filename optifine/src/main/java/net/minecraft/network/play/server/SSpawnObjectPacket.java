package net.minecraft.network.play.server;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;

public class SSpawnObjectPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private UUID uniqueId;
    private double x;
    private double y;
    private double z;
    private int speedX;
    private int speedY;
    private int speedZ;
    private int pitch;
    private int yaw;
    private EntityType<?> type;
    private int data;

    public SSpawnObjectPacket()
    {
    }

    public SSpawnObjectPacket(int p_i2431_1_, UUID p_i2431_2_, double p_i2431_3_, double p_i2431_5_, double p_i2431_7_, float p_i2431_9_, float p_i2431_10_, EntityType<?> p_i2431_11_, int p_i2431_12_, Vec3d p_i2431_13_)
    {
        this.entityId = p_i2431_1_;
        this.uniqueId = p_i2431_2_;
        this.x = p_i2431_3_;
        this.y = p_i2431_5_;
        this.z = p_i2431_7_;
        this.pitch = MathHelper.floor(p_i2431_9_ * 256.0F / 360.0F);
        this.yaw = MathHelper.floor(p_i2431_10_ * 256.0F / 360.0F);
        this.type = p_i2431_11_;
        this.data = p_i2431_12_;
        this.speedX = (int)(MathHelper.clamp(p_i2431_13_.x, -3.9D, 3.9D) * 8000.0D);
        this.speedY = (int)(MathHelper.clamp(p_i2431_13_.y, -3.9D, 3.9D) * 8000.0D);
        this.speedZ = (int)(MathHelper.clamp(p_i2431_13_.z, -3.9D, 3.9D) * 8000.0D);
    }

    public SSpawnObjectPacket(Entity p_i2432_1_)
    {
        this(p_i2432_1_, 0);
    }

    public SSpawnObjectPacket(Entity p_i2433_1_, int p_i2433_2_)
    {
        this(p_i2433_1_.getEntityId(), p_i2433_1_.getUniqueID(), p_i2433_1_.getPosX(), p_i2433_1_.getPosY(), p_i2433_1_.getPosZ(), p_i2433_1_.rotationPitch, p_i2433_1_.rotationYaw, p_i2433_1_.getType(), p_i2433_2_, p_i2433_1_.getMotion());
    }

    public SSpawnObjectPacket(Entity p_i2434_1_, EntityType<?> p_i2434_2_, int p_i2434_3_, BlockPos p_i2434_4_)
    {
        this(p_i2434_1_.getEntityId(), p_i2434_1_.getUniqueID(), (double)p_i2434_4_.getX(), (double)p_i2434_4_.getY(), (double)p_i2434_4_.getZ(), p_i2434_1_.rotationPitch, p_i2434_1_.rotationYaw, p_i2434_2_, p_i2434_3_, p_i2434_1_.getMotion());
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
        this.uniqueId = buf.readUniqueId();
        this.type = Registry.ENTITY_TYPE.getByValue(buf.readVarInt());
        this.x = buf.readDouble();
        this.y = buf.readDouble();
        this.z = buf.readDouble();
        this.pitch = buf.readByte();
        this.yaw = buf.readByte();
        this.data = buf.readInt();
        this.speedX = buf.readShort();
        this.speedY = buf.readShort();
        this.speedZ = buf.readShort();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
        buf.writeUniqueId(this.uniqueId);
        buf.writeVarInt(Registry.ENTITY_TYPE.getId(this.type));
        buf.writeDouble(this.x);
        buf.writeDouble(this.y);
        buf.writeDouble(this.z);
        buf.writeByte(this.pitch);
        buf.writeByte(this.yaw);
        buf.writeInt(this.data);
        buf.writeShort(this.speedX);
        buf.writeShort(this.speedY);
        buf.writeShort(this.speedZ);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleSpawnObject(this);
    }

    public int getEntityID()
    {
        return this.entityId;
    }

    public UUID getUniqueId()
    {
        return this.uniqueId;
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

    public double func_218693_g()
    {
        return (double)this.speedX / 8000.0D;
    }

    public double func_218695_h()
    {
        return (double)this.speedY / 8000.0D;
    }

    public double func_218692_i()
    {
        return (double)this.speedZ / 8000.0D;
    }

    public int getPitch()
    {
        return this.pitch;
    }

    public int getYaw()
    {
        return this.yaw;
    }

    public EntityType<?> getType()
    {
        return this.type;
    }

    public int getData()
    {
        return this.data;
    }
}
