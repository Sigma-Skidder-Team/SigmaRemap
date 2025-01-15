// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3807 extends Class3805
{
    private long field17318;
    private int field17319;
    
    public Class3807() {
        super("3GPP Classification Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.method11652(class9131);
        this.field17318 = class9131.method33137(4);
        this.field17319 = (int)class9131.method33137(2);
    }
    
    public long method11656() {
        return this.field17318;
    }
    
    public int method11657() {
        return this.field17319;
    }
}
