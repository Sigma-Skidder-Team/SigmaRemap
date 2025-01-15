// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3818 extends Class3703
{
    private boolean field17352;
    private String field17353;
    private String field17354;
    
    public Class3818() {
        super("Data Entry Urn Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17352 = ((this.field17027 & 0x1) == 0x1);
        if (!this.field17352) {
            this.field17353 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
            if (this.method11491(class9131) > 0L) {
                this.field17354 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
            }
        }
    }
    
    public boolean method11691() {
        return this.field17352;
    }
    
    public String method11692() {
        return this.field17353;
    }
    
    public String method11693() {
        return this.field17354;
    }
}
