// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public final class Class7566
{
    private final Class2111 field29990;
    private final Class7266[] field29991;
    
    public Class2111 method23752() {
        return this.field29990;
    }
    
    public Class7266[] method23753() {
        return this.field29991;
    }
    
    @Override
    public String toString() {
        return "HoverEvent(action=" + this.method23752() + ", value=" + Arrays.deepToString(this.method23753()) + ")";
    }
    
    public Class7566(final Class2111 field29990, final Class7266[] field29991) {
        this.field29990 = field29990;
        this.field29991 = field29991;
    }
}
