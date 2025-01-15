// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3738 extends Class3737
{
    private int field17143;
    private int field17144;
    
    public Class3738() {
        super("H.263 Specific Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.method11504(class9131);
        this.field17143 = class9131.method33135();
        this.field17144 = class9131.method33135();
    }
    
    public int method11507() {
        return this.field17143;
    }
    
    public int method11508() {
        return this.field17144;
    }
}
