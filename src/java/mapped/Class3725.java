// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3725 extends Class3703
{
    private long field17103;
    private long field17104;
    private long field17105;
    private long field17106;
    private String field17107;
    
    public Class3725() {
        super("Media Header Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (this.field17026 != 1) ? 4 : 8;
        this.field17103 = class9131.method33137(n);
        this.field17104 = class9131.method33137(n);
        this.field17105 = class9131.method33137(4);
        this.field17106 = Class8805.method30720(class9131.method33137(n));
        this.field17107 = Class8805.method30719(class9131.method33137(2));
        class9131.method33144(2L);
    }
    
    public long method11457() {
        return this.field17103;
    }
    
    public long method11458() {
        return this.field17104;
    }
    
    public long method11459() {
        return this.field17105;
    }
    
    public long method11460() {
        return this.field17106;
    }
    
    public String method11461() {
        return this.field17107;
    }
}
