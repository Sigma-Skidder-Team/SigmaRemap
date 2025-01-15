// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntList;
import com.google.common.collect.ImmutableList;

public class Class9272
{
    private final ImmutableList<Class7187> field39752;
    private final IntList field39753;
    private final int field39754;
    private int field39755;
    private int field39756;
    private int field39757;
    private final Int2IntMap field39758;
    
    public Class9272(final ImmutableList<Class7187> field39752) {
        this.field39753 = (IntList)new IntArrayList();
        this.field39755 = -1;
        this.field39756 = -1;
        this.field39757 = -1;
        this.field39758 = (Int2IntMap)new Int2IntArrayMap();
        this.field39752 = field39752;
        int n = 0;
        for (final Class7187 class7187 : field39752) {
            this.field39753.add(n);
            final Class2078 method22049 = class7187.method22049();
            if (method22049 != Class2078.field12010) {
                if (method22049 != Class2078.field12011) {
                    if (method22049 != Class2078.field12012) {
                        if (method22049 == Class2078.field12013) {
                            this.field39758.put(class7187.method22051(), n);
                        }
                    }
                    else {
                        this.field39757 = n;
                    }
                }
                else {
                    this.field39756 = n;
                }
            }
            else {
                this.field39755 = n;
            }
            n += class7187.method22052();
        }
        this.field39754 = n;
    }
    
    @Override
    public String toString() {
        return "format: " + this.field39752.size() + " elements: " + this.field39752.stream().map(Object::toString).collect((Collector<? super Object, ?, String>)Collectors.joining(" "));
    }
    
    public int method34193() {
        return this.method34194() / 4;
    }
    
    public int method34194() {
        return this.field39754;
    }
    
    public ImmutableList<Class7187> method34195() {
        return this.field39752;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class9272 class9272 = (Class9272)o;
            return this.field39754 == class9272.field39754 && this.field39752.equals((Object)class9272.field39752);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.field39752.hashCode();
    }
    
    public void method34196(final long n) {
        if (Class8726.method29984()) {
            final int method34194 = this.method34194();
            final ImmutableList<Class7187> method34195 = this.method34195();
            for (int i = 0; i < ((List)method34195).size(); ++i) {
                ((List<Class7187>)method34195).get(i).method22054(n + this.field39753.getInt(i), method34194);
            }
        }
        else {
            Class8726.method29991(() -> this.method34196(n));
        }
    }
    
    public void method34197() {
        if (Class8726.method29984()) {
            final UnmodifiableIterator iterator = this.method34195().iterator();
            while (((Iterator)iterator).hasNext()) {
                ((Class7187)((Iterator)iterator).next()).method22055();
            }
        }
        else {
            Class8726.method29991(this::method34197);
        }
    }
    
    public int method34198(final int n) {
        return this.field39753.getInt(n);
    }
    
    public boolean method34199() {
        return this.field39755 >= 0;
    }
    
    public int method34200() {
        return this.field39755;
    }
    
    public boolean method34201() {
        return this.field39756 >= 0;
    }
    
    public int method34202() {
        return this.field39756;
    }
    
    public boolean method34203() {
        return this.field39757 >= 0;
    }
    
    public int method34204() {
        return this.field39757;
    }
    
    public boolean method34205(final int n) {
        return this.field39758.containsKey(n);
    }
    
    public int method34206(final int n) {
        return this.field39758.get(n);
    }
}
