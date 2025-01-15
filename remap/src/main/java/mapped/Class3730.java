// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3730 extends Class3703
{
    private long field17121;
    private long field17122;
    private long field17123;
    private long field17124;
    private long field17125;
    
    public Class3730() {
        super("Track Extends Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17121 = class9131.method33137(4);
        this.field17122 = class9131.method33137(4);
        this.field17123 = class9131.method33137(4);
        this.field17124 = class9131.method33137(4);
        this.field17125 = class9131.method33137(4);
    }
    
    public long method11471() {
        return this.field17121;
    }
    
    public long method11472() {
        return this.field17122;
    }
    
    public long method11473() {
        return this.field17123;
    }
    
    public long method11474() {
        return this.field17124;
    }
    
    public int method11475() {
        return (int)(this.field17125 >> 24 & 0x3L);
    }
    
    public int method11476() {
        return (int)(this.field17125 >> 22 & 0x3L);
    }
    
    public int method11477() {
        return (int)(this.field17125 >> 20 & 0x3L);
    }
    
    public int method11478() {
        return (int)(this.field17125 >> 17 & 0x7L);
    }
    
    public boolean method11479() {
        return (this.field17125 >> 16 & 0x1L) == 0x1L;
    }
    
    public int method11480() {
        return (int)(this.field17125 & 0xFFFFL);
    }
}
