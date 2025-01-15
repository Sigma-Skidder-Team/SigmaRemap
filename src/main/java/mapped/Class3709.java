// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3709 extends Class3703
{
    private long field17056;
    private long[] field17057;
    private long[] field17058;
    
    public Class3709() {
        super("Sample To Group Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17056 = class9131.method33137(4);
        final int n = (int)class9131.method33137(4);
        this.field17057 = new long[n];
        this.field17058 = new long[n];
        for (int i = 0; i < n; ++i) {
            this.field17057[i] = class9131.method33137(4);
            this.field17058[i] = class9131.method33137(4);
        }
    }
    
    public long method11411() {
        return this.field17056;
    }
    
    public long[] method11412() {
        return this.field17057;
    }
    
    public long[] method11413() {
        return this.field17058;
    }
}
