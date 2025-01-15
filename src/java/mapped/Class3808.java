// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3808 extends Class3805
{
    private String[] field17320;
    
    public Class3808() {
        super("3GPP Keywords Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.method11652(class9131);
        final int method33135 = class9131.method33135();
        this.field17320 = new String[method33135];
        for (int i = 0; i < method33135; ++i) {
            this.field17320[i] = class9131.method33141(class9131.method33135());
        }
    }
    
    public String[] method11658() {
        return this.field17320;
    }
}
