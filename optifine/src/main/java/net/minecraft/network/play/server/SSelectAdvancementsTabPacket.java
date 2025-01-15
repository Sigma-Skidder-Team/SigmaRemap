package net.minecraft.network.play.server;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

public class SSelectAdvancementsTabPacket implements IPacket<IClientPlayNetHandler>
{
    @Nullable
    private ResourceLocation tab;

    public SSelectAdvancementsTabPacket()
    {
    }

    public SSelectAdvancementsTabPacket(@Nullable ResourceLocation p_i1541_1_)
    {
        this.tab = p_i1541_1_;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleSelectAdvancementsTab(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        if (buf.readBoolean())
        {
            this.tab = buf.readResourceLocation();
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeBoolean(this.tab != null);

        if (this.tab != null)
        {
            buf.writeResourceLocation(this.tab);
        }
    }

    @Nullable
    public ResourceLocation getTab()
    {
        return this.tab;
    }
}
