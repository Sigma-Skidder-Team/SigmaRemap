// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.CollectionNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.ArrayUtils;

import java.io.DataInput;
import java.util.Arrays;
import java.io.IOException;
import java.io.DataOutput;
import java.util.List;
import it.unimi.dsi.fastutil.longs.LongSet;

public class LongArrayNBT extends CollectionNBT<LongNBT>
{
    public static final INBTType<LongArrayNBT> TYPE = new INBTType<LongArrayNBT>()
    {
        public LongArrayNBT func_225649_b_(DataInput p_225649_1_, int p_225649_2_, NBTSizeTracker p_225649_3_) throws IOException
        {
            p_225649_3_.read(192L);
            int i = p_225649_1_.readInt();
            p_225649_3_.read(64L * (long)i);
            long[] along = new long[i];

            for (int j = 0; j < i; ++j)
            {
                along[j] = p_225649_1_.readLong();
            }

            return new LongArrayNBT(along);
        }
        public String func_225648_a_()
        {
            return "LONG[]";
        }
        public String func_225650_b_()
        {
            return "TAG_Long_Array";
        }
    };
    private long[] data;
    
    public LongArrayNBT(final long[] field95) {
        this.data = field95;
    }
    
    public LongArrayNBT(final LongSet set) {
        this.data = set.toLongArray();
    }
    
    public LongArrayNBT(final List<Long> list) {
        this(toArray(list));
    }
    
    private static long[] toArray(final List<Long> list) {
        final long[] array = new long[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            final Long n = list.get(i);
            array[i] = ((n != null) ? n : 0L);
        }
        return array;
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.data.length);
        final long[] field95 = this.data;
        for (int length = field95.length, i = 0; i < length; ++i) {
            dataOutput.writeLong(field95[i]);
        }
    }
    
    @Override
    public byte getId() {
        return 12;
    }
    
    @Override
    public INBTType<LongArrayNBT> getType() {
        return LongArrayNBT.TYPE;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[L;");
        for (int i = 0; i < this.data.length; ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(this.data[i]).append('L');
        }
        return sb.append(']').toString();
    }
    
    public LongArrayNBT copy() {
        final long[] array = new long[this.data.length];
        System.arraycopy(this.data, 0, array, 0, this.data.length);
        return new LongArrayNBT(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof LongArrayNBT && Arrays.equals(this.data, ((LongArrayNBT)o).data));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.data);
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        final ITextComponent method8469 = new StringTextComponent("L").applyTextStyle(LongArrayNBT.SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
        final ITextComponent method8470 = new StringTextComponent("[").appendSibling(method8469).appendText(";");
        for (int i = 0; i < this.data.length; ++i) {
            method8470.appendText(" ").appendSibling(new StringTextComponent(String.valueOf(this.data[i])).applyTextStyle(LongArrayNBT.SYNTAX_HIGHLIGHTING_NUMBER)).appendSibling(method8469);
            if (i != this.data.length - 1) {
                method8470.appendText(",");
            }
        }
        method8470.appendText("]");
        return method8470;
    }
    
    public long[] getAsLongArray() {
        return this.data;
    }
    
    @Override
    public int size() {
        return this.data.length;
    }
    
    @Override
    public LongNBT get(final int n) {
        return LongNBT.method288(this.data[n]);
    }
    
    @Override
    public LongNBT set(final int n, final LongNBT class49) {
        final long n2 = this.data[n];
        this.data[n] = class49.getLong();
        return LongNBT.method288(n2);
    }
    
    @Override
    public void add(final int n, final LongNBT class49) {
        this.data = ArrayUtils.add(this.data, n, class49.getLong());
    }
    
    @Override
    public boolean func_218659_a(final int n, final INBT class41) {
        if (!(class41 instanceof NumberNBT)) {
            return false;
        }
        this.data[n] = ((NumberNBT)class41).getLong();
        return true;
    }
    
    @Override
    public boolean func_218660_b(final int n, final INBT class41) {
        if (!(class41 instanceof NumberNBT)) {
            return false;
        }
        this.data = ArrayUtils.add(this.data, n, ((NumberNBT)class41).getLong());
        return true;
    }
    
    @Override
    public LongNBT remove(final int n) {
        final long n2 = this.data[n];
        this.data = ArrayUtils.remove(this.data, n);
        return LongNBT.method288(n2);
    }
    
    @Override
    public void clear() {
        this.data = new long[0];
    }
}
