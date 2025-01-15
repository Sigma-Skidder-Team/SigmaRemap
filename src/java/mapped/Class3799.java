// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3799 extends Class3703
{
    private long field17301;
    private int field17302;
    private long[] field17303;
    private long[] field17304;
    private long[] field17305;
    private long[] field17306;
    private long[] field17307;
    
    public Class3799() {
        super("Track Fragment Random Access Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17301 = class9131.method33137(4);
        final long method33137 = class9131.method33137(4);
        final int n = (int)(method33137 >> 4 & 0x3L) + 1;
        final int n2 = (int)(method33137 >> 2 & 0x3L) + 1;
        final int n3 = (int)(method33137 & 0x3L) + 1;
        this.field17302 = (int)class9131.method33137(4);
        final int n4 = (this.field17026 != 1) ? 4 : 8;
        for (int i = 0; i < this.field17302; ++i) {
            this.field17303[i] = class9131.method33137(n4);
            this.field17304[i] = class9131.method33137(n4);
            this.field17305[i] = class9131.method33137(n);
            this.field17306[i] = class9131.method33137(n2);
            this.field17307[i] = class9131.method33137(n3);
        }
    }
    
    public long method11638() {
        return this.field17301;
    }
    
    public int method11639() {
        return this.field17302;
    }
    
    public long[] method11640() {
        return this.field17303;
    }
    
    public long[] method11641() {
        return this.field17304;
    }
    
    public long[] method11642() {
        return this.field17305;
    }
    
    public long[] method11643() {
        return this.field17306;
    }
    
    public long[] method11644() {
        return this.field17307;
    }
}
