// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.Arrays;

public class Class3815 extends Class3703
{
    private long field17349;
    private long[] field17350;
    
    public Class3815() {
        super("Sample Size Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final boolean b = this.field17137 == 1937013298L;
        int method33135;
        if (!b) {
            method33135 = (int)class9131.method33137(4);
        }
        else {
            class9131.method33144(3L);
            method33135 = class9131.method33135();
        }
        this.field17349 = class9131.method33137(4);
        this.field17350 = new long[(int)this.field17349];
        if (!b) {
            if (method33135 != 0) {
                Arrays.fill(this.field17350, method33135);
            }
            else {
                this.method11687(class9131, 4);
            }
        }
        else if (method33135 != 4) {
            this.method11687(class9131, method33135 / 8);
        }
        else {
            for (int n = 0; n < this.field17349; n += 2) {
                final int method33136 = class9131.method33135();
                this.field17350[n] = (method33136 >> 4 & 0xF);
                this.field17350[n + 1] = (method33136 & 0xF);
            }
        }
    }
    
    private void method11687(final Class9131 class9131, final int n) throws IOException {
        for (int n2 = 0; n2 < this.field17349; ++n2) {
            this.field17350[n2] = class9131.method33137(n);
        }
    }
    
    public int method11688() {
        return (int)this.field17349;
    }
    
    public long[] method11689() {
        return this.field17350;
    }
}
