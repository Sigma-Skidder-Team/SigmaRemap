// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class5777 extends Class5775
{
    private static String[] field23665;
    private int field23666;
    private boolean field23667;
    private boolean field23668;
    private String field23669;
    private int field23670;
    private int field23671;
    private int field23672;
    private int field23673;
    private int field23674;
    
    @Override
    public void method17212(final Class9131 class9131) throws IOException {
        final int n = (int)class9131.method33137(2);
        this.field23666 = (n >> 6 & 0x3FF);
        this.field23667 = ((n >> 5 & 0x1) == 0x1);
        this.field23668 = ((n >> 4 & 0x1) == 0x1);
        if (!this.field23667) {
            this.field23670 = class9131.method33135();
            this.field23671 = class9131.method33135();
            this.field23672 = class9131.method33135();
            this.field23673 = class9131.method33135();
            this.field23674 = class9131.method33135();
        }
        else {
            this.field23669 = class9131.method33139(this.field23638 - 2);
        }
        this.method17221(class9131);
    }
    
    public int method17225() {
        return this.field23666;
    }
    
    public boolean method17226() {
        return this.field23668;
    }
    
    public boolean method17227() {
        return this.field23667;
    }
    
    public String method17228() {
        return this.field23669;
    }
    
    public boolean method17229() {
        return !this.field23667;
    }
    
    public int method17230() {
        return this.field23670;
    }
    
    public int method17231() {
        return this.field23671;
    }
    
    public int method17232() {
        return this.field23672;
    }
    
    public int method17233() {
        return this.field23673;
    }
    
    public int method17234() {
        return this.field23674;
    }
}
