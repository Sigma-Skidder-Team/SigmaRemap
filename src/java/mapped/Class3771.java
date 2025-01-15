// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3771 extends Class3703
{
    private String field17230;
    
    public Class3771() {
        super("iTunes Metadata Name Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17230 = class9131.method33139((int)this.method11491(class9131));
    }
    
    public String method11576() {
        return this.field17230;
    }
}
