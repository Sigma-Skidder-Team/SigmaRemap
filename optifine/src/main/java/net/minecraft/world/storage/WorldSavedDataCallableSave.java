package net.minecraft.world.storage;

public class WorldSavedDataCallableSave implements Runnable
{
    private final WorldSavedData data;

    public WorldSavedDataCallableSave(WorldSavedData p_i1836_1_)
    {
        this.data = p_i1836_1_;
    }

    public void run()
    {
        this.data.markDirty();
    }
}
