// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.IntSupplier;

public class Class9206 implements IntSupplier
{
    private static String[] field38999;
    private int field39000;
    private int field39001;
    public final /* synthetic */ Class4837 field39002;
    
    public Class9206(final Class4837 field39002) {
        this.field39002 = field39002;
        this.field39000 = 0;
        this.field39001 = 1;
    }
    
    @Override
    public int getAsInt() {
        final int field39001 = this.field39000 + this.field39001;
        this.field39000 = this.field39001;
        this.field39001 = field39001;
        return this.field39000;
    }
}
