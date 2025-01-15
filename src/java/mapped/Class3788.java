// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3788 extends Class3703
{
    private double field17283;
    
    public Class3788() {
        super("Sound Media Header Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17283 = class9131.method33143(8, 8);
        class9131.method33144(2L);
    }
    
    public double method11620() {
        return this.field17283;
    }
}
