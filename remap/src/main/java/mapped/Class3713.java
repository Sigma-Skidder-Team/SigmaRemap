// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3713 extends Class3703
{
    private int[] field17062;
    
    public Class3713() {
        super("Degradation Priority Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int method11688 = ((Class3815)this.field17139.method11499(1937011578L)).method11688();
        this.field17062 = new int[method11688];
        for (int i = 0; i < method11688; ++i) {
            this.field17062[i] = (int)class9131.method33137(2);
        }
    }
    
    public int[] method11417() {
        return this.field17062;
    }
}
