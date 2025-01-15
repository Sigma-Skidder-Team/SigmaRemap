package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CClickWindowPacket implements IPacket<IServerPlayNetHandler>
{
    private int windowId;
    private int slotId;
    private int packedClickData;
    private short actionNumber;
    private ItemStack clickedItem = ItemStack.EMPTY;
    private ClickType mode;

    public CClickWindowPacket()
    {
    }

    public CClickWindowPacket(int p_i650_1_, int p_i650_2_, int p_i650_3_, ClickType p_i650_4_, ItemStack p_i650_5_, short p_i650_6_)
    {
        this.windowId = p_i650_1_;
        this.slotId = p_i650_2_;
        this.packedClickData = p_i650_3_;
        this.clickedItem = p_i650_5_.copy();
        this.actionNumber = p_i650_6_;
        this.mode = p_i650_4_;
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processClickWindow(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readByte();
        this.slotId = buf.readShort();
        this.packedClickData = buf.readByte();
        this.actionNumber = buf.readShort();
        this.mode = buf.readEnumValue(ClickType.class);
        this.clickedItem = buf.readItemStack();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.windowId);
        buf.writeShort(this.slotId);
        buf.writeByte(this.packedClickData);
        buf.writeShort(this.actionNumber);
        buf.writeEnumValue(this.mode);
        buf.writeItemStack(this.clickedItem);
    }

    public int getWindowId()
    {
        return this.windowId;
    }

    public int getSlotId()
    {
        return this.slotId;
    }

    public int getUsedButton()
    {
        return this.packedClickData;
    }

    public short getActionNumber()
    {
        return this.actionNumber;
    }

    public ItemStack getClickedItem()
    {
        return this.clickedItem;
    }

    public ClickType getClickType()
    {
        return this.mode;
    }
}
