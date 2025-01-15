package net.minecraft.util.palette;

import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ObjectIntIdentityMap;
import org.apache.commons.lang3.ArrayUtils;

public class PaletteArray<T> implements IPalette<T>
{
    private final ObjectIntIdentityMap<T> registry;
    private final T[] states;
    private final IResizeCallback<T> resizeHandler;
    private final Function<CompoundNBT, T> deserializer;
    private final int bits;
    private int arraySize;

    public PaletteArray(ObjectIntIdentityMap<T> p_i3485_1_, int p_i3485_2_, IResizeCallback<T> p_i3485_3_, Function<CompoundNBT, T> p_i3485_4_)
    {
        this.registry = p_i3485_1_;
        this.states = (T[])(new Object[1 << p_i3485_2_]);
        this.bits = p_i3485_2_;
        this.resizeHandler = p_i3485_3_;
        this.deserializer = p_i3485_4_;
    }

    public int idFor(T state)
    {
        for (int i = 0; i < this.arraySize; ++i)
        {
            if (this.states[i] == state)
            {
                return i;
            }
        }

        int j = this.arraySize;

        if (j < this.states.length)
        {
            this.states[j] = state;
            ++this.arraySize;
            return j;
        }
        else
        {
            return this.resizeHandler.onResize(this.bits + 1, state);
        }
    }

    public boolean contains(T value)
    {
        return ArrayUtils.contains(this.states, value);
    }

    @Nullable
    public T get(int indexKey)
    {
        return (T)(indexKey >= 0 && indexKey < this.arraySize ? this.states[indexKey] : null);
    }

    public void read(PacketBuffer buf)
    {
        this.arraySize = buf.readVarInt();

        for (int i = 0; i < this.arraySize; ++i)
        {
            this.states[i] = this.registry.getByValue(buf.readVarInt());
        }
    }

    public void write(PacketBuffer buf)
    {
        buf.writeVarInt(this.arraySize);

        for (int i = 0; i < this.arraySize; ++i)
        {
            buf.writeVarInt(this.registry.get(this.states[i]));
        }
    }

    public int getSerializedSize()
    {
        int i = PacketBuffer.getVarIntSize(this.getPaletteSize());

        for (int j = 0; j < this.getPaletteSize(); ++j)
        {
            i += PacketBuffer.getVarIntSize(this.registry.get(this.states[j]));
        }

        return i;
    }

    public int getPaletteSize()
    {
        return this.arraySize;
    }

    public void read(ListNBT nbt)
    {
        for (int i = 0; i < nbt.size(); ++i)
        {
            this.states[i] = this.deserializer.apply(nbt.getCompound(i));
        }

        this.arraySize = nbt.size();
    }
}
