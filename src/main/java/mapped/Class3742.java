// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3742 extends Class3737
{
    private int field17161;
    
    public Class3742() {
        super("SMV Specific Structure");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.method11504(class9131);
        this.field17161 = class9131.method33135();
    }
    
    public int method11525() {
        return this.field17161;
    }
}
