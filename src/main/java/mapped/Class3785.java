// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3785 extends Class3703
{
    private int[] field17272;
    private int[] field17273;
    
    public Class3785() {
        super("Padding Bit Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (int)(class9131.method33137(4) + 1L) / 2;
        this.field17272 = new int[n];
        this.field17273 = new int[n];
        for (int i = 0; i < n; ++i) {
            final byte b = (byte)class9131.method33135();
            this.field17272[i] = (b >> 4 & 0x7);
            this.field17273[i] = (b & 0x7);
        }
    }
    
    public int[] method11609() {
        return this.field17272;
    }
    
    public int[] method11610() {
        return this.field17273;
    }
}
