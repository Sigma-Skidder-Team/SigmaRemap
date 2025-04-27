// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.util.function.LongPredicate;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import net.minecraft.util.math.MathHelper;

public abstract class Class1891
{
    private final int field10282;
    private final LongLinkedOpenHashSet[] field10283;
    private final Long2ByteMap field10284;
    private int field10285;
    private volatile boolean field10286;
    
    public Class1891(final int n, final int n2, final int n3) {
        if (n < 254) {
            this.field10282 = n;
            this.field10283 = new LongLinkedOpenHashSet[n];
            for (int i = 0; i < n; ++i) {
                this.field10283[i] = new Class2267(this, n2, 0.5f, n2);
            }
            (this.field10284 = new Class35(this, n3, 0.5f, n3)).defaultReturnValue((byte)(-1));
            this.field10285 = n;
            return;
        }
        throw new IllegalArgumentException("Level count must be < 254.");
    }
    
    private int method7314(final int n, final int n2) {
        int n3 = n;
        if (n > n2) {
            n3 = n2;
        }
        if (n3 > this.field10282 - 1) {
            n3 = this.field10282 - 1;
        }
        return n3;
    }
    
    private void method7315(final int field10285) {
        final int field10286 = this.field10285;
        this.field10285 = field10285;
        for (int i = field10286 + 1; i < field10285; ++i) {
            if (!this.field10283[i].isEmpty()) {
                this.field10285 = i;
                break;
            }
        }
    }
    
    public void method7316(final long n) {
        final int n2 = this.field10284.get(n) & 0xFF;
        if (n2 != 255) {
            this.method7318(n, this.method7314(this.method7302(n), n2), this.field10282, true);
            this.field10286 = (this.field10285 < this.field10282);
        }
    }
    
    public void method7317(final LongPredicate longPredicate) {
        final LongArrayList list = new LongArrayList();
        this.field10284.keySet().forEach(n2 -> {
            if (longPredicate2.test(n2)) {
                list2.add(n2);
            }
            return;
        });
        ((LongList)list).forEach(this::method7316);
    }
    
    private void method7318(final long n, final int n2, final int n3, final boolean b) {
        if (b) {
            this.field10284.remove(n);
        }
        this.field10283[n2].remove(n);
        if (this.field10283[n2].isEmpty()) {
            if (this.field10285 == n2) {
                this.method7315(n3);
            }
        }
    }
    
    private void method7319(final long n, final int n2, final int field10285) {
        this.field10284.put(n, (byte)n2);
        this.field10283[field10285].add(n);
        if (this.field10285 > field10285) {
            this.field10285 = field10285;
        }
    }
    
    public void method7294(final long n) {
        this.method7320(n, n, this.field10282 - 1, false);
    }
    
    public void method7320(final long n, final long n2, final int n3, final boolean b) {
        this.method7321(n, n2, n3, this.method7302(n2), this.field10284.get(n2) & 0xFF, b);
        this.field10286 = (this.field10285 < this.field10282);
    }
    
    private void method7321(final long n, final long n2, int method35651, int method35652, int a, final boolean b) {
        if (!this.method7300(n2)) {
            method35651 = MathHelper.method35651(method35651, 0, this.field10282 - 1);
            method35652 = MathHelper.method35651(method35652, 0, this.field10282 - 1);
            boolean b2;
            if (a != 255) {
                b2 = false;
            }
            else {
                b2 = true;
                a = method35652;
            }
            int n3;
            if (!b) {
                n3 = MathHelper.method35651(this.method7301(n2, n, method35651), 0, this.field10282 - 1);
            }
            else {
                n3 = Math.min(a, method35651);
            }
            final int method35653 = this.method7314(method35652, a);
            if (method35652 == n3) {
                if (!b2) {
                    this.method7318(n2, method35653, this.field10282, true);
                }
            }
            else {
                final int method35654 = this.method7314(method35652, n3);
                if (method35653 != method35654) {
                    if (!b2) {
                        this.method7318(n2, method35653, method35654, false);
                    }
                }
                this.method7319(n2, n3, method35654);
            }
        }
    }
    
    public final void method7322(final long n, final long n2, final int n3, final boolean b) {
        final int n4 = this.field10284.get(n2) & 0xFF;
        final int method35651 = MathHelper.method35651(this.method7305(n, n2, n3), 0, this.field10282 - 1);
        if (!b) {
            int method35652;
            boolean b2;
            if (n4 != 255) {
                method35652 = n4;
                b2 = false;
            }
            else {
                b2 = true;
                method35652 = MathHelper.method35651(this.method7302(n2), 0, this.field10282 - 1);
            }
            if (method35651 == method35652) {
                this.method7321(n, n2, this.field10282 - 1, b2 ? method35652 : this.method7302(n2), n4, false);
            }
        }
        else {
            this.method7321(n, n2, method35651, this.method7302(n2), n4, true);
        }
    }
    
    public final boolean method7323() {
        return this.field10286;
    }
    
    public final int method7324(int n) {
        if (this.field10285 < this.field10282) {
            while (this.field10285 < this.field10282 && n > 0) {
                --n;
                final LongLinkedOpenHashSet set = this.field10283[this.field10285];
                if (set.isEmpty()) {
                    return 0;
                }
                final long removeFirstLong = set.removeFirstLong();
                final int method35651 = MathHelper.method35651(this.method7302(removeFirstLong), 0, this.field10282 - 1);
                if (set.isEmpty()) {
                    this.method7315(this.field10282);
                }
                final int n2 = this.field10284.remove(removeFirstLong) & 0xFF;
                if (n2 >= method35651) {
                    if (n2 <= method35651) {
                        continue;
                    }
                    this.method7319(removeFirstLong, n2, this.method7314(this.field10282 - 1, n2));
                    this.method7304(removeFirstLong, this.field10282 - 1);
                    this.method7326(removeFirstLong, method35651, false);
                }
                else {
                    this.method7304(removeFirstLong, n2);
                    this.method7326(removeFirstLong, n2, true);
                }
            }
            this.field10286 = (this.field10285 < this.field10282);
            return n;
        }
        return n;
    }
    
    public int method7325() {
        return this.field10284.size();
    }
    
    public abstract boolean method7300(final long p0);
    
    public abstract int method7301(final long p0, final long p1, final int p2);
    
    public abstract void method7326(final long p0, final int p1, final boolean p2);
    
    public abstract int method7302(final long p0);
    
    public abstract void method7304(final long p0, final int p1);
    
    public abstract int method7305(final long p0, final long p1, final int p2);
}
