package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CEntityActionPacket implements IPacket<IServerPlayNetHandler>
{
    private int entityID;
    private CEntityActionPacket.Action action;
    private int auxData;

    public CEntityActionPacket()
    {
    }

    public CEntityActionPacket(Entity theEntityIn, CEntityActionPacket.Action p_i1641_2_)
    {
        this(theEntityIn, p_i1641_2_, 0);
    }

    public CEntityActionPacket(Entity p_i1642_1_, CEntityActionPacket.Action p_i1642_2_, int p_i1642_3_)
    {
        this.entityID = p_i1642_1_.getEntityId();
        this.action = p_i1642_2_;
        this.auxData = p_i1642_3_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityID = buf.readVarInt();
        this.action = buf.readEnumValue(CEntityActionPacket.Action.class);
        this.auxData = buf.readVarInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityID);
        buf.writeEnumValue(this.action);
        buf.writeVarInt(this.auxData);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processEntityAction(this);
    }

    public CEntityActionPacket.Action getAction()
    {
        return this.action;
    }

    public int getAuxData()
    {
        return this.auxData;
    }

    public static enum Action
    {
        PRESS_SHIFT_KEY,
        RELEASE_SHIFT_KEY,
        STOP_SLEEPING,
        START_SPRINTING,
        STOP_SPRINTING,
        START_RIDING_JUMP,
        STOP_RIDING_JUMP,
        OPEN_INVENTORY,
        START_FALL_FLYING;
    }
}
