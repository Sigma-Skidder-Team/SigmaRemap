package net.minecraft.util;

import net.minecraft.nbt.CompoundNBT;

public class WeightedSpawnerEntity extends WeightedRandom.Item
{
    private final CompoundNBT nbt;

    public WeightedSpawnerEntity()
    {
        super(1);
        this.nbt = new CompoundNBT();
        this.nbt.putString("id", "minecraft:pig");
    }

    public WeightedSpawnerEntity(CompoundNBT p_i3266_1_)
    {
        this(p_i3266_1_.contains("Weight", 99) ? p_i3266_1_.getInt("Weight") : 1, p_i3266_1_.getCompound("Entity"));
    }

    public WeightedSpawnerEntity(int p_i3267_1_, CompoundNBT p_i3267_2_)
    {
        super(p_i3267_1_);
        this.nbt = p_i3267_2_;
    }

    public CompoundNBT toCompoundTag()
    {
        CompoundNBT compoundnbt = new CompoundNBT();

        if (!this.nbt.contains("id", 8))
        {
            this.nbt.putString("id", "minecraft:pig");
        }
        else if (!this.nbt.getString("id").contains(":"))
        {
            this.nbt.putString("id", (new ResourceLocation(this.nbt.getString("id"))).toString());
        }

        compoundnbt.put("Entity", this.nbt);
        compoundnbt.putInt("Weight", this.itemWeight);
        return compoundnbt;
    }

    public CompoundNBT getNbt()
    {
        return this.nbt;
    }
}
