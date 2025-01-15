// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3763 extends Class3736
{
    private long field17208;
    private long field17209;
    
    public Class3763() {
        super("Pixel Aspect Ratio Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.field17208 = class9131.method33137(4);
        this.field17209 = class9131.method33137(4);
    }
    
    public long method11566() {
        return this.field17208;
    }
    
    public long method11567() {
        return this.field17209;
    }
}
