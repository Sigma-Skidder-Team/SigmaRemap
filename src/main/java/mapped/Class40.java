// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.io.IOException;
import java.io.DataOutput;
import java.util.List;

public class Class40 extends Class38<Class47>
{
    public static final Class6068<Class40> field96;
    private byte[] field97;
    
    public Class40(final byte[] field97) {
        this.field97 = field97;
    }
    
    public Class40(final List<Byte> list) {
        this(toArray(list));
    }
    
    private static byte[] toArray(final List<Byte> list) {
        final byte[] array = new byte[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            final Byte b = list.get(i);
            array[i] = (byte)((b != null) ? ((byte)b) : 0);
        }
        return array;
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field97.length);
        dataOutput.write(this.field97);
    }
    
    @Override
    public byte method260() {
        return 7;
    }
    
    @Override
    public Class6068<Class40> method261() {
        return Class40.field96;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[B;");
        for (int i = 0; i < this.field97.length; ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(this.field97[i]).append('B');
        }
        return sb.append(']').toString();
    }
    
    @Override
    public Class41 method265() {
        final byte[] array = new byte[this.field97.length];
        System.arraycopy(this.field97, 0, array, 0, this.field97.length);
        return new Class40(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class40 && Arrays.equals(this.field97, ((Class40)o).field97));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.field97);
    }
    
    @Override
    public Class2250 method263(final String s, final int n) {
        final Class2250 method8469 = new Class2260("B").method8469(Class40.field101);
        final Class2250 method8470 = new Class2260("[").method8458(method8469).method8457(";");
        for (int i = 0; i < this.field97.length; ++i) {
            method8470.method8457(" ").method8458(new Class2260(String.valueOf(this.field97[i])).method8469(Class40.field100)).method8458(method8469);
            if (i != this.field97.length - 1) {
                method8470.method8457(",");
            }
        }
        method8470.method8457("]");
        return method8470;
    }
    
    public byte[] method266() {
        return this.field97;
    }
    
    @Override
    public int size() {
        return this.field97.length;
    }
    
    @Override
    public Class47 get(final int n) {
        return Class47.method283(this.field97[n]);
    }
    
    @Override
    public Class47 set(final int n, final Class47 class47) {
        final byte b = this.field97[n];
        this.field97[n] = class47.method273();
        return Class47.method283(b);
    }
    
    @Override
    public void add(final int n, final Class47 class47) {
        this.field97 = ArrayUtils.add(this.field97, n, class47.method273());
    }
    
    @Override
    public boolean method257(final int n, final Class41 class41) {
        if (!(class41 instanceof Class43)) {
            return false;
        }
        this.field97[n] = ((Class43)class41).method273();
        return true;
    }
    
    @Override
    public boolean method258(final int n, final Class41 class41) {
        if (!(class41 instanceof Class43)) {
            return false;
        }
        this.field97 = ArrayUtils.add(this.field97, n, ((Class43)class41).method273());
        return true;
    }
    
    @Override
    public Class47 remove(final int n) {
        final byte b = this.field97[n];
        this.field97 = ArrayUtils.remove(this.field97, n);
        return Class47.method283(b);
    }
    
    @Override
    public void clear() {
        this.field97 = new byte[0];
    }
    
    static {
        field96 = new Class6081();
    }
}
