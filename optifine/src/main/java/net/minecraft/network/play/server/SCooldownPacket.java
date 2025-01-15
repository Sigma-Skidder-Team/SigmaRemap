package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.item.Item;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SCooldownPacket implements IPacket<IClientPlayNetHandler>
{
    private Item item;
    private int ticks;

    public SCooldownPacket()
    {
    }

    public SCooldownPacket(Item p_i3543_1_, int p_i3543_2_)
    {
        this.item = p_i3543_1_;
        this.ticks = p_i3543_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.item = Item.getItemById(buf.readVarInt());
        this.ticks = buf.readVarInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(Item.getIdFromItem(this.item));
        buf.writeVarInt(this.ticks);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleCooldown(this);
    }

    public Item getItem()
    {
        return this.item;
    }

    public int getTicks()
    {
        return this.ticks;
    }
}
