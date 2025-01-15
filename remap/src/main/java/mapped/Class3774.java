// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3774 extends Class3703
{
    public static final long field17231 = 1769239918L;
    private long field17232;
    private long field17233;
    private String field17234;
    
    public Class3774() {
        super("Scheme Type Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17232 = class9131.method33137(4);
        this.field17233 = class9131.method33137(4);
        this.field17234 = (((this.field17027 & 0x1) != 0x1) ? null : class9131.method33140((int)this.method11491(class9131), "UTF-8"));
    }
    
    public long method11577() {
        return this.field17232;
    }
    
    public long method11578() {
        return this.field17233;
    }
    
    public String method11579() {
        return this.field17234;
    }
}
