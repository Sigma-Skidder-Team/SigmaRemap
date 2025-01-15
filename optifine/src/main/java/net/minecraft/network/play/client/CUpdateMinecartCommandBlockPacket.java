package net.minecraft.network.play.client;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.minecart.MinecartCommandBlockEntity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.tileentity.CommandBlockLogic;
import net.minecraft.world.World;

public class CUpdateMinecartCommandBlockPacket implements IPacket<IServerPlayNetHandler>
{
    private int entityId;
    private String command;
    private boolean trackOutput;

    public CUpdateMinecartCommandBlockPacket()
    {
    }

    public CUpdateMinecartCommandBlockPacket(int p_i960_1_, String p_i960_2_, boolean p_i960_3_)
    {
        this.entityId = p_i960_1_;
        this.command = p_i960_2_;
        this.trackOutput = p_i960_3_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
        this.command = buf.readString(32767);
        this.trackOutput = buf.readBoolean();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
        buf.writeString(this.command);
        buf.writeBoolean(this.trackOutput);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processUpdateCommandMinecart(this);
    }

    @Nullable
    public CommandBlockLogic getCommandBlock(World worldIn)
    {
        Entity entity = worldIn.getEntityByID(this.entityId);
        return entity instanceof MinecartCommandBlockEntity ? ((MinecartCommandBlockEntity)entity).getCommandBlockLogic() : null;
    }

    public String getCommand()
    {
        return this.command;
    }

    public boolean shouldTrackOutput()
    {
        return this.trackOutput;
    }
}
