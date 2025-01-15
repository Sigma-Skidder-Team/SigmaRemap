// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3806 extends Class3805
{
    private int field17317;
    
    public Class3806() {
        super("3GPP Album Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17317 = ((this.method11491(class9131) <= 0L) ? -1 : class9131.method33135());
    }
    
    public int method11655() {
        return this.field17317;
    }
}
