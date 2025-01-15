// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3718 extends Class3703
{
    private long field17085;
    private long field17086;
    private long field17087;
    private Class3747[] field17088;
    
    public Class3718() {
        super("Sample Group Description Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17085 = class9131.method33137(4);
        this.field17086 = ((this.field17026 != 1) ? 0L : class9131.method33137(4));
        final int n = (int)class9131.method33137(4);
    }
    
    public long method11440() {
        return this.field17085;
    }
    
    public long method11441() {
        return this.field17086;
    }
    
    public long method11442() {
        return this.field17087;
    }
}
