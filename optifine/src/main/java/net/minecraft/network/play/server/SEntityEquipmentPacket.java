package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SEntityEquipmentPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityID;
    private EquipmentSlotType equipmentSlot;
    private ItemStack itemStack = ItemStack.EMPTY;

    public SEntityEquipmentPacket()
    {
    }

    public SEntityEquipmentPacket(int p_i2111_1_, EquipmentSlotType p_i2111_2_, ItemStack p_i2111_3_)
    {
        this.entityID = p_i2111_1_;
        this.equipmentSlot = p_i2111_2_;
        this.itemStack = p_i2111_3_.copy();
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityID = buf.readVarInt();
        this.equipmentSlot = buf.readEnumValue(EquipmentSlotType.class);
        this.itemStack = buf.readItemStack();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityID);
        buf.writeEnumValue(this.equipmentSlot);
        buf.writeItemStack(this.itemStack);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleEntityEquipment(this);
    }

    public ItemStack getItemStack()
    {
        return this.itemStack;
    }

    public int getEntityID()
    {
        return this.entityID;
    }

    public EquipmentSlotType getEquipmentSlot()
    {
        return this.equipmentSlot;
    }
}
