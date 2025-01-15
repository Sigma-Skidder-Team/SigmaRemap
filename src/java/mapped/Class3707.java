// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3707 extends Class3703
{
    private long[][] field17054;
    
    public Class3707() {
        super("Shadow Sync Sample Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (int)class9131.method33137(4);
        this.field17054 = new long[n][2];
        for (int i = 0; i < n; ++i) {
            this.field17054[i][0] = class9131.method33137(4);
            this.field17054[i][1] = class9131.method33137(4);
        }
    }
    
    public long[][] method11409() {
        return this.field17054;
    }
}
