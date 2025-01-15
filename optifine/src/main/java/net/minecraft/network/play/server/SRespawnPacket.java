package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldType;
import net.minecraft.world.dimension.DimensionType;

public class SRespawnPacket implements IPacket<IClientPlayNetHandler>
{
    private DimensionType dimensionID;
    private long field_229746_b_;
    private GameType gameType;
    private WorldType worldType;

    public SRespawnPacket()
    {
    }

    public SRespawnPacket(DimensionType p_i1429_1_, long p_i1429_2_, WorldType p_i1429_4_, GameType p_i1429_5_)
    {
        this.dimensionID = p_i1429_1_;
        this.field_229746_b_ = p_i1429_2_;
        this.gameType = p_i1429_5_;
        this.worldType = p_i1429_4_;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleRespawn(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.dimensionID = DimensionType.getById(buf.readInt());
        this.field_229746_b_ = buf.readLong();
        this.gameType = GameType.getByID(buf.readUnsignedByte());
        this.worldType = WorldType.byName(buf.readString(16));

        if (this.worldType == null)
        {
            this.worldType = WorldType.DEFAULT;
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeInt(this.dimensionID.getId());
        buf.writeLong(this.field_229746_b_);
        buf.writeByte(this.gameType.getID());
        buf.writeString(this.worldType.getName());
    }

    public DimensionType getDimension()
    {
        return this.dimensionID;
    }

    public long func_229747_c_()
    {
        return this.field_229746_b_;
    }

    public GameType getGameType()
    {
        return this.gameType;
    }

    public WorldType getWorldType()
    {
        return this.worldType;
    }
}
