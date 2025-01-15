// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public abstract class Class3755 extends Class3753
{
    private String field17181;
    
    public Class3755(final String s) {
        super(s);
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17181 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
    }
    
    public String method11543() {
        return this.field17181;
    }
}
