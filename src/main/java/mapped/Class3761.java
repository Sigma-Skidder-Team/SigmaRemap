// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3761 extends Class3753
{
    private static String[] field17196;
    private int field17197;
    private int field17198;
    private int field17199;
    
    public Class3761(final String s) {
        super(s);
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        class9131.method33144(8L);
        this.field17197 = (int)class9131.method33137(2);
        this.field17198 = (int)class9131.method33137(2);
        class9131.method33144(2L);
        class9131.method33144(2L);
        this.field17199 = (int)class9131.method33137(2);
        class9131.method33144(2L);
        this.method11502(class9131);
    }
    
    public int method11555() {
        return this.field17197;
    }
    
    public int method11556() {
        return this.field17199;
    }
    
    public int method11557() {
        return this.field17198;
    }
}
