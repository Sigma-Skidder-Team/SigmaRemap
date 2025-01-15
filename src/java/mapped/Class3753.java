// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public abstract class Class3753 extends Class3736
{
    private long field17176;
    
    public Class3753(final String s) {
        super(s);
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        class9131.method33144(6L);
        this.field17176 = class9131.method33137(2);
    }
    
    public long method11540() {
        return this.field17176;
    }
}
