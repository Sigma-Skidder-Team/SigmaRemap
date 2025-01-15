// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3770 extends Class3736
{
    private byte[] field17229;
    
    public Class3770() {
        super("iTunes FairPlay Data Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        class9131.method33138(this.field17229 = new byte[(int)this.method11491(class9131)]);
    }
    
    public byte[] method11575() {
        return this.field17229;
    }
}
