// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3722 extends Class3703
{
    private String field17095;
    
    public Class3722() {
        super("Encoder Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        if (this.field17139.method11492() != 1768715124L) {
            super.method11381(class9131);
            this.field17095 = class9131.method33139((int)this.method11491(class9131));
        }
        else {
            this.method11502(class9131);
        }
    }
    
    public String method11449() {
        return this.field17095;
    }
}
