// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3758 extends Class3753
{
    private int field17185;
    private int field17186;
    private long field17187;
    
    public Class3758() {
        super("RTP Hint Sample Entry");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17185 = (int)class9131.method33137(2);
        this.field17186 = (int)class9131.method33137(2);
        this.field17187 = class9131.method33137(4);
    }
    
    public long method11547() {
        return this.field17187;
    }
}
