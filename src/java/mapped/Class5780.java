// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class5780 extends Class5775
{
    private static String[] field23681;
    private int field23682;
    private int field23683;
    private int field23684;
    private boolean field23685;
    private long field23686;
    private long field23687;
    
    @Override
    public void method17212(final Class9131 class9131) throws IOException {
        this.field23682 = class9131.method33135();
        final int method33135 = class9131.method33135();
        this.field23683 = (method33135 >> 2 & 0x3F);
        this.field23685 = ((method33135 >> 1 & 0x1) == 0x1);
        this.field23684 = (int)class9131.method33137(3);
        this.field23686 = class9131.method33137(4);
        this.field23687 = class9131.method33137(4);
        this.method17221(class9131);
    }
    
    public int method17239() {
        return this.field23682;
    }
    
    public int method17240() {
        return this.field23683;
    }
    
    public boolean method17241() {
        return this.field23685;
    }
    
    public int method17242() {
        return this.field23684;
    }
    
    public long method17243() {
        return this.field23686;
    }
    
    public long method17244() {
        return this.field23687;
    }
}
