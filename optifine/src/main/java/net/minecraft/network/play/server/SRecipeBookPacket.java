package net.minecraft.network.play.server;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

public class SRecipeBookPacket implements IPacket<IClientPlayNetHandler>
{
    private SRecipeBookPacket.State state;
    private List<ResourceLocation> recipes;
    private List<ResourceLocation> displayedRecipes;
    private boolean guiOpen;
    private boolean filteringCraftable;
    private boolean field_202494_f;
    private boolean field_202495_g;

    public SRecipeBookPacket()
    {
    }

    public SRecipeBookPacket(SRecipeBookPacket.State p_i500_1_, Collection<ResourceLocation> p_i500_2_, Collection<ResourceLocation> p_i500_3_, boolean p_i500_4_, boolean p_i500_5_, boolean p_i500_6_, boolean p_i500_7_)
    {
        this.state = p_i500_1_;
        this.recipes = ImmutableList.copyOf(p_i500_2_);
        this.displayedRecipes = ImmutableList.copyOf(p_i500_3_);
        this.guiOpen = p_i500_4_;
        this.filteringCraftable = p_i500_5_;
        this.field_202494_f = p_i500_6_;
        this.field_202495_g = p_i500_7_;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleRecipeBook(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.state = buf.readEnumValue(SRecipeBookPacket.State.class);
        this.guiOpen = buf.readBoolean();
        this.filteringCraftable = buf.readBoolean();
        this.field_202494_f = buf.readBoolean();
        this.field_202495_g = buf.readBoolean();
        int i = buf.readVarInt();
        this.recipes = Lists.newArrayList();

        for (int j = 0; j < i; ++j)
        {
            this.recipes.add(buf.readResourceLocation());
        }

        if (this.state == SRecipeBookPacket.State.INIT)
        {
            i = buf.readVarInt();
            this.displayedRecipes = Lists.newArrayList();

            for (int k = 0; k < i; ++k)
            {
                this.displayedRecipes.add(buf.readResourceLocation());
            }
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeEnumValue(this.state);
        buf.writeBoolean(this.guiOpen);
        buf.writeBoolean(this.filteringCraftable);
        buf.writeBoolean(this.field_202494_f);
        buf.writeBoolean(this.field_202495_g);
        buf.writeVarInt(this.recipes.size());

        for (ResourceLocation resourcelocation : this.recipes)
        {
            buf.writeResourceLocation(resourcelocation);
        }

        if (this.state == SRecipeBookPacket.State.INIT)
        {
            buf.writeVarInt(this.displayedRecipes.size());

            for (ResourceLocation resourcelocation1 : this.displayedRecipes)
            {
                buf.writeResourceLocation(resourcelocation1);
            }
        }
    }

    public List<ResourceLocation> getRecipes()
    {
        return this.recipes;
    }

    public List<ResourceLocation> getDisplayedRecipes()
    {
        return this.displayedRecipes;
    }

    public boolean isGuiOpen()
    {
        return this.guiOpen;
    }

    public boolean isFilteringCraftable()
    {
        return this.filteringCraftable;
    }

    public boolean isFurnaceGuiOpen()
    {
        return this.field_202494_f;
    }

    public boolean isFurnaceFilteringCraftable()
    {
        return this.field_202495_g;
    }

    public SRecipeBookPacket.State getState()
    {
        return this.state;
    }

    public static enum State
    {
        INIT,
        ADD,
        REMOVE;
    }
}
