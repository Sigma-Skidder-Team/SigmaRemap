// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3791 extends Class3703
{
    private long[] field17290;
    private long[] field17291;
    private long[] field17292;
    
    public Class3791() {
        super("Sample To Chunk Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (int)class9131.method33137(4);
        this.field17290 = new long[n];
        this.field17291 = new long[n];
        this.field17292 = new long[n];
        for (int i = 0; i < n; ++i) {
            this.field17290[i] = class9131.method33137(4);
            this.field17291[i] = class9131.method33137(4);
            this.field17292[i] = class9131.method33137(4);
        }
    }
    
    public long[] method11627() {
        return this.field17290;
    }
    
    public long[] method11628() {
        return this.field17291;
    }
    
    public long[] method11629() {
        return this.field17292;
    }
}
