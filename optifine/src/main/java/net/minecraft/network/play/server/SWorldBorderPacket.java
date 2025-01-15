package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.border.WorldBorder;

public class SWorldBorderPacket implements IPacket<IClientPlayNetHandler>
{
    private SWorldBorderPacket.Action action;
    private int size;
    private double centerX;
    private double centerZ;
    private double targetSize;
    private double diameter;
    private long timeUntilTarget;
    private int warningTime;
    private int warningDistance;

    public SWorldBorderPacket()
    {
    }

    public SWorldBorderPacket(WorldBorder p_i4196_1_, SWorldBorderPacket.Action p_i4196_2_)
    {
        this.action = p_i4196_2_;
        this.centerX = p_i4196_1_.getCenterX();
        this.centerZ = p_i4196_1_.getCenterZ();
        this.diameter = p_i4196_1_.getDiameter();
        this.targetSize = p_i4196_1_.getTargetSize();
        this.timeUntilTarget = p_i4196_1_.getTimeUntilTarget();
        this.size = p_i4196_1_.getSize();
        this.warningDistance = p_i4196_1_.getWarningDistance();
        this.warningTime = p_i4196_1_.getWarningTime();
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.action = buf.readEnumValue(SWorldBorderPacket.Action.class);

        switch (this.action)
        {
            case SET_SIZE:
                this.targetSize = buf.readDouble();
                break;

            case LERP_SIZE:
                this.diameter = buf.readDouble();
                this.targetSize = buf.readDouble();
                this.timeUntilTarget = buf.readVarLong();
                break;

            case SET_CENTER:
                this.centerX = buf.readDouble();
                this.centerZ = buf.readDouble();
                break;

            case SET_WARNING_BLOCKS:
                this.warningDistance = buf.readVarInt();
                break;

            case SET_WARNING_TIME:
                this.warningTime = buf.readVarInt();
                break;

            case INITIALIZE:
                this.centerX = buf.readDouble();
                this.centerZ = buf.readDouble();
                this.diameter = buf.readDouble();
                this.targetSize = buf.readDouble();
                this.timeUntilTarget = buf.readVarLong();
                this.size = buf.readVarInt();
                this.warningDistance = buf.readVarInt();
                this.warningTime = buf.readVarInt();
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeEnumValue(this.action);

        switch (this.action)
        {
            case SET_SIZE:
                buf.writeDouble(this.targetSize);
                break;

            case LERP_SIZE:
                buf.writeDouble(this.diameter);
                buf.writeDouble(this.targetSize);
                buf.writeVarLong(this.timeUntilTarget);
                break;

            case SET_CENTER:
                buf.writeDouble(this.centerX);
                buf.writeDouble(this.centerZ);
                break;

            case SET_WARNING_BLOCKS:
                buf.writeVarInt(this.warningDistance);
                break;

            case SET_WARNING_TIME:
                buf.writeVarInt(this.warningTime);
                break;

            case INITIALIZE:
                buf.writeDouble(this.centerX);
                buf.writeDouble(this.centerZ);
                buf.writeDouble(this.diameter);
                buf.writeDouble(this.targetSize);
                buf.writeVarLong(this.timeUntilTarget);
                buf.writeVarInt(this.size);
                buf.writeVarInt(this.warningDistance);
                buf.writeVarInt(this.warningTime);
        }
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleWorldBorder(this);
    }

    public void apply(WorldBorder border)
    {
        switch (this.action)
        {
            case SET_SIZE:
                border.setTransition(this.targetSize);
                break;

            case LERP_SIZE:
                border.setTransition(this.diameter, this.targetSize, this.timeUntilTarget);
                break;

            case SET_CENTER:
                border.setCenter(this.centerX, this.centerZ);
                break;

            case SET_WARNING_BLOCKS:
                border.setWarningDistance(this.warningDistance);
                break;

            case SET_WARNING_TIME:
                border.setWarningTime(this.warningTime);
                break;

            case INITIALIZE:
                border.setCenter(this.centerX, this.centerZ);

                if (this.timeUntilTarget > 0L)
                {
                    border.setTransition(this.diameter, this.targetSize, this.timeUntilTarget);
                }
                else
                {
                    border.setTransition(this.targetSize);
                }

                border.setSize(this.size);
                border.setWarningDistance(this.warningDistance);
                border.setWarningTime(this.warningTime);
        }
    }

    public static enum Action
    {
        SET_SIZE,
        LERP_SIZE,
        SET_CENTER,
        INITIALIZE,
        SET_WARNING_TIME,
        SET_WARNING_BLOCKS;
    }
}
