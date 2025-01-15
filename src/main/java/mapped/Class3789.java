// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3789 extends Class3703
{
    private long[] field17284;
    
    public Class3789() {
        super("Sync Sample Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (int)class9131.method33137(4);
        this.field17284 = new long[n];
        for (int i = 0; i < n; ++i) {
            this.field17284[i] = class9131.method33137(4);
        }
    }
    
    public long[] method11621() {
        return this.field17284;
    }
}
