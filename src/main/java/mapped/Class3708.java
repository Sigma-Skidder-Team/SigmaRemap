// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3708 extends Class3703
{
    private byte[] field17055;
    
    public Class3708() {
        super("OMA Content Object Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        class9131.method33138(this.field17055 = new byte[(int)class9131.method33137(4)]);
    }
    
    public byte[] method11410() {
        return this.field17055;
    }
}
