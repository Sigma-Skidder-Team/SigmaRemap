package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

public class SPlaceGhostRecipePacket implements IPacket<IClientPlayNetHandler>
{
    private int windowId;
    private ResourceLocation recipe;

    public SPlaceGhostRecipePacket()
    {
    }

    public SPlaceGhostRecipePacket(int p_i1777_1_, IRecipe<?> p_i1777_2_)
    {
        this.windowId = p_i1777_1_;
        this.recipe = p_i1777_2_.getId();
    }

    public ResourceLocation getRecipeId()
    {
        return this.recipe;
    }

    public int getWindowId()
    {
        return this.windowId;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readByte();
        this.recipe = buf.readResourceLocation();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.windowId);
        buf.writeResourceLocation(this.recipe);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handlePlaceGhostRecipe(this);
    }
}
