// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3734 extends Class3703
{
    private String field17130;
    private String field17131;
    
    public Class3734() {
        super("Copyright Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        if (this.field17139.method11492() != 1969517665L) {
            if (this.field17139.method11492() == 1768715124L) {
                this.method11502(class9131);
            }
        }
        else {
            super.method11381(class9131);
            this.field17130 = Class8805.method30719(class9131.method33137(2));
            this.field17131 = class9131.method33141((int)this.method11491(class9131));
        }
    }
    
    public String method11485() {
        return this.field17130;
    }
    
    public String method11486() {
        return this.field17131;
    }
}
