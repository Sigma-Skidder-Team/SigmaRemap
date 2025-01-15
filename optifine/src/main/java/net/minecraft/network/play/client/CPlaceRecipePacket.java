package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.util.ResourceLocation;

public class CPlaceRecipePacket implements IPacket<IServerPlayNetHandler>
{
    private int windowId;
    private ResourceLocation recipeId;
    private boolean placeAll;

    public CPlaceRecipePacket()
    {
    }

    public CPlaceRecipePacket(int p_i1964_1_, IRecipe<?> p_i1964_2_, boolean p_i1964_3_)
    {
        this.windowId = p_i1964_1_;
        this.recipeId = p_i1964_2_.getId();
        this.placeAll = p_i1964_3_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readByte();
        this.recipeId = buf.readResourceLocation();
        this.placeAll = buf.readBoolean();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.windowId);
        buf.writeResourceLocation(this.recipeId);
        buf.writeBoolean(this.placeAll);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processPlaceRecipe(this);
    }

    public int getWindowId()
    {
        return this.windowId;
    }

    public ResourceLocation getRecipeId()
    {
        return this.recipeId;
    }

    public boolean shouldPlaceAll()
    {
        return this.placeAll;
    }
}
