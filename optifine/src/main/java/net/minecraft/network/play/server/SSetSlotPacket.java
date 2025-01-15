package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SSetSlotPacket implements IPacket<IClientPlayNetHandler>
{
    private int windowId;
    private int slot;
    private ItemStack item = ItemStack.EMPTY;

    public SSetSlotPacket()
    {
    }

    public SSetSlotPacket(int p_i3259_1_, int p_i3259_2_, ItemStack p_i3259_3_)
    {
        this.windowId = p_i3259_1_;
        this.slot = p_i3259_2_;
        this.item = p_i3259_3_.copy();
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleSetSlot(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readByte();
        this.slot = buf.readShort();
        this.item = buf.readItemStack();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.windowId);
        buf.writeShort(this.slot);
        buf.writeItemStack(this.item);
    }

    public int getWindowId()
    {
        return this.windowId;
    }

    public int getSlot()
    {
        return this.slot;
    }

    public ItemStack getStack()
    {
        return this.item;
    }
}
