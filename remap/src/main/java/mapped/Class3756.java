// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3756 extends Class3755
{
    private String field17182;
    private String field17183;
    
    public Class3756() {
        super("XML Metadata Sample Entry");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17182 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
        this.field17183 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
    }
    
    public String method11544() {
        return this.field17182;
    }
    
    public String method11545() {
        return this.field17183;
    }
}
