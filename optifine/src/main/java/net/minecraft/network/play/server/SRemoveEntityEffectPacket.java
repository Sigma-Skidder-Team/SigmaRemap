package net.minecraft.network.play.server;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.Effect;
import net.minecraft.world.World;

public class SRemoveEntityEffectPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private Effect effectId;

    public SRemoveEntityEffectPacket()
    {
    }

    public SRemoveEntityEffectPacket(int p_i4144_1_, Effect p_i4144_2_)
    {
        this.entityId = p_i4144_1_;
        this.effectId = p_i4144_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
        this.effectId = Effect.get(buf.readUnsignedByte());
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
        buf.writeByte(Effect.getId(this.effectId));
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleRemoveEntityEffect(this);
    }

    @Nullable
    public Entity getEntity(World worldIn)
    {
        return worldIn.getEntityByID(this.entityId);
    }

    @Nullable
    public Effect getPotion()
    {
        return this.effectId;
    }
}
