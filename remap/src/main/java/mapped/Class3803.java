// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3803 extends Class3703
{
    private String field17312;
    
    public Class3803(final String s) {
        super(s);
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final byte[] bytes = new byte[(int)this.method11491(class9131)];
        class9131.method33138(bytes);
        this.field17312 = new String(bytes, "UTF-8");
    }
    
    public String method11649() {
        return this.field17312;
    }
}
