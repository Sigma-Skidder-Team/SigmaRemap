// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3723 extends Class3703
{
    private long field17096;
    private long field17097;
    private long field17098;
    private long field17099;
    
    public Class3723() {
        super("Hint Media Header Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17096 = class9131.method33137(2);
        this.field17097 = class9131.method33137(2);
        this.field17098 = class9131.method33137(4);
        this.field17099 = class9131.method33137(4);
        class9131.method33144(4L);
    }
    
    public long method11450() {
        return this.field17096;
    }
    
    public long method11451() {
        return this.field17097;
    }
    
    public long method11452() {
        return this.field17098;
    }
    
    public long method11453() {
        return this.field17099;
    }
}
