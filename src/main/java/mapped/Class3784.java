// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3784 extends Class3703
{
    private boolean field17270;
    private String field17271;
    
    public Class3784() {
        super("Data Entry Url Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17270 = ((this.field17027 & 0x1) == 0x1);
        if (!this.field17270) {
            this.field17271 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
        }
    }
    
    public boolean method11607() {
        return this.field17270;
    }
    
    public String method11608() {
        return this.field17271;
    }
}
