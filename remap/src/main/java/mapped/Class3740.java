// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3740 extends Class3737
{
    private int field17152;
    private int field17153;
    private int field17154;
    private int field17155;
    private int field17156;
    private boolean field17157;
    
    public Class3740() {
        super("AC-3 Specific Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        final long method33137 = class9131.method33137(3);
        this.field17152 = (int)(method33137 >> 22 & 0x3L);
        this.field17153 = (int)(method33137 >> 17 & 0x1FL);
        this.field17154 = (int)(method33137 >> 14 & 0x7L);
        this.field17155 = (int)(method33137 >> 11 & 0x7L);
        this.field17157 = ((method33137 >> 10 & 0x1L) == 0x1L);
        this.field17156 = (int)(method33137 >> 5 & 0x1FL);
    }
    
    public int method11516() {
        return this.field17152;
    }
    
    public int method11517() {
        return this.field17153;
    }
    
    public int method11518() {
        return this.field17154;
    }
    
    public int method11519() {
        return this.field17155;
    }
    
    public boolean method11520() {
        return this.field17157;
    }
    
    public int method11521() {
        return this.field17156;
    }
}
