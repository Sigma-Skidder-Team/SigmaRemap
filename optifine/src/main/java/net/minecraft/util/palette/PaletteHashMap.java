package net.minecraft.util.palette;

import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IntIdentityHashBiMap;
import net.minecraft.util.ObjectIntIdentityMap;

public class PaletteHashMap<T> implements IPalette<T>
{
    private final ObjectIntIdentityMap<T> registry;
    private final IntIdentityHashBiMap<T> statePaletteMap;
    private final IResizeCallback<T> paletteResizer;
    private final Function<CompoundNBT, T> deserializer;
    private final Function<T, CompoundNBT> serializer;
    private final int bits;

    public PaletteHashMap(ObjectIntIdentityMap<T> p_i3528_1_, int p_i3528_2_, IResizeCallback<T> p_i3528_3_, Function<CompoundNBT, T> p_i3528_4_, Function<T, CompoundNBT> p_i3528_5_)
    {
        this.registry = p_i3528_1_;
        this.bits = p_i3528_2_;
        this.paletteResizer = p_i3528_3_;
        this.deserializer = p_i3528_4_;
        this.serializer = p_i3528_5_;
        this.statePaletteMap = new IntIdentityHashBiMap<>(1 << p_i3528_2_);
    }

    public int idFor(T state)
    {
        int i = this.statePaletteMap.getId(state);

        if (i == -1)
        {
            i = this.statePaletteMap.add(state);

            if (i >= 1 << this.bits)
            {
                i = this.paletteResizer.onResize(this.bits + 1, state);
            }
        }

        return i;
    }

    public boolean contains(T value)
    {
        return this.statePaletteMap.getId(value) != -1;
    }

    @Nullable
    public T get(int indexKey)
    {
        return this.statePaletteMap.getByValue(indexKey);
    }

    public void read(PacketBuffer buf)
    {
        this.statePaletteMap.clear();
        int i = buf.readVarInt();

        for (int j = 0; j < i; ++j)
        {
            this.statePaletteMap.add(this.registry.getByValue(buf.readVarInt()));
        }
    }

    public void write(PacketBuffer buf)
    {
        int i = this.getPaletteSize();
        buf.writeVarInt(i);

        for (int j = 0; j < i; ++j)
        {
            buf.writeVarInt(this.registry.get(this.statePaletteMap.getByValue(j)));
        }
    }

    public int getSerializedSize()
    {
        int i = PacketBuffer.getVarIntSize(this.getPaletteSize());

        for (int j = 0; j < this.getPaletteSize(); ++j)
        {
            i += PacketBuffer.getVarIntSize(this.registry.get(this.statePaletteMap.getByValue(j)));
        }

        return i;
    }

    public int getPaletteSize()
    {
        return this.statePaletteMap.size();
    }

    public void read(ListNBT nbt)
    {
        this.statePaletteMap.clear();

        for (int i = 0; i < nbt.size(); ++i)
        {
            this.statePaletteMap.add(this.deserializer.apply(nbt.getCompound(i)));
        }
    }

    public void writePaletteToList(ListNBT paletteList)
    {
        for (int i = 0; i < this.getPaletteSize(); ++i)
        {
            paletteList.add(this.serializer.apply(this.statePaletteMap.getByValue(i)));
        }
    }
}
