package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldType;
import net.minecraft.world.dimension.DimensionType;

public class SJoinGamePacket implements IPacket<IClientPlayNetHandler>
{
    private int playerId;
    private long field_229740_b_;
    private boolean hardcoreMode;
    private GameType gameType;
    private DimensionType dimension;
    private int maxPlayers;
    private WorldType worldType;
    private int viewDistance;
    private boolean reducedDebugInfo;
    private boolean field_229741_j_;

    public SJoinGamePacket()
    {
    }

    public SJoinGamePacket(int p_i1757_1_, GameType p_i1757_2_, long p_i1757_3_, boolean p_i1757_5_, DimensionType p_i1757_6_, int p_i1757_7_, WorldType p_i1757_8_, int p_i1757_9_, boolean p_i1757_10_, boolean p_i1757_11_)
    {
        this.playerId = p_i1757_1_;
        this.dimension = p_i1757_6_;
        this.field_229740_b_ = p_i1757_3_;
        this.gameType = p_i1757_2_;
        this.maxPlayers = p_i1757_7_;
        this.hardcoreMode = p_i1757_5_;
        this.worldType = p_i1757_8_;
        this.viewDistance = p_i1757_9_;
        this.reducedDebugInfo = p_i1757_10_;
        this.field_229741_j_ = p_i1757_11_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.playerId = buf.readInt();
        int i = buf.readUnsignedByte();
        this.hardcoreMode = (i & 8) == 8;
        i = i & -9;
        this.gameType = GameType.getByID(i);
        this.dimension = DimensionType.getById(buf.readInt());
        this.field_229740_b_ = buf.readLong();
        this.maxPlayers = buf.readUnsignedByte();
        this.worldType = WorldType.byName(buf.readString(16));

        if (this.worldType == null)
        {
            this.worldType = WorldType.DEFAULT;
        }

        this.viewDistance = buf.readVarInt();
        this.reducedDebugInfo = buf.readBoolean();
        this.field_229741_j_ = buf.readBoolean();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeInt(this.playerId);
        int i = this.gameType.getID();

        if (this.hardcoreMode)
        {
            i |= 8;
        }

        buf.writeByte(i);
        buf.writeInt(this.dimension.getId());
        buf.writeLong(this.field_229740_b_);
        buf.writeByte(this.maxPlayers);
        buf.writeString(this.worldType.getName());
        buf.writeVarInt(this.viewDistance);
        buf.writeBoolean(this.reducedDebugInfo);
        buf.writeBoolean(this.field_229741_j_);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleJoinGame(this);
    }

    public int getPlayerId()
    {
        return this.playerId;
    }

    public long func_229742_c_()
    {
        return this.field_229740_b_;
    }

    public boolean isHardcoreMode()
    {
        return this.hardcoreMode;
    }

    public GameType getGameType()
    {
        return this.gameType;
    }

    public DimensionType getDimension()
    {
        return this.dimension;
    }

    public WorldType getWorldType()
    {
        return this.worldType;
    }

    public int getViewDistance()
    {
        return this.viewDistance;
    }

    public boolean isReducedDebugInfo()
    {
        return this.reducedDebugInfo;
    }

    public boolean func_229743_k_()
    {
        return this.field_229741_j_;
    }
}
