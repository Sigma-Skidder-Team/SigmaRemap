package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SPlayerDiggingPacket implements IPacket<IClientPlayNetHandler>
{
    private static final Logger field_225379_b = LogManager.getLogger();
    private BlockPos field_225380_c;
    private BlockState field_225381_d;
    CPlayerDiggingPacket.Action field_225378_a;
    private boolean field_225382_e;

    public SPlayerDiggingPacket()
    {
    }

    public SPlayerDiggingPacket(BlockPos worldIn, BlockState x, CPlayerDiggingPacket.Action p_i1721_3_, boolean y, String p_i1721_5_)
    {
        this.field_225380_c = worldIn.toImmutable();
        this.field_225381_d = x;
        this.field_225378_a = p_i1721_3_;
        this.field_225382_e = y;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.field_225380_c = buf.readBlockPos();
        this.field_225381_d = Block.BLOCK_STATE_IDS.getByValue(buf.readVarInt());
        this.field_225378_a = buf.readEnumValue(CPlayerDiggingPacket.Action.class);
        this.field_225382_e = buf.readBoolean();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeBlockPos(this.field_225380_c);
        buf.writeVarInt(Block.getStateId(this.field_225381_d));
        buf.writeEnumValue(this.field_225378_a);
        buf.writeBoolean(this.field_225382_e);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.func_225312_a(this);
    }

    public BlockState func_225375_b()
    {
        return this.field_225381_d;
    }

    public BlockPos func_225374_c()
    {
        return this.field_225380_c;
    }

    public boolean func_225376_d()
    {
        return this.field_225382_e;
    }

    public CPlayerDiggingPacket.Action func_225377_e()
    {
        return this.field_225378_a;
    }
}
