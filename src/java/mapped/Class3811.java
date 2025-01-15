// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3811 extends Class3703
{
    private boolean field17340;
    private int field17341;
    private int field17342;
    private int field17343;
    
    public Class3811() {
        super("Sample Scale Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17340 = ((class9131.method33135() & 0x1) == 0x1);
        this.field17341 = class9131.method33135();
        this.field17342 = (int)class9131.method33137(2);
        this.field17343 = (int)class9131.method33137(2);
    }
    
    public boolean method11678() {
        return this.field17340;
    }
    
    public int method11679() {
        return this.field17342;
    }
    
    public int method11680() {
        return this.field17343;
    }
    
    public int method11681() {
        return this.field17341;
    }
}
