// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3741 extends Class3737
{
    private int field17158;
    private int field17159;
    private int field17160;
    
    public Class3741() {
        super("AMR Specific Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.method11504(class9131);
        this.field17158 = (int)class9131.method33137(2);
        this.field17159 = class9131.method33135();
        this.field17160 = class9131.method33135();
    }
    
    public int method11522() {
        return this.field17158;
    }
    
    public int method11523() {
        return this.field17159;
    }
    
    public int method11524() {
        return this.field17160;
    }
}
