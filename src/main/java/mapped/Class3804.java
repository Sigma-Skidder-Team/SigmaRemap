// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3804 extends Class3703
{
    private long[] field17313;
    private long[] field17314;
    
    public Class3804() {
        super("Time To Sample Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (int)class9131.method33137(4);
        this.field17313 = new long[n];
        this.field17314 = new long[n];
        for (int i = 0; i < n; ++i) {
            this.field17313[i] = class9131.method33137(4);
            this.field17314[i] = class9131.method33137(4);
        }
    }
    
    public long[] method11650() {
        return this.field17313;
    }
    
    public long[] method11651() {
        return this.field17314;
    }
}
