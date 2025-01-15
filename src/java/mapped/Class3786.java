// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3786 extends Class3703
{
    private int[] field17274;
    private int[] field17275;
    private int[] field17276;
    
    public Class3786() {
        super("Sample Dependency Type Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        long n = -1L;
        if (this.field17139.method11498(1937011578L)) {
            n = ((Class3815)this.field17139.method11499(1937011578L)).method11688();
        }
        this.field17276 = new int[(int)n];
        this.field17275 = new int[(int)n];
        this.field17274 = new int[(int)n];
        for (int n2 = 0; n2 < n; ++n2) {
            final byte b = (byte)class9131.method33135();
            this.field17276[n2] = (b & 0x3);
            this.field17275[n2] = (b >> 2 & 0x3);
            this.field17274[n2] = (b >> 4 & 0x3);
        }
    }
    
    public int[] method11611() {
        return this.field17274;
    }
    
    public int[] method11612() {
        return this.field17275;
    }
    
    public int[] method11613() {
        return this.field17276;
    }
}
