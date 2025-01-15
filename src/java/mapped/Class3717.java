// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3717 extends Class3703
{
    private int[] field17083;
    private long[] field17084;
    
    public Class3717() {
        super("FEC Reservoir Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (int)class9131.method33137(2);
        this.field17083 = new int[n];
        this.field17084 = new long[n];
        for (int i = 0; i < n; ++i) {
            this.field17083[i] = (int)class9131.method33137(2);
            this.field17084[i] = class9131.method33137(4);
        }
    }
    
    public int[] method11438() {
        return this.field17083;
    }
    
    public long[] method11439() {
        return this.field17084;
    }
}
