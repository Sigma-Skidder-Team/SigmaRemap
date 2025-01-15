// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3814 extends Class3703
{
    private long[][] field17347;
    private long[][] field17348;
    
    public Class3814() {
        super("FD Session Group Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (int)class9131.method33137(2);
        this.field17347 = new long[n][];
        this.field17348 = new long[n][];
        for (int i = 0; i < n; ++i) {
            final int method33135 = class9131.method33135();
            this.field17347[i] = new long[method33135];
            for (int j = 0; j < method33135; ++j) {
                this.field17347[i][j] = class9131.method33137(4);
            }
            final int n2 = (int)class9131.method33137(2);
            this.field17348[i] = new long[n2];
            for (int k = 0; k < n2; ++k) {
                this.field17348[i][k] = class9131.method33137(4);
            }
        }
    }
    
    public long[][] method11685() {
        return this.field17347;
    }
    
    public long[][] method11686() {
        return this.field17348;
    }
}
