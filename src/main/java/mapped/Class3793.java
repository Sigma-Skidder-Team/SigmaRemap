// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3793 extends Class3703
{
    private long field17293;
    
    public Class3793() {
        super("Movie Extends Header Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17293 = class9131.method33137((this.field17026 != 1) ? 4 : 8);
    }
    
    public long method11630() {
        return this.field17293;
    }
}
