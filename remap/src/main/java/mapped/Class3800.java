// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3800 extends Class3703
{
    private String field17308;
    private byte[] field17309;
    
    public Class3800() {
        super("ID3 Tag Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17308 = Class8805.method30719(class9131.method33137(2));
        class9131.method33138(this.field17309 = new byte[(int)this.method11491(class9131)]);
    }
    
    public byte[] method11645() {
        return this.field17309;
    }
    
    public String method11646() {
        return this.field17308;
    }
}
