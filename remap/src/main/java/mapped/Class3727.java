// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3727 extends Class3703
{
    private byte[] field17109;
    
    public Class3727() {
        super("Binary XML Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        class9131.method33138(this.field17109 = new byte[(int)this.method11491(class9131)]);
    }
    
    public byte[] method11463() {
        return this.field17109;
    }
}
