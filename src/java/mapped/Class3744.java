// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3744 extends Class3737
{
    private int field17171;
    
    public Class3744() {
        super("QCELP Specific Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.method11504(class9131);
        this.field17171 = class9131.method33135();
    }
    
    public int method11535() {
        return this.field17171;
    }
}
