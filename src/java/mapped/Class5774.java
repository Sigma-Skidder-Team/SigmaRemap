// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class5774 extends Class5775
{
    private static String[] field23621;
    private int field23622;
    private int field23623;
    private int field23624;
    private boolean field23625;
    private boolean field23626;
    private boolean field23627;
    private String field23628;
    
    @Override
    public void method17212(final Class9131 class9131) throws IOException {
        this.field23622 = (int)class9131.method33137(2);
        final int method33135 = class9131.method33135();
        this.field23625 = ((method33135 >> 7 & 0x1) == 0x1);
        this.field23626 = ((method33135 >> 6 & 0x1) == 0x1);
        this.field23623 = (method33135 & 0x1F);
        if (!this.field23625) {
            this.field23624 = -1;
        }
        else {
            this.field23624 = (int)class9131.method33137(2);
        }
        if (this.field23626) {
            this.field23628 = class9131.method33139(class9131.method33135());
        }
        this.method17221(class9131);
    }
    
    public int method17213() {
        return this.field23622;
    }
    
    public boolean method17214() {
        return this.field23625;
    }
    
    public int method17215() {
        return this.field23624;
    }
    
    public boolean method17216() {
        return this.field23626;
    }
    
    public String method17217() {
        return this.field23628;
    }
    
    public int method17218() {
        return this.field23623;
    }
}
