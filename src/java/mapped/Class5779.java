// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class5779 extends Class5775
{
    private static String[] field23677;
    private int field23678;
    private boolean field23679;
    private String field23680;
    
    @Override
    public void method17212(final Class9131 class9131) throws IOException {
        final int n = (int)class9131.method33137(2);
        this.field23678 = (n >> 6 & 0x3FF);
        if (this.field23679 = ((n >> 5 & 0x1) == 0x1)) {
            this.field23680 = class9131.method33139(this.field23638 - 2);
        }
        this.method17221(class9131);
    }
    
    public int method17236() {
        return this.field23678;
    }
    
    public boolean method17237() {
        return this.field23679;
    }
    
    public String method17238() {
        return this.field23680;
    }
}
