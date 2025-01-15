package net.minecraft.block;

import net.minecraft.util.math.BlockPos;

public class BlockEventData
{
    private final BlockPos position;
    private final Block blockType;
    private final int eventID;
    private final int eventParameter;

    public BlockEventData(BlockPos p_i1005_1_, Block p_i1005_2_, int p_i1005_3_, int p_i1005_4_)
    {
        this.position = p_i1005_1_;
        this.blockType = p_i1005_2_;
        this.eventID = p_i1005_3_;
        this.eventParameter = p_i1005_4_;
    }

    public BlockPos getPosition()
    {
        return this.position;
    }

    public Block getBlock()
    {
        return this.blockType;
    }

    public int getEventID()
    {
        return this.eventID;
    }

    public int getEventParameter()
    {
        return this.eventParameter;
    }

    public boolean equals(Object p_equals_1_)
    {
        if (!(p_equals_1_ instanceof BlockEventData))
        {
            return false;
        }
        else
        {
            BlockEventData blockeventdata = (BlockEventData)p_equals_1_;
            return this.position.equals(blockeventdata.position) && this.eventID == blockeventdata.eventID && this.eventParameter == blockeventdata.eventParameter && this.blockType == blockeventdata.blockType;
        }
    }

    public int hashCode()
    {
        int i = this.position.hashCode();
        i = 31 * i + this.blockType.hashCode();
        i = 31 * i + this.eventID;
        i = 31 * i + this.eventParameter;
        return i;
    }

    public String toString()
    {
        return "TE(" + this.position + ")," + this.eventID + "," + this.eventParameter + "," + this.blockType;
    }
}
