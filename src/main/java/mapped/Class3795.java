// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3795 extends Class3703
{
    private String field17295;
    
    public Class3795() {
        super("OMA DRM Discrete Media Headers Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17295 = class9131.method33139(class9131.method33135());
        this.method11502(class9131);
    }
    
    public String method11632() {
        return this.field17295;
    }
}
