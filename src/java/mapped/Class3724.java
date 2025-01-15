// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3724 extends Class3703
{
    private boolean field17100;
    private int field17101;
    private int field17102;
    
    public Class3724() {
        super("OMA DRM Access Unit Format Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17100 = ((class9131.method33135() >> 7 & 0x1) == 0x1);
        this.field17101 = class9131.method33135();
        this.field17102 = class9131.method33135();
    }
    
    public boolean method11454() {
        return this.field17100;
    }
    
    public int method11455() {
        return this.field17101;
    }
    
    public int method11456() {
        return this.field17102;
    }
}
