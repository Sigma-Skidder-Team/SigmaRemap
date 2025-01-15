// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Comparator;

public class Class7628
{
    public static final Comparator<Class7628> field30208;
    private final Class6516 field30209;
    private final Class9290 field30210;
    private final String field30211;
    private int field30212;
    private boolean field30213;
    private boolean field30214;
    
    public Class7628(final Class6516 field30209, final Class9290 field30210, final String field30211) {
        this.field30209 = field30209;
        this.field30210 = field30210;
        this.field30211 = field30211;
        this.field30213 = true;
        this.field30214 = true;
    }
    
    public void method23967(final int n) {
        if (!this.field30210.method34313().method35140()) {
            this.method23971(this.method23969() + n);
            return;
        }
        throw new IllegalStateException("Cannot modify read-only score");
    }
    
    public void method23968() {
        this.method23967(1);
    }
    
    public int method23969() {
        return this.field30212;
    }
    
    public void method23970() {
        this.method23971(0);
    }
    
    public void method23971(final int field30212) {
        final int field30213 = this.field30212;
        this.field30212 = field30212;
        if (field30213 != field30212 || this.field30214) {
            this.field30214 = false;
            this.method23974().method19611(this);
        }
    }
    
    @Nullable
    public Class9290 method23972() {
        return this.field30210;
    }
    
    public String method23973() {
        return this.field30211;
    }
    
    public Class6516 method23974() {
        return this.field30209;
    }
    
    public boolean method23975() {
        return this.field30213;
    }
    
    public void method23976(final boolean field30213) {
        this.field30213 = field30213;
    }
    
    static {
        field30208 = ((class7628, class7629) -> {
            if (class7628.method23969() <= class7629.method23969()) {
                return (class7628.method23969() >= class7629.method23969()) ? class7629.method23973().compareToIgnoreCase(class7628.method23973()) : -1;
            }
            else {
                return 1;
            }
        });
    }
}
