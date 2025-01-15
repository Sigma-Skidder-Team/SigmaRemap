package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SMoveVehiclePacket implements IPacket<IClientPlayNetHandler>
{
    private double x;
    private double y;
    private double z;
    private float yaw;
    private float pitch;

    public SMoveVehiclePacket()
    {
    }

    public SMoveVehiclePacket(Entity parent)
    {
        this.x = parent.getPosX();
        this.y = parent.getPosY();
        this.z = parent.getPosZ();
        this.yaw = parent.rotationYaw;
        this.pitch = parent.rotationPitch;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.x = buf.readDouble();
        this.y = buf.readDouble();
        this.z = buf.readDouble();
        this.yaw = buf.readFloat();
        this.pitch = buf.readFloat();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeDouble(this.x);
        buf.writeDouble(this.y);
        buf.writeDouble(this.z);
        buf.writeFloat(this.yaw);
        buf.writeFloat(this.pitch);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleMoveVehicle(this);
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
}
