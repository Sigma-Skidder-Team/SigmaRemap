package net.minecraft.util.palette;

import net.minecraft.nbt.ListNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ObjectIntIdentityMap;

public class PaletteIdentity<T> implements IPalette<T>
{
    private final ObjectIntIdentityMap<T> registry;
    private final T defaultState;

    public PaletteIdentity(ObjectIntIdentityMap<T> p_i3812_1_, T p_i3812_2_)
    {
        this.registry = p_i3812_1_;
        this.defaultState = p_i3812_2_;
    }

    public int idFor(T state)
    {
        int i = this.registry.get(state);
        return i == -1 ? 0 : i;
    }

    public boolean contains(T value)
    {
        return true;
    }

    public T get(int indexKey)
    {
        T t = this.registry.getByValue(indexKey);
        return (T)(t == null ? this.defaultState : t);
    }

    public void read(PacketBuffer buf)
    {
    }

    public void write(PacketBuffer buf)
    {
    }

    public int getSerializedSize()
    {
        return PacketBuffer.getVarIntSize(0);
    }

    public void read(ListNBT nbt)
    {
    }
}
