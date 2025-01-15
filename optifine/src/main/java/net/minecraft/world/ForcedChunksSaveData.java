package net.minecraft.world;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.storage.WorldSavedData;

public class ForcedChunksSaveData extends WorldSavedData
{
    private LongSet chunks = new LongOpenHashSet();

    public ForcedChunksSaveData()
    {
        super("chunks");
    }

    public void read(CompoundNBT nbt)
    {
        this.chunks = new LongOpenHashSet(nbt.getLongArray("Forced"));
    }

    public CompoundNBT write(CompoundNBT compound)
    {
        compound.putLongArray("Forced", this.chunks.toLongArray());
        return compound;
    }

    public LongSet getChunks()
    {
        return this.chunks;
    }
}
