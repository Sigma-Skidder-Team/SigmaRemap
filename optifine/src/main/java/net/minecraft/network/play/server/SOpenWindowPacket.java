package net.minecraft.network.play.server;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;

public class SOpenWindowPacket implements IPacket<IClientPlayNetHandler>
{
    private int windowId;
    private int menuId;
    private ITextComponent title;

    public SOpenWindowPacket()
    {
    }

    public SOpenWindowPacket(int p_i1706_1_, ContainerType<?> p_i1706_2_, ITextComponent p_i1706_3_)
    {
        this.windowId = p_i1706_1_;
        this.menuId = Registry.MENU.getId(p_i1706_2_);
        this.title = p_i1706_3_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readVarInt();
        this.menuId = buf.readVarInt();
        this.title = buf.readTextComponent();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.windowId);
        buf.writeVarInt(this.menuId);
        buf.writeTextComponent(this.title);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleOpenWindowPacket(this);
    }

    public int getWindowId()
    {
        return this.windowId;
    }

    @Nullable
    public ContainerType<?> getContainerType()
    {
        return Registry.MENU.getByValue(this.menuId);
    }

    public ITextComponent getTitle()
    {
        return this.title;
    }
}
