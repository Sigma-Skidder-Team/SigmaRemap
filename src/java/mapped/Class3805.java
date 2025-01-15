// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3805 extends Class3703
{
    private static String[] field17025;
    private String field17315;
    private String field17316;
    
    public Class3805(final String s) {
        super(s);
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.method11652(class9131);
        this.field17316 = class9131.method33141((int)this.method11491(class9131));
    }
    
    public void method11652(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17315 = Class8805.method30719(class9131.method33137(2));
    }
    
    public String method11653() {
        return this.field17315;
    }
    
    public String method11654() {
        return this.field17316;
    }
}
