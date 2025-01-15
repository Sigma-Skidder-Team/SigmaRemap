// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3777 extends Class3703
{
    private byte[] field17251;
    
    public Class3777() {
        super("OMA DRM Rights Object Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        class9131.method33138(this.field17251 = new byte[(int)this.method11491(class9131)]);
    }
    
    public byte[] method11584() {
        return this.field17251;
    }
}
