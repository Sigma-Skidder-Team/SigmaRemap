package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.util.ResourceLocation;

public class CRecipeInfoPacket implements IPacket<IServerPlayNetHandler>
{
    private CRecipeInfoPacket.Purpose purpose;
    private ResourceLocation recipe;
    private boolean isGuiOpen;
    private boolean filteringCraftable;
    private boolean isFurnaceGuiOpen;
    private boolean furnaceFilteringCraftable;
    private boolean field_218782_g;
    private boolean field_218783_h;
    private boolean field_218784_i;
    private boolean field_218785_j;

    public CRecipeInfoPacket()
    {
    }

    public CRecipeInfoPacket(IRecipe<?> p_i2785_1_)
    {
        this.purpose = CRecipeInfoPacket.Purpose.SHOWN;
        this.recipe = p_i2785_1_.getId();
    }

    public CRecipeInfoPacket(boolean p_i2786_1_, boolean p_i2786_2_, boolean p_i2786_3_, boolean p_i2786_4_, boolean p_i2786_5_, boolean p_i2786_6_)
    {
        this.purpose = CRecipeInfoPacket.Purpose.SETTINGS;
        this.isGuiOpen = p_i2786_1_;
        this.filteringCraftable = p_i2786_2_;
        this.isFurnaceGuiOpen = p_i2786_3_;
        this.furnaceFilteringCraftable = p_i2786_4_;
        this.field_218782_g = p_i2786_5_;
        this.field_218783_h = p_i2786_6_;
        this.field_218784_i = p_i2786_5_;
        this.field_218785_j = p_i2786_6_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.purpose = buf.readEnumValue(CRecipeInfoPacket.Purpose.class);

        if (this.purpose == CRecipeInfoPacket.Purpose.SHOWN)
        {
            this.recipe = buf.readResourceLocation();
        }
        else if (this.purpose == CRecipeInfoPacket.Purpose.SETTINGS)
        {
            this.isGuiOpen = buf.readBoolean();
            this.filteringCraftable = buf.readBoolean();
            this.isFurnaceGuiOpen = buf.readBoolean();
            this.furnaceFilteringCraftable = buf.readBoolean();
            this.field_218782_g = buf.readBoolean();
            this.field_218783_h = buf.readBoolean();
            this.field_218784_i = buf.readBoolean();
            this.field_218785_j = buf.readBoolean();
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeEnumValue(this.purpose);

        if (this.purpose == CRecipeInfoPacket.Purpose.SHOWN)
        {
            buf.writeResourceLocation(this.recipe);
        }
        else if (this.purpose == CRecipeInfoPacket.Purpose.SETTINGS)
        {
            buf.writeBoolean(this.isGuiOpen);
            buf.writeBoolean(this.filteringCraftable);
            buf.writeBoolean(this.isFurnaceGuiOpen);
            buf.writeBoolean(this.furnaceFilteringCraftable);
            buf.writeBoolean(this.field_218782_g);
            buf.writeBoolean(this.field_218783_h);
            buf.writeBoolean(this.field_218784_i);
            buf.writeBoolean(this.field_218785_j);
        }
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.handleRecipeBookUpdate(this);
    }

    public CRecipeInfoPacket.Purpose getPurpose()
    {
        return this.purpose;
    }

    public ResourceLocation getRecipeId()
    {
        return this.recipe;
    }

    public boolean isGuiOpen()
    {
        return this.isGuiOpen;
    }

    public boolean isFilteringCraftable()
    {
        return this.filteringCraftable;
    }

    public boolean isFurnaceGuiOpen()
    {
        return this.isFurnaceGuiOpen;
    }

    public boolean isFurnaceFilteringCraftable()
    {
        return this.furnaceFilteringCraftable;
    }

    public boolean func_218779_h()
    {
        return this.field_218782_g;
    }

    public boolean func_218778_i()
    {
        return this.field_218783_h;
    }

    public boolean func_218780_j()
    {
        return this.field_218784_i;
    }

    public boolean func_218781_k()
    {
        return this.field_218785_j;
    }

    public static enum Purpose
    {
        SHOWN,
        SETTINGS;
    }
}
