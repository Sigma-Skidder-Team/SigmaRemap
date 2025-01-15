// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public abstract class Class3737 extends Class3736
{
    private long field17141;
    private int field17142;
    
    public Class3737(final String s) {
        super(s);
    }
    
    public void method11504(final Class9131 class9131) throws IOException {
        this.field17141 = class9131.method33137(4);
        this.field17142 = class9131.method33135();
    }
    
    public long method11505() {
        return this.field17141;
    }
    
    public int method11506() {
        return this.field17142;
    }
}
