// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3813 extends Class3703
{
    private long[] field17346;
    
    public Class3813() {
        super("Chunk Offset Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (this.field17137 != 1668232756L) ? 4 : 8;
        final int n2 = (int)class9131.method33137(4);
        this.field17346 = new long[n2];
        for (int i = 0; i < n2; ++i) {
            this.field17346[i] = class9131.method33137(n);
        }
    }
    
    public long[] method11684() {
        return this.field17346;
    }
}
