package net.minecraft.util.palette;

import javax.annotation.Nullable;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.PacketBuffer;

public interface IPalette<T>
{
    int idFor(T state);

    boolean contains(T value);

    @Nullable
    T get(int indexKey);

    void read(PacketBuffer buf);

    void write(PacketBuffer buf);

    int getSerializedSize();

    void read(ListNBT nbt);
}
