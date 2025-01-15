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
import java.util.Arrays;
import java.io.IOException;
import java.io.DataOutput;
import java.util.List;
import it.unimi.dsi.fastutil.longs.LongSet;

public class Class39 extends CollectionNBT<Class49>
{
    public static final INBTType<Class39> field94;
    private long[] field95;
    
    public Class39(final long[] field95) {
        this.field95 = field95;
    }
    
    public Class39(final LongSet set) {
        this.field95 = set.toLongArray();
    }
    
    public Class39(final List<Long> list) {
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
        dataOutput.writeInt(this.field95.length);
        final long[] field95 = this.field95;
        for (int length = field95.length, i = 0; i < length; ++i) {
            dataOutput.writeLong(field95[i]);
        }
    }
    
    @Override
    public byte getId() {
        return 12;
    }
    
    @Override
    public INBTType<Class39> getType() {
        return Class39.field94;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[L;");
        for (int i = 0; i < this.field95.length; ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(this.field95[i]).append('L');
        }
        return sb.append(']').toString();
    }
    
    public Class39 method262() {
        final long[] array = new long[this.field95.length];
        System.arraycopy(this.field95, 0, array, 0, this.field95.length);
        return new Class39(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class39 && Arrays.equals(this.field95, ((Class39)o).field95));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.field95);
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        final ITextComponent method8469 = new StringTextComponent("L").applyTextStyle(Class39.SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
        final ITextComponent method8470 = new StringTextComponent("[").appendSibling(method8469).appendText(";");
        for (int i = 0; i < this.field95.length; ++i) {
            method8470.appendText(" ").appendSibling(new StringTextComponent(String.valueOf(this.field95[i])).applyTextStyle(Class39.SYNTAX_HIGHLIGHTING_NUMBER)).appendSibling(method8469);
            if (i != this.field95.length - 1) {
                method8470.appendText(",");
            }
        }
        method8470.appendText("]");
        return method8470;
    }
    
    public long[] method264() {
        return this.field95;
    }
    
    @Override
    public int size() {
        return this.field95.length;
    }
    
    @Override
    public Class49 get(final int n) {
        return Class49.method288(this.field95[n]);
    }
    
    @Override
    public Class49 set(final int n, final Class49 class49) {
        final long n2 = this.field95[n];
        this.field95[n] = class49.method270();
        return Class49.method288(n2);
    }
    
    @Override
    public void add(final int n, final Class49 class49) {
        this.field95 = ArrayUtils.add(this.field95, n, class49.method270());
    }
    
    @Override
    public boolean func_218659_a(final int n, final INBT class41) {
        if (!(class41 instanceof NumberNBT)) {
            return false;
        }
        this.field95[n] = ((NumberNBT)class41).method270();
        return true;
    }
    
    @Override
    public boolean func_218660_b(final int n, final INBT class41) {
        if (!(class41 instanceof NumberNBT)) {
            return false;
        }
        this.field95 = ArrayUtils.add(this.field95, n, ((NumberNBT)class41).method270());
        return true;
    }
    
    @Override
    public Class49 remove(final int n) {
        final long n2 = this.field95[n];
        this.field95 = ArrayUtils.remove(this.field95, n);
        return Class49.method288(n2);
    }
    
    @Override
    public void clear() {
        this.field95 = new long[0];
    }
    
    static {
        field94 = new Class6080();
    }
}
