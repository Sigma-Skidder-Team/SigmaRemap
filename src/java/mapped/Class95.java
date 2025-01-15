// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import javax.annotation.Nullable;

public class Class95<K> implements Class89<K>
{
    private static final Object field257;
    private K[] field258;
    private int[] field259;
    private K[] field260;
    private int field261;
    private int field262;
    
    public Class95(int n) {
        n /= (int)0.8f;
        this.field258 = (K[])new Object[n];
        this.field259 = new int[n];
        this.field260 = (K[])new Object[n];
    }
    
    public int method565(final K k) {
        return this.method566(this.method572(k, this.method571(k)));
    }
    
    @Nullable
    @Override
    public K method499(final int n) {
        return (n >= 0 && n < this.field260.length) ? this.field260[n] : null;
    }
    
    private int method566(final int n) {
        return (n != -1) ? this.field259[n] : -1;
    }
    
    public int method567(final K k) {
        final int method568 = this.method568();
        this.method570(k, method568);
        return method568;
    }
    
    private int method568() {
        while (this.field261 < this.field260.length && this.field260[this.field261] != null) {
            ++this.field261;
        }
        return this.field261;
    }
    
    private void method569(final int n) {
        final K[] field258 = this.field258;
        final int[] field259 = this.field259;
        this.field258 = (K[])new Object[n];
        this.field259 = new int[n];
        this.field260 = (K[])new Object[n];
        this.field261 = 0;
        this.field262 = 0;
        for (int i = 0; i < field258.length; ++i) {
            if (field258[i] != null) {
                this.method570(field258[i], field259[i]);
            }
        }
    }
    
    public void method570(final K k, final int a) {
        if (Math.max(a, this.field262 + 1) >= this.field258.length * 0.8f) {
            int i;
            for (i = this.field258.length << 1; i < a; i <<= 1) {}
            this.method569(i);
        }
        final int method573 = this.method573(this.method571(k));
        this.field258[method573] = k;
        this.field259[method573] = a;
        this.field260[a] = k;
        ++this.field262;
        if (a == this.field261) {
            ++this.field261;
        }
    }
    
    private int method571(final K k) {
        return (Class9546.method35698(System.identityHashCode(k)) & Integer.MAX_VALUE) % this.field258.length;
    }
    
    private int method572(final K k, final int n) {
        for (int i = n; i < this.field258.length; ++i) {
            if (this.field258[i] == k) {
                return i;
            }
            if (this.field258[i] == Class95.field257) {
                return -1;
            }
        }
        for (int j = 0; j < n; ++j) {
            if (this.field258[j] == k) {
                return j;
            }
            if (this.field258[j] == Class95.field257) {
                return -1;
            }
        }
        return -1;
    }
    
    private int method573(final int n) {
        for (int i = n; i < this.field258.length; ++i) {
            if (this.field258[i] == Class95.field257) {
                return i;
            }
        }
        for (int j = 0; j < n; ++j) {
            if (this.field258[j] == Class95.field257) {
                return j;
            }
        }
        throw new RuntimeException("Overflowed :(");
    }
    
    @Override
    public Iterator<K> iterator() {
        return (Iterator<K>)Iterators.filter((Iterator)Iterators.forArray((Object[])this.field260), Predicates.notNull());
    }
    
    public void method574() {
        Arrays.fill(this.field258, null);
        Arrays.fill(this.field260, null);
        this.field261 = 0;
        this.field262 = 0;
    }
    
    public int method575() {
        return this.field262;
    }
    
    static {
        field257 = null;
    }
}
