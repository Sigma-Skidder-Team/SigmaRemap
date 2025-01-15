// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3754 extends Class3753
{
    private int field17177;
    private int field17178;
    private int field17179;
    private double field17180;
    
    public Class3754() {
        super("FD Hint Sample Entry");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17177 = (int)class9131.method33137(2);
        this.field17178 = (int)class9131.method33137(2);
        this.field17179 = (int)class9131.method33137(2);
        this.field17180 = class9131.method33143(8, 8);
        this.method11502(class9131);
    }
    
    public int method11541() {
        return this.field17179;
    }
    
    public double method11542() {
        return this.field17180;
    }
}
