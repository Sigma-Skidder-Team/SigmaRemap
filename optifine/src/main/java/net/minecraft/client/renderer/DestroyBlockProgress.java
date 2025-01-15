package net.minecraft.client.renderer;

import net.minecraft.util.math.BlockPos;

public class DestroyBlockProgress implements Comparable<DestroyBlockProgress>
{
    private final int miningPlayerEntId;
    private final BlockPos position;
    private int partialBlockProgress;
    private int createdAtCloudUpdateTick;

    public DestroyBlockProgress(int p_i1312_1_, BlockPos p_i1312_2_)
    {
        this.miningPlayerEntId = p_i1312_1_;
        this.position = p_i1312_2_;
    }

    public BlockPos getPosition()
    {
        return this.position;
    }

    public void setPartialBlockDamage(int damage)
    {
        if (damage > 10)
        {
            damage = 10;
        }

        this.partialBlockProgress = damage;
    }

    public int getPartialBlockDamage()
    {
        return this.partialBlockProgress;
    }

    public void setCloudUpdateTick(int createdAtCloudUpdateTickIn)
    {
        this.createdAtCloudUpdateTick = createdAtCloudUpdateTickIn;
    }

    public int getCreationCloudUpdateTick()
    {
        return this.createdAtCloudUpdateTick;
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass())
        {
            DestroyBlockProgress destroyblockprogress = (DestroyBlockProgress)p_equals_1_;
            return this.miningPlayerEntId == destroyblockprogress.miningPlayerEntId;
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return Integer.hashCode(this.miningPlayerEntId);
    }

    public int compareTo(DestroyBlockProgress p_compareTo_1_)
    {
        return this.partialBlockProgress != p_compareTo_1_.partialBlockProgress ? Integer.compare(this.partialBlockProgress, p_compareTo_1_.partialBlockProgress) : Integer.compare(this.miningPlayerEntId, p_compareTo_1_.miningPlayerEntId);
    }
}
