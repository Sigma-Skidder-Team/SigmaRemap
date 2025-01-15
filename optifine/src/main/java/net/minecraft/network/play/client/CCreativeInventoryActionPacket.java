package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CCreativeInventoryActionPacket implements IPacket<IServerPlayNetHandler>
{
    private int slotId;
    private ItemStack stack = ItemStack.EMPTY;

    public CCreativeInventoryActionPacket()
    {
    }

    public CCreativeInventoryActionPacket(int p_i1080_1_, ItemStack p_i1080_2_)
    {
        this.slotId = p_i1080_1_;
        this.stack = p_i1080_2_.copy();
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processCreativeInventoryAction(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.slotId = buf.readShort();
        this.stack = buf.readItemStack();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeShort(this.slotId);
        buf.writeItemStack(this.stack);
    }

    public int getSlotId()
    {
        return this.slotId;
    }

    public ItemStack getStack()
    {
        return this.stack;
    }
}
