// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.io.IOException;
import java.io.DataOutput;
import java.util.List;
import it.unimi.dsi.fastutil.longs.LongSet;

public class Class39 extends Class38<Class49>
{
    public static final Class6068<Class39> field94;
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
    public void method259(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field95.length);
        final long[] field95 = this.field95;
        for (int length = field95.length, i = 0; i < length; ++i) {
            dataOutput.writeLong(field95[i]);
        }
    }
    
    @Override
    public byte method260() {
        return 12;
    }
    
    @Override
    public Class6068<Class39> method261() {
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
    public Class2250 method263(final String s, final int n) {
        final Class2250 method8469 = new Class2260("L").method8469(Class39.field101);
        final Class2250 method8470 = new Class2260("[").method8458(method8469).method8457(";");
        for (int i = 0; i < this.field95.length; ++i) {
            method8470.method8457(" ").method8458(new Class2260(String.valueOf(this.field95[i])).method8469(Class39.field100)).method8458(method8469);
            if (i != this.field95.length - 1) {
                method8470.method8457(",");
            }
        }
        method8470.method8457("]");
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
    public boolean method257(final int n, final Class41 class41) {
        if (!(class41 instanceof Class43)) {
            return false;
        }
        this.field95[n] = ((Class43)class41).method270();
        return true;
    }
    
    @Override
    public boolean method258(final int n, final Class41 class41) {
        if (!(class41 instanceof Class43)) {
            return false;
        }
        this.field95 = ArrayUtils.add(this.field95, n, ((Class43)class41).method270());
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
