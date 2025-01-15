package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public class CPlayerDiggingPacket implements IPacket<IServerPlayNetHandler>
{
    private BlockPos position;
    private Direction facing;
    private CPlayerDiggingPacket.Action action;

    public CPlayerDiggingPacket()
    {
    }

    public CPlayerDiggingPacket(CPlayerDiggingPacket.Action p_i2568_1_, BlockPos p_i2568_2_, Direction p_i2568_3_)
    {
        this.action = p_i2568_1_;
        this.position = p_i2568_2_.toImmutable();
        this.facing = p_i2568_3_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.action = buf.readEnumValue(CPlayerDiggingPacket.Action.class);
        this.position = buf.readBlockPos();
        this.facing = Direction.byIndex(buf.readUnsignedByte());
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeEnumValue(this.action);
        buf.writeBlockPos(this.position);
        buf.writeByte(this.facing.getIndex());
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processPlayerDigging(this);
    }

    public BlockPos getPosition()
    {
        return this.position;
    }

    public Direction getFacing()
    {
        return this.facing;
    }

    public CPlayerDiggingPacket.Action getAction()
    {
        return this.action;
    }

    public static enum Action
    {
        START_DESTROY_BLOCK,
        ABORT_DESTROY_BLOCK,
        STOP_DESTROY_BLOCK,
        DROP_ALL_ITEMS,
        DROP_ITEM,
        RELEASE_USE_ITEM,
        SWAP_HELD_ITEMS;
    }
}
