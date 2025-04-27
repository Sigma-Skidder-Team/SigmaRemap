// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public abstract class Class7501<M extends Class7501<M>>
{
    private final long[] field29073;
    private final Class7281[] field29074;
    private boolean field29075;
    public final Long2ObjectOpenHashMap<Class7281> field29076;
    
    public Class7501(final Long2ObjectOpenHashMap<Class7281> field29076) {
        this.field29073 = new long[2];
        this.field29074 = new Class7281[2];
        this.field29076 = field29076;
        this.method23399();
        this.field29075 = true;
    }
    
    public abstract M method23390();
    
    public void method23394(final long n) {
        this.field29076.put(n, (Object) this.field29076.get(n).method22328());
        this.method23399();
    }
    
    public boolean method23395(final long n) {
        return this.field29076.containsKey(n);
    }
    
    @Nullable
    public Class7281 method23396(final long n) {
        if (this.field29075) {
            for (int i = 0; i < 2; ++i) {
                if (n == this.field29073[i]) {
                    return this.field29074[i];
                }
            }
        }
        final Class7281 class7281 = this.field29076.get(n);
        if (class7281 != null) {
            if (this.field29075) {
                for (int j = 1; j > 0; --j) {
                    this.field29073[j] = this.field29073[j - 1];
                    this.field29074[j] = this.field29074[j - 1];
                }
                this.field29073[0] = n;
                this.field29074[0] = class7281;
            }
            return class7281;
        }
        return null;
    }
    
    @Nullable
    public Class7281 method23397(final long n) {
        return this.field29076.remove(n);
    }
    
    public void method23398(final long n, final Class7281 class7281) {
        this.field29076.put(n, (Object)class7281);
    }
    
    public void method23399() {
        for (int i = 0; i < 2; ++i) {
            this.field29073[i] = Long.MAX_VALUE;
            this.field29074[i] = null;
        }
    }
    
    public void method23400() {
        this.field29075 = false;
    }
}
