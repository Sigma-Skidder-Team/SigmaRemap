// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.io.IOException;
import java.io.DataOutput;
import java.util.List;

public class Class53 extends Class38<Class45>
{
    public static final Class6068<Class53> field132;
    private int[] field133;
    
    public Class53(final int[] field133) {
        this.field133 = field133;
    }
    
    public Class53(final List<Integer> list) {
        this(toArray(list));
    }
    
    private static int[] toArray(final List<Integer> list) {
        final int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            final Integer n = list.get(i);
            array[i] = ((n != null) ? n : 0);
        }
        return array;
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field133.length);
        final int[] field133 = this.field133;
        for (int length = field133.length, i = 0; i < length; ++i) {
            dataOutput.writeInt(field133[i]);
        }
    }
    
    @Override
    public byte method260() {
        return 11;
    }
    
    @Override
    public Class6068<Class53> method261() {
        return Class53.field132;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[I;");
        for (int i = 0; i < this.field133.length; ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(this.field133[i]);
        }
        return sb.append(']').toString();
    }
    
    public Class53 method357() {
        final int[] array = new int[this.field133.length];
        System.arraycopy(this.field133, 0, array, 0, this.field133.length);
        return new Class53(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class53 && Arrays.equals(this.field133, ((Class53)o).field133));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.field133);
    }
    
    public int[] method358() {
        return this.field133;
    }
    
    @Override
    public Class2250 method263(final String s, final int n) {
        final Class2250 method8457 = new Class2260("[").method8458(new Class2260("I").method8469(Class53.field101)).method8457(";");
        for (int i = 0; i < this.field133.length; ++i) {
            method8457.method8457(" ").method8458(new Class2260(String.valueOf(this.field133[i])).method8469(Class53.field100));
            if (i != this.field133.length - 1) {
                method8457.method8457(",");
            }
        }
        method8457.method8457("]");
        return method8457;
    }
    
    @Override
    public int size() {
        return this.field133.length;
    }
    
    @Override
    public Class45 get(final int n) {
        return Class45.method279(this.field133[n]);
    }
    
    @Override
    public Class45 set(final int n, final Class45 class45) {
        final int n2 = this.field133[n];
        this.field133[n] = class45.method271();
        return Class45.method279(n2);
    }
    
    @Override
    public void add(final int n, final Class45 class45) {
        this.field133 = ArrayUtils.add(this.field133, n, class45.method271());
    }
    
    @Override
    public boolean method257(final int n, final Class41 class41) {
        if (!(class41 instanceof Class43)) {
            return false;
        }
        this.field133[n] = ((Class43)class41).method271();
        return true;
    }
    
    @Override
    public boolean method258(final int n, final Class41 class41) {
        if (!(class41 instanceof Class43)) {
            return false;
        }
        this.field133 = ArrayUtils.add(this.field133, n, ((Class43)class41).method271());
        return true;
    }
    
    @Override
    public Class45 remove(final int n) {
        final int n2 = this.field133[n];
        this.field133 = ArrayUtils.remove(this.field133, n);
        return Class45.method279(n2);
    }
    
    @Override
    public void clear() {
        this.field133 = new int[0];
    }
    
    static {
        field132 = new Class6079();
    }
}
