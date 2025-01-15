// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3721 extends Class3703
{
    private long[] field17093;
    private long[] field17094;
    
    public Class3721() {
        super("Time To Sample Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (int)class9131.method33137(4);
        this.field17093 = new long[n];
        this.field17094 = new long[n];
        for (int i = 0; i < n; ++i) {
            this.field17093[i] = class9131.method33137(4);
            this.field17094[i] = class9131.method33137(4);
        }
    }
    
    public long[] method11447() {
        return this.field17093;
    }
    
    public long[] method11448() {
        return this.field17094;
    }
}
