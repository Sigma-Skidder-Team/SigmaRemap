// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3757 extends Class3755
{
    private String field17184;
    
    public Class3757() {
        super("Text Metadata Sample Entry");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17184 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
    }
    
    public String method11546() {
        return this.field17184;
    }
}
