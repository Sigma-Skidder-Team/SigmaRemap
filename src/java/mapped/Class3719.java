// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3719 extends Class3703
{
    private long field17089;
    private long field17090;
    private int field17091;
    
    public Class3719() {
        super("Meta Box Relation Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17089 = class9131.method33137(4);
        this.field17090 = class9131.method33137(4);
        this.field17091 = class9131.method33135();
    }
    
    public long method11443() {
        return this.field17089;
    }
    
    public long method11444() {
        return this.field17090;
    }
    
    public int method11445() {
        return this.field17091;
    }
}
