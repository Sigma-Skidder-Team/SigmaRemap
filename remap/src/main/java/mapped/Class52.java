// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import java.util.Arrays;
import com.google.common.base.Strings;
import java.util.Objects;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.Iterator;
import java.io.DataOutput;
import com.google.common.collect.Lists;
import java.util.List;
import it.unimi.dsi.fastutil.bytes.ByteSet;
import net.minecraft.util.text.ITextComponent;

public class Class52 extends Class38<Class41>
{
    public static final Class6068<Class52> field128;
    private static final ByteSet field129;
    private final List<Class41> field130;
    private byte field131;
    
    private Class52(final List<Class41> field130, final byte field131) {
        this.field130 = field130;
        this.field131 = field131;
    }
    
    public Class52() {
        this(Lists.newArrayList(), (byte)0);
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
        if (!this.field130.isEmpty()) {
            this.field131 = this.field130.get(0).method260();
        }
        else {
            this.field131 = 0;
        }
        dataOutput.writeByte(this.field131);
        dataOutput.writeInt(this.field130.size());
        final Iterator<Class41> iterator = this.field130.iterator();
        while (iterator.hasNext()) {
            iterator.next().method259(dataOutput);
        }
    }
    
    @Override
    public byte method260() {
        return 9;
    }
    
    @Override
    public Class6068<Class52> method261() {
        return Class52.field128;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.field130.size(); ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(this.field130.get(i));
        }
        return sb.append(']').toString();
    }
    
    private void method345() {
        if (this.field130.isEmpty()) {
            this.field131 = 0;
        }
    }
    
    @Override
    public Class41 remove(final int n) {
        final Class41 class41 = this.field130.remove(n);
        this.method345();
        return class41;
    }
    
    @Override
    public boolean isEmpty() {
        return this.field130.isEmpty();
    }
    
    public Class51 method346(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final Class41 class41 = this.field130.get(n);
                if (class41.method260() == 10) {
                    return (Class51)class41;
                }
            }
        }
        return new Class51();
    }
    
    public Class52 method347(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final Class41 class41 = this.field130.get(n);
                if (class41.method260() == 9) {
                    return (Class52)class41;
                }
            }
        }
        return new Class52();
    }
    
    public short method348(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final Class41 class41 = this.field130.get(n);
                if (class41.method260() == 2) {
                    return ((Class48)class41).method272();
                }
            }
        }
        return 0;
    }
    
    public int method349(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final Class41 class41 = this.field130.get(n);
                if (class41.method260() == 3) {
                    return ((Class45)class41).method271();
                }
            }
        }
        return 0;
    }
    
    public int[] method350(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final Class41 class41 = this.field130.get(n);
                if (class41.method260() == 11) {
                    return ((Class53)class41).method358();
                }
            }
        }
        return new int[0];
    }
    
    public double method351(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final Class41 class41 = this.field130.get(n);
                if (class41.method260() == 6) {
                    return ((Class44)class41).method274();
                }
            }
        }
        return 0.0;
    }
    
    public float method352(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final Class41 class41 = this.field130.get(n);
                if (class41.method260() == 5) {
                    return ((Class46)class41).method275();
                }
            }
        }
        return 0.0f;
    }
    
    public String method353(final int n) {
        if (n >= 0 && n < this.field130.size()) {
            final Class41 class41 = this.field130.get(n);
            return (class41.method260() != 8) ? class41.toString() : class41.method267();
        }
        return "";
    }
    
    @Override
    public int size() {
        return this.field130.size();
    }
    
    @Override
    public Class41 get(final int n) {
        return this.field130.get(n);
    }
    
    @Override
    public Class41 set(final int n, final Class41 class41) {
        final Class41 value = this.get(n);
        if (this.method257(n, class41)) {
            return value;
        }
        throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", class41.method260(), this.field131));
    }
    
    @Override
    public void add(final int n, final Class41 class41) {
        if (this.method258(n, class41)) {
            return;
        }
        throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", class41.method260(), this.field131));
    }
    
    @Override
    public boolean method257(final int n, final Class41 class41) {
        if (!this.method354(class41)) {
            return false;
        }
        this.field130.set(n, class41);
        return true;
    }
    
    @Override
    public boolean method258(final int n, final Class41 class41) {
        if (!this.method354(class41)) {
            return false;
        }
        this.field130.add(n, class41);
        return true;
    }
    
    private boolean method354(final Class41 class41) {
        if (class41.method260() == 0) {
            return false;
        }
        if (this.field131 != 0) {
            return this.field131 == class41.method260();
        }
        this.field131 = class41.method260();
        return true;
    }
    
    public Class52 method355() {
        return new Class52(Lists.newArrayList((Iterable)(Class7638.method24059(this.field131).method18122() ? this.field130 : Iterables.transform((Iterable)this.field130, Class41::method265))), this.field131);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class52 && Objects.equals(this.field130, ((Class52)o).field130));
    }
    
    @Override
    public int hashCode() {
        return this.field130.hashCode();
    }
    
    @Override
    public ITextComponent method263(final String s, final int n) {
        if (this.isEmpty()) {
            return new Class2260("[]");
        }
        if (Class52.field129.contains(this.field131) && this.size() <= 8) {
            final Class2260 class2260 = new Class2260("[");
            for (int i = 0; i < this.field130.size(); ++i) {
                if (i != 0) {
                    class2260.method8457(", ");
                }
                class2260.method8458(this.field130.get(i).method268());
            }
            class2260.method8457("]");
            return class2260;
        }
        final Class2260 class2261 = new Class2260("[");
        if (!s.isEmpty()) {
            class2261.method8457("\n");
        }
        final String value = String.valueOf(',');
        for (int j = 0; j < this.field130.size(); ++j) {
            final Class2260 class2262 = new Class2260(Strings.repeat(s, n + 1));
            class2262.method8458(this.field130.get(j).method263(s, n + 1));
            if (j != this.field130.size() - 1) {
                class2262.method8457(value).method8457(s.isEmpty() ? " " : "\n");
            }
            class2261.method8458(class2262);
        }
        if (!s.isEmpty()) {
            class2261.method8457("\n").method8457(Strings.repeat(s, n));
        }
        class2261.method8457("]");
        return class2261;
    }
    
    public int method356() {
        return this.field131;
    }
    
    @Override
    public void clear() {
        this.field130.clear();
        this.field131 = 0;
    }
    
    static {
        field128 = new Class6074();
        field129 = (ByteSet)new ByteOpenHashSet((Collection)Arrays.asList(1, 2, 3, 4, 5, 6));
    }
}
